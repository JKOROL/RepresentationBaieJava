package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import ihm.Fenetre;
import ihm.AjoutSwitch;

/**
  *Classe qui gère le comportement du bouton Ajouter Switch de la fênetre principale.
  *
  *
  *
  *@author J.KOROL
  */
  
public class AjSwitchListener implements MouseListener
{
  JButton bouton;

  public AjSwitchListener(JButton bouton)
  {
    this.bouton=bouton;
  }

  public void mouseClicked(MouseEvent event) 
  {
    new AjoutSwitch((Fenetre)bouton.getTopLevelAncestor());
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