package ihm;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import data.Port;

public class BoutonPort extends JButton implements MouseListener
{
  private Port port;
  private JOptionPane nonDev; 

  public BoutonPort()
  {
    super();
    this.port=new Port();
    this.addMouseListener(this);
    nonDev = new JOptionPane();
  }

  public BoutonPort(Port port,ImageIcon icon)
  {
    super(icon);
    this.port=port;
    this.addMouseListener(this);
    nonDev = new JOptionPane();
  }

  //Méthode appelée lors du clic de souris
  public void mouseClicked(MouseEvent event) 
  {
    System.out.println("J'ai cliqué un port.");
    nonDev.showMessageDialog(null,"Fonctionnalité non implémenté.","Erreur",JOptionPane.ERROR_MESSAGE);
  }

  //Méthode appelée lors du survol de la souris
  public void mouseEntered(MouseEvent event) 
  {

  }

  //Méthode appelée lorsque la souris sort de la zone du bouton
  public void mouseExited(MouseEvent event) 
  {

  }

  //Méthode appelée lorsque l'on presse le bouton gauche de la souris
  public void mousePressed(MouseEvent event) 
  {

  }

  //Méthode appelée lorsque l'on relâche le clic de souris
  public void mouseReleased(MouseEvent event) 
  {

  }   
}