package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import ihm.Fenetre;
import ihm.Baie;

public class AjBaieListener implements MouseListener
{
  JButton bouton;

  public AjBaieListener(JButton bouton)
  {
    this.bouton=bouton;
  }

  public void mouseClicked(MouseEvent event) 
  {
    Fenetre f=(Fenetre)bouton.getTopLevelAncestor();
    f.changeBaie(new Baie());
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