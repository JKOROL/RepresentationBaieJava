package event;

import javax.swing.JDialog;
import java.awt.event.*;

/**
  * Classe qui gère le comportement des boutons Annuler.
  *
  *
  *
  *@author J.KOROL
  */
  
public class AnnulerListener implements MouseListener
{
  JDialog dial;

  public AnnulerListener(JDialog dial)
  {
    this.dial=dial;
  }
  
  public void mouseClicked(MouseEvent event) 
  {
    dial.dispose();
  }

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