package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ihm.GestionPort;
import ihm.Port;

/**
  *Classe qui gère le comportement du bouton OK lors de la modification d'un Port.
  *
  *
  *
  *@author J.KOROL
  */

public class OkGPortListener implements MouseListener
{
  private GestionPort gp;

  public OkGPortListener(GestionPort gp)
  {
    this.gp=gp;
  }

  public void mouseClicked(MouseEvent event)
  {
    Port p=gp.getPort();
    String newNom = gp.getNom();
    String infos = gp.getInfos();
    p.setNom(newNom);
    p.setInfos(infos);
    p.setPrise(gp.getPrise().isSelected());
    p.setBranche(gp.getBranche().isSelected());
    p.setDoubleur(gp.getDoubleur().isSelected());
    p.majIcone();
    gp.getFenetre().getBaie().refresh();
    gp.getFenetre().changeBaie(gp.getFenetre().getBaie());
    gp.getFenetre().majArbre();
    gp.dispose();
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
