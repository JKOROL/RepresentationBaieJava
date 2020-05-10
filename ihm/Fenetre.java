package ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import event.ChoixBaieListener;

public class Fenetre extends JFrame
{
  ArrayList<Baie> listeBaie;
  Container cont;
  JScrollPane scrollPanel;
  JPanel menu;
  Baie baieActuelle;
  public GridBagConstraints gbc;
  private DefaultComboBoxModel<Baie> listeChoix;

  public Fenetre()
  {
    super();
    this.setTitle("Representation Baie Java");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cont= this.getContentPane();
    cont.setLayout(new BorderLayout());
    //
    listeBaie=new ArrayList<Baie>();
    baieActuelle= new Baie();
    listeBaie.add(baieActuelle);
    //
    initMenu();
    //
    JPanel arbrePanel=new JPanel();
    arbrePanel.add(Arbre());
    JScrollPane arbreScroll=new JScrollPane(arbrePanel);
    //
    scrollPanel=new JScrollPane(baieActuelle);
    //
    cont.add(menu,BorderLayout.NORTH);
    cont.add(scrollPanel,BorderLayout.CENTER);
    cont.add(arbreScroll,BorderLayout.WEST);
    this.setVisible(true);
  }

  public void initMenu()
  {
    JComboBox choixBaie= new JComboBox();
    listeChoix=(DefaultComboBoxModel<Baie>)choixBaie.getModel();
    for(Baie b:listeBaie)
    {
      listeChoix.addElement(b);
    }
    menu=new JPanel();
    menu.setLayout(new GridLayout(1,0,4,5));
    menu.add(choixBaie);
    menu.add(new BoutonAjBaie());
    menu.add(new JButton("Gerer Baie"));
    menu.add(new BoutonAjSwitch());
    menu.add(new JButton("Gerer Switch"));
    choixBaie.addActionListener(new ChoixBaieListener(choixBaie,this));
  }

  public Baie getBaie()
  {
    return baieActuelle;
  }

  public ArrayList<Baie> getListeBaie()
  {
    return listeBaie;
  }

  public void changeBaie(Baie nouvelleBaie)
  {
    this.baieActuelle=nouvelleBaie;
    scrollPanel.setViewportView(baieActuelle);
  }

  public void ajouterBaie(Baie nouvelleBaie)
  {
    this.listeBaie.add(nouvelleBaie);
  }

  public JTree Arbre(){
    DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Home");

    for(int i = 1; i < 3; i++)
    {
      DefaultMutableTreeNode baie = new DefaultMutableTreeNode("Baie n°"+i);

        for(int j = 1; j < 5; j++)
        {
          DefaultMutableTreeNode switcH = new DefaultMutableTreeNode("Switch n°" + j);
          for(int k = 1; k < 5; k++)
            switcH.add(new DefaultMutableTreeNode("Port n°" + k));
          baie.add(switcH);
        }
      racine.add(baie);
    }
    JTree arbre = new JTree(racine);
    arbre.setBackground(new Color(0,0,0,0));
    arbre.setRootVisible(false);
    return arbre;
  }

  public DefaultComboBoxModel<Baie> getListeChoix()
  {
    return this.listeChoix;
  }

  public String toString()
  {
    return "Je suis la fênetre.";
  }

}
