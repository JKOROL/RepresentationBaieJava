package event;

import javax.swing.JDialog;
import java.awt.event.*;
import ihm.AjoutSwitch;
import ihm.Fenetre;
import ihm.Switch;

public class OkAjSwitchListener implements MouseListener
{
  AjoutSwitch dial;

  public OkAjSwitchListener(AjoutSwitch dial)
  {
    this.dial=dial;
  }
  public void mouseClicked(MouseEvent event)
    {
      Fenetre fenetre=this.dial.getFenetre();
      fenetre.getBaie().getGbc().gridy++;
      double ratio=dial.getNbPorts().doubleValue()/dial.getNbLigne().doubleValue();
      if(ratio>8.0)
      {
        Double r=ratio/8;
        fenetre.getBaie().getGbc().gridwidth=r.intValue()+1;
      }
      else
      {
        fenetre.getBaie().getGbc().gridwidth=1;
      }
      Switch s=new Switch(dial.getNbPorts(),dial.getNbLigne(),dial.getInfos(),dial.getNom());
      fenetre.getBaie().getListeSwitch().add(s);
      fenetre.getBaie().add(s,fenetre.getBaie().getGbc());
      fenetre.getBaie().revalidate();
      fenetre.majArbre();
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
