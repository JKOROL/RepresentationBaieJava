package ihm;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoutonAjSwitch extends JButton implements MouseListener
{

  public BoutonAjSwitch()
  {
    super("Ajouter Switch");
    this.addMouseListener(this);
  }
  //Méthode appelée lors du clic de souris
  public void mouseClicked(MouseEvent event) 
  {
    Fenetre fenetre=(Fenetre)this.getTopLevelAncestor();
    fenetre.gbc.gridy++;
    fenetre.panel.add(fenetre.creerSwitch(8,1),fenetre.gbc);
    fenetre.panel.revalidate();
  }

  //Méthode appelée lors du survol de la souris
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