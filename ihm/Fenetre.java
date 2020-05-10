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
  JPanel arbrePanel;
  Arbre arbre;
  JScrollPane arbreScroll;
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
    arbrePanel=new JPanel();
    arbre=new Arbre(this);
    arbrePanel.add(arbre);
    arbreScroll=new JScrollPane(arbrePanel);
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

  public DefaultComboBoxModel<Baie> getListeChoix()
  {
    return this.listeChoix;
  }

  public void majArbre()
  {
    arbreScroll.setViewportView(new JPanel());
    arbre=new Arbre(this);
    arbreScroll.setViewportView(arbre);
  }

  public String toString()
  {
    return "Je suis la fênetre.";
  }

}
