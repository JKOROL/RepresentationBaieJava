package ihm;

import javax.swing.JButton;
import event.AjSwitchListener;


public class BoutonAjSwitch extends JButton
{

  public BoutonAjSwitch()
  {
    super("Ajouter Switch");
    this.addMouseListener(new AjSwitchListener(this));
  }
  
}