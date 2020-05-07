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
  ImageIcon info;
  ImageIcon ethernet;
  ImageIcon ethernetAbsent;
  ImageIcon ethernetBranche;
  ImageIcon ethernetDoubleur;
  Container cont;
  JScrollPane scrollPanel;
  JPanel menu;
  public JPanel switch1;
  public JPanel switch2;
  public JPanel switch3;
  public JPanel switch4;

  public Fenetre()
  {
    super();
    info = new ImageIcon("icon/info.png");
    ethernet = new ImageIcon("icon/ethernet.png");
    ethernetAbsent = new ImageIcon("icon/ethernetAbsent.png");
    ethernetBranche = new ImageIcon("icon/ethernetBranche.png");
    ethernetDoubleur = new ImageIcon("icon/ethernetDoubleur.png");
    this.setTitle("Representation Baie Java");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cont= this.getContentPane();
    cont.setLayout(new BorderLayout());
    JPanel panel= new JPanel();
    JPanel menu=new JPanel();
    cont.add(menu,BorderLayout.NORTH);
    menu.setLayout(new GridLayout(1,0,4,5));
    String liste[]={"Liste Baie","Baie 1","Baie 2","Baie 3"};
    JComboBox listeBaie= new JComboBox(liste);
    menu.add(listeBaie);
    menu.add(new JButton("Ajouter Baie"));
    menu.add(new JButton("Gerer Baie"));
    menu.add(new JButton("Ajouter Switch"));
    menu.add(new JButton("Gerer Switch"));
    panel.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    JPanel arbrePanel=new JPanel();
    arbrePanel.add(Arbre());
    JScrollPane arbreScroll=new JScrollPane(arbrePanel);
    scrollPanel=new JScrollPane(panel);
    cont.add(scrollPanel,BorderLayout.CENTER);
    cont.add(arbreScroll,BorderLayout.WEST);
    switch1=this.creerSwitch(8,1);
    switch2=this.creerSwitch(16,1);
    switch3=this.creerSwitch(16,2);
    switch4=this.creerSwitch(32,4);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    panel.add(switch1,gbc);
    gbc.gridy = 1;
    gbc.gridwidth=2;
    panel.add(switch2,gbc);
    gbc.gridy = 2;
    gbc.gridwidth=1;
    panel.add(switch3,gbc);
    gbc.gridy = 3;
    panel.add(switch4,gbc);
    this.setVisible(true);
  }

  public JPanel creerSwitch(int nbPort,int nbLigne)
  {
    JPanel panel=new JPanel();
    panel.setBorder(new LineBorder(Color.BLACK,3));
    panel.setLayout(new BorderLayout());
    JPanel panelPort=new JPanel();
    panelPort.add(port(nbPort,nbLigne));
    panel.add(panelPort,BorderLayout.CENTER);
    JPanel buttonPanel=new JPanel();
    JButton bouton=new JButton(this.info);
    bouton.setBorderPainted(false);
    bouton.setFocusPainted(false);
    bouton.setBackground(new Color(0,0,0,0));
    buttonPanel.add(bouton);
    panel.add(buttonPanel,BorderLayout.EAST);
    return panel;
  }

  public JPanel port(int nbPort,int nbLigne)
  {
    JPanel port=new JPanel();
    port.setLayout(new GridLayout(nbLigne,0,4,0));
    Port portPort=new Port();
    for(int i=0;i<nbPort;i++)
    {
      BoutonPort button=new BoutonPort();
      if(i%3==0)
      {
        button.setIcon(this.ethernet);
      }
      else if(i%2==0)
      {
        button.setIcon(this.ethernetAbsent);
      }
      else
      {
        button.setIcon(this.ethernetBranche);
      }
      port.add(button);
    }

    return port;
  }

  public JTree Arbre(){
    DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Home");

    for(int i = 1; i < 3; i++){
      DefaultMutableTreeNode baie = new DefaultMutableTreeNode("Baie n°"+i);


        for(int j = 1; j < 5; j++){
          DefaultMutableTreeNode switcH = new DefaultMutableTreeNode("Switch n°" + j);
          for(int k = 1; k < 5; k++)
            switcH.add(new DefaultMutableTreeNode("Port n°" + k));
          baie.add(switcH);
        }
      racine.add(baie);
    }
    JTree arbre = new JTree(racine);
    return arbre;
  }

}

