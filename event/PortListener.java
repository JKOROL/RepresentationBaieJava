package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
  *Classe qui gère le comportement de chaque bouton représentant un port.
  *
  *
  *
  *@author J.KOROL
  */
  
public class PortListener implements MouseListener
{
  private JButton port;
  private JOptionPane nonDev;

  public PortListener(JButton port)
  {
    this.port=port;
    nonDev=new JOptionPane();
  }

  public void mouseClicked(MouseEvent event) 
  {
    nonDev.showMessageDialog(null,"Fonctionnalité non implémenté.","Erreur",JOptionPane.ERROR_MESSAGE);
  }

  public void mouseEntered(MouseEvent event) 
  {

  }

  public void mouseExited(MouseEvent event) 
  {

  }

  public void mousePressed(MouseEvent event) 
  {

  }

  public void mouseReleased(MouseEvent event) 
  {

  }
}