package ihm;

import javax.swing.JButton;
import event.GestionBaieListener;

/**
  *Classe qui gère le bouton pour gerer un Baie.
  *
  *
  *
  *@author J.KOROL
  */

public class BoutonGererBaie extends JButton
{

  public BoutonGererBaie()
  {
    super("Gerer Baie");
    this.addMouseListener(new GestionBaieListener(this));
  }

}
