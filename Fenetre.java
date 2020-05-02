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
  public Fenetre()
  {
    super();
    info = new ImageIcon("info.png");
    this.setTitle("Representation Baie Java");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cont= this.getContentPane();
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
    int i =0;
    do
    {
      panel.add(this.creerSwitch(Color.WHITE,12));
      panel.add(this.creerSwitch(Color.BLUE,8));
      panel.add(this.creerSwitch(Color.GREEN,16));
      panel.add(this.creerSwitch(Color.RED,24));
      i++;
    }
    while(i<4);
    JPanel arbrePanel=new JPanel();
    arbrePanel.add(Arbre());
    JScrollPane arbreScroll=new JScrollPane(arbrePanel);
    JScrollPane scrollpanel=new JScrollPane(panel);
    cont.add(scrollpanel,BorderLayout.CENTER);
    cont.add(arbreScroll,BorderLayout.WEST);
    //panel.setBorder(new LineBorder(Color.WHITE,5));

    this.setVisible(true);
  }

  public JPanel creerSwitch(Color couleur,int nbPort)
  {
    JPanel panel=new JPanel();
    panel.setBorder(new LineBorder(Color.BLACK,3));
    panel.setLayout(new BorderLayout());
    JPanel panelPort=new JPanel();
    panel.add(port(couleur,nbPort),BorderLayout.CENTER);
    JPanel buttonPanel=new JPanel();
    buttonPanel.add(new JButton("infos",this.info));
    panel.add(buttonPanel,BorderLayout.EAST);
    return panel;
  }

  public JPanel port(Color couleur,int nbPort)
  {
    JPanel port=new JPanel();
    port.setLayout(new GridLayout(1,0,4,0));
    port.setBackground(couleur);
    for(int i=0;i<nbPort;i++)
    {
      JButton button =new JButton("#"+(i+1));
      if(i%3==0)
      {
        button.setBackground(Color.RED);
      }
      else if(i%2==0)
      {
        button.setBackground(Color.GREEN);
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
}

