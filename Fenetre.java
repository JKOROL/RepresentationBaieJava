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
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    Container cont= this.getContentPane();
    cont.setLayout(new BorderLayout());
    JPanel panel= new JPanel();
    cont.add(panel,BorderLayout.CENTER);
    cont.add(new JPanel(),BorderLayout.WEST);
    panel.setLayout(new GridLayout(0,1,4,10));
    panel.add(this.creerPanel(Color.WHITE));
    panel.add(this.creerPanel(Color.BLUE));
    panel.add(this.creerPanel(Color.GREEN));
    panel.add(this.creerPanel(Color.RED));
    //panel.setBorder(new LineBorder(Color.WHITE,5));
  }

  public JPanel creerPanel(Color couleur)
  {
    JPanel panel=new JPanel();
    panel.setBackground(couleur);
    panel.setBorder(new LineBorder(Color.BLACK,3));
    return panel;
  }
}
