import javax.swing.JFrame;

class Fenetre extends JFrame
{
  public Fenetre()
  {
    this.setTitle("Representation Baie Java");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
  }
}