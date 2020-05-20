package ihm;

import javax.swing.JButton;
import event.AjSwitchListener;

/**
  *Classe qui gère le bouton pour ajouter un Switch.
  *
  *
  *
  *@author J.KOROL
  */

public class BoutonAjSwitch extends JButton
{

  public BoutonAjSwitch()
  {
    super("Ajouter Switch");
    this.addMouseListener(new AjSwitchListener(this));
  }
  
}