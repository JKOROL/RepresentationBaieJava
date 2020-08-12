package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import ihm.Fenetre;
import ihm.Baie;
import ihm.GestionBaie;

/**
  *Classe qui gère le comportement du bouton Gérer Baie du la fenêtre principale.
  *@see ihm.BoutonGererBaie
  *
  *
  *@author J.KOROL
  */

public class GestionBaieListener implements MouseListener
{
  JButton bouton;

  public GestionBaieListener(JButton bouton)
  {
    this.bouton=bouton;
  }

  public void mouseClicked(MouseEvent event)
  {
    Fenetre f=(Fenetre)bouton.getTopLevelAncestor();
    new GestionBaie(f);
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
