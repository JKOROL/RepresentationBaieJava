package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ihm.GestionSwitch;
import ihm.Switch;



public class OkGSwitchListener implements MouseListener
{
  private GestionSwitch gs;

  public OkGSwitchListener(GestionSwitch gs)
  {
    this.gs=gs;
  }

  public void mouseClicked(MouseEvent event) 
  {
    Switch s=gs.getSwitch();
    String newNom = gs.getNom();
    String infos = gs.getInfos();
    int ligne = gs.getNbLignes();
    int port = gs.getNbPorts();
    s.setNom(newNom);
    s.setInfos(infos);
    s.setNbLignes(ligne);
    s.setNbPorts(port);
    gs.getFenetre().getBaie().refresh();
    gs.getFenetre().changeBaie(gs.getFenetre().getBaie());
    gs.dispose();
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