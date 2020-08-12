package event;

import javax.swing.JDialog;
import java.awt.event.*;
import ihm.Baie;
import ihm.GestionBaie;
import ihm.Fenetre;

/**
  *Classe qui gère le comportement du bouton OK lors de l'ajout d'une Baie.
  *
  *
  *
  *@author J.KOROL
  */

public class OkGBaieListener implements MouseListener
{
  Fenetre f;
  GestionBaie dial;
  Baie baie;

  public OkGBaieListener(GestionBaie dial)
  {
    this.dial=dial;
    this.f=this.dial.getFenetre();
    this.baie=this.dial.getBaie();
  }

  public void mouseClicked(MouseEvent event)
  {
    String nom =dial.getNom();
    if(nom.equals(""))
    {
      nom="Pas de nom";
    }
    baie.setNom(nom);
    baie.setInfos(dial.getInfos());
    f.getListeChoix().removeElement(baie);
    f.getListeChoix().addElement(baie);
    f.changeBaie(baie);
    f.majArbre();
    f.getChoixBaie().setSelectedItem(baie);
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
