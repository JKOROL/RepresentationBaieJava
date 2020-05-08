package event;

import javax.swing.JDialog;
import java.awt.event.*;
import ihm.AjoutSwitch;
import ihm.Fenetre;

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
      fenetre.gbc.gridy++;
    
      fenetre.panel.add(fenetre.creerSwitch(8,1),fenetre.gbc);
      fenetre.panel.revalidate();
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