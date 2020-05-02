import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

class Fenetre extends JFrame
{
  public Fenetre()
  {
    this.setTitle("Representation Baie Java");
    this.setSize(400, 300);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cont= this.getContentPane();
    cont.setLayout(new BorderLayout());
    JPanel panel= new JPanel();
    cont.add(panel,BorderLayout.CENTER);
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
    panel.add(this.creerBaie(Color.WHITE));
    panel.add(this.creerBaie(Color.BLUE));
    panel.add(this.creerBaie(Color.GREEN));
    panel.add(this.creerBaie(Color.RED));
    panel.add(this.creerBaie(Color.BLUE));
    //panel.setBorder(new LineBorder(Color.WHITE,5));

    this.setVisible(true);
  }

  public JPanel creerBaie(Color couleur)
  {
    JPanel panel=new JPanel();
    panel.setBackground(couleur);
    panel.setBorder(new LineBorder(Color.BLACK,3));
    panel.setLayout(new BorderLayout());
    panel.add(new JPanel(),BorderLayout.CENTER);
    JPanel buttonPanel=new JPanel();
    buttonPanel.add(new JButton("infos"));
    panel.add(buttonPanel,BorderLayout.EAST);
    return panel;
  }
}
