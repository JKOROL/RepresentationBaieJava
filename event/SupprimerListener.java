package event;

import javax.swing.JDialog;
import java.awt.event.*;
import interfaces.GetObjet;
import ihm.Fenetre;

/**
  * Classe qui gère le comportement des boutons Supprimer.
  *
  *
  *
  *@author J.KOROL
  */

public class SupprimerListener implements MouseListener
{
  JDialog dial;

  public SupprimerListener(JDialog dial)
  {
    this.dial=dial;
  }

  public void mouseClicked(MouseEvent event)
  {
    Object obj=((GetObjet)dial).getObj();
    String nomClass=obj.getClass().getName();
    Fenetre f =((GetObjet)dial).getFenetre();
    if(nomClass=="ihm.Switch")
    {
      f.getBaie().getListeSwitch().remove(obj);
      f.getBaie().refresh();
      f.changeBaie(f.getBaie());
    }
    else if(nomClass=="ihm.Baie")
    {
      f.getListeBaie().remove(obj);
      f.getListeChoix().removeElement(obj);
      f.changeBaie(f.getListeBaie().get(0));
      f.getChoixBaie().setSelectedItem(f.getBaie());
    }
    f.majArbre();
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
