package ihm;

import javax.swing.JButton;
import event.AjBaieListener;
public class BoutonAjBaie extends JButton
{
  public BoutonAjBaie()
  {
    super("Ajouter Baie");
    this.addMouseListener(new AjBaieListener(this));
  }
}