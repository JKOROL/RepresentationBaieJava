package ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.*;
import event.AnnulerListener;
import event.OkAjSwitchListener;
import java.awt.BorderLayout;

public class AjoutSwitch extends JDialog implements MouseListener
{
  private Fenetre fenetre;

  public AjoutSwitch(Fenetre fenetre)
  {
    super(fenetre,"Ajouter un switch",true);
    this.setSize(200, 80);
    this.fenetre=fenetre;
    this.setLocationRelativeTo(null);
    
    this.setResizable(false);
    init();
    this.setVisible(true);
  }

  public void init()
  {
    Container cont =this.getContentPane();
    cont.setLayout(new BorderLayout());
    JPanel panel=new JPanel();
    JButton okAjSwitch=new JButton("OK");
    okAjSwitch.addMouseListener(new OkAjSwitchListener(this));
    JButton annuler=new JButton("Annuler");
    annuler.addMouseListener(new AnnulerListener(this));
    panel.add(okAjSwitch);
    panel.add(annuler);
    cont.add(panel,BorderLayout.SOUTH);
    panel.revalidate();
  }
    public void mouseClicked(MouseEvent event) 
    {
      System.out.println("ça marche");
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
  
  public Fenetre getFenetre()
  {
    return this.fenetre;
  }

}