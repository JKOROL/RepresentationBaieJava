package event;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import ihm.BoutonInfo;
import ihm.GestionSwitch;
import ihm.Fenetre;

/**
  *Classe qui gère le comportement de chaque bouton Info.
  *
  *
  *
  *@author J.KOROL
  */
  
public class BoutonInfoListener implements MouseListener
{
  private BoutonInfo info;
  private Fenetre f;

  public BoutonInfoListener(BoutonInfo info)
  {
    this.info=info;
    f=(Fenetre)this.info.getTopLevelAncestor();
  }

  public void mouseClicked(MouseEvent event) 
  {
    Fenetre f=(Fenetre)this.info.getTopLevelAncestor();
    new GestionSwitch(this.info.getSwitch(),f);
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