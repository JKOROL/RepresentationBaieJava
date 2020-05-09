package ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import data.Port;

public class Fenetre extends JFrame
{
  ImageIcon ethernet;
  ImageIcon ethernetAbsent;
  ImageIcon ethernetBranche;
  ImageIcon ethernetDoubleur;
  Container cont;
  JScrollPane scrollPanel;
  JPanel menu;
  public JPanel panel;
  public GridBagConstraints gbc;

  public Fenetre()
  {
    super();
    this.setTitle("Representation Baie Java");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cont= this.getContentPane();
    cont.setLayout(new BorderLayout());
    panel= new JPanel();
    JPanel menu=new JPanel();
    cont.add(menu,BorderLayout.NORTH);
    menu.setLayout(new GridLayout(1,0,4,5));
    String liste[]={"Liste Baie","Baie 1","Baie 2","Baie 3"};
    JComboBox listeBaie= new JComboBox(liste);
    menu.add(listeBaie);
    menu.add(new JButton("Ajouter Baie"));
    menu.add(new JButton("Gerer Baie"));
    menu.add(new BoutonAjSwitch());
    menu.add(new JButton("Gerer Switch"));
    panel.setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    JPanel arbrePanel=new JPanel();
    arbrePanel.add(Arbre());
    JScrollPane arbreScroll=new JScrollPane(arbrePanel);
    scrollPanel=new JScrollPane(panel);
    cont.add(scrollPanel,BorderLayout.CENTER);
    cont.add(arbreScroll,BorderLayout.WEST);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    this.setVisible(true);
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

  public String toString()
  {
    return "Je suis la fênetre.";
  }

}