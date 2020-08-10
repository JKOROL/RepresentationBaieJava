package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import ihm.GestionPort;
import ihm.Fenetre;
import ihm.Port;

/**
  *Classe qui gère le comportement de chaque bouton représentant un port.
  *
  *
  *
  *@author J.KOROL
  */
  
public class PortListener implements MouseListener
{
  private Port port;

  public PortListener(Port port)
  {
    this.port=port;
  }

  public void mouseClicked(MouseEvent event) 
  {
    new GestionPort(port,(Fenetre)port.getTopLevelAncestor());
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