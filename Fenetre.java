import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;

class Fenetre extends JFrame
{
  ImageIcon info;
  ImageIcon ethernet;
  ImageIcon ethernetAbsent;
  ImageIcon ethernetBranche;
  ImageIcon ethernetDoubleur;
  Container cont;
  JScrollPane scrollPanel;
  public Fenetre()
  {
    super();
    info = new ImageIcon("info.png");
    ethernet = new ImageIcon("ethernet.png");
    ethernetAbsent = new ImageIcon("ethernetAbsent.png");
    ethernetBranche = new ImageIcon("ethernetBranche.png");
    ethernetDoubleur = new ImageIcon("ethernetDoubleur.png");
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
    panel.setLayout(new GridLayout(0,1,4,10));
    JPanel arbrePanel=new JPanel();
    arbrePanel.add(Arbre());
    JScrollPane arbreScroll=new JScrollPane(arbrePanel);
    scrollPanel=new JScrollPane(panel);
    cont.add(scrollPanel,BorderLayout.CENTER);
    cont.add(arbreScroll,BorderLayout.WEST);
    int i =0;
    do
    {
      panel.add(this.creerSwitch(8,1));
      panel.add(this.creerSwitch(16,1));
      panel.add(this.creerSwitch(16,2));
      panel.add(this.creerSwitch(32,4));
      i++;
    }
    while(i<4);

    this.setVisible(true);
  }

  public JPanel creerSwitch(int nbPort,int nbLigne)
  {
    JPanel panel=new JPanel();
    panel.setBorder(new LineBorder(Color.BLACK,3));
    panel.setLayout(new BorderLayout());
    JPanel panelPort=new JPanel();
    panel.add(port(nbPort,nbLigne),BorderLayout.CENTER);
    JPanel buttonPanel=new JPanel();
    JButton bouton=new JButton(this.info);
    bouton.setBorderPainted(false);
    bouton.setFocusPainted(false);
    bouton.setBackground(new Color(0,0,0,0));
    buttonPanel.add(bouton);
    panel.add(buttonPanel,BorderLayout.EAST);
    Double largeur = this.scrollPanel.getSize().getWidth();
    Double hauteur = this.scrollPanel.getSize().getHeight()*0.2;
    panel.setMaximumSize(new Dimension(hauteur.intValue(),largeur.intValue()));
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
          //Cette fois, on ajoute les feuilles
          for(int k = 1; k < 5; k++)
            switcH.add(new DefaultMutableTreeNode("Port n°" + k));
          baie.add(switcH);
        }
      //On ajoute la feuille ou la branche à la racine
      racine.add(baie);
    }
    //Nous créons, avec notre hiérarchie, un arbre
    JTree arbre = new JTree(racine);
    return arbre;
  }

  public void getInfos()
  {
    System.out.println(cont.getSize());
    System.out.println(scrollPanel.getSize());
  }
}

