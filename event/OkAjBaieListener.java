package event;

import javax.swing.JDialog;
import java.awt.event.*;
import ihm.Baie;
import ihm.AjoutBaie;
import ihm.Fenetre;

/**
  *Classe qui gère le comportement du bouton OK lors de l'ajout d'une Baie.
  *
  *
  *
  *@author J.KOROL
  */
  
public class OkAjBaieListener implements MouseListener
{
  Fenetre f;
  AjoutBaie dial;

  public OkAjBaieListener(AjoutBaie dial)
  {
    this.dial=dial;
    f=this.dial.getFenetre();
  }

  public void mouseClicked(MouseEvent event)
  {
    String nom =dial.getNom();
    if(nom.equals(""))
    {
      nom="Pas de nom";
    }
    Baie b=new Baie(nom,dial.getInfos());
    f.changeBaie(b);
    f.getListeChoix().addElement(b);
    f.ajouterBaie(b);
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
