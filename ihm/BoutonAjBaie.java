package ihm;

import javax.swing.JButton;
import event.AjBaieListener;

/**
  *Classe qui gère le bouton pour ajouter une baie.
  *
  *
  *
  *@author J.KOROL
  */
  
public class BoutonAjBaie extends JButton
{
  public BoutonAjBaie()
  {
    super("Ajouter Baie");
    this.addMouseListener(new AjBaieListener(this));
  }
}