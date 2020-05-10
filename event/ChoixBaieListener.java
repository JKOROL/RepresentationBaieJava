package event;

import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ihm.Baie;
import ihm.Fenetre;

public class ChoixBaieListener implements ActionListener
{
  private JComboBox choixBaie;
  private Fenetre f;

  public ChoixBaieListener(JComboBox choixBaie,Fenetre f)
  {
    this.choixBaie=choixBaie;
    this.f=f;
  }

  public void actionPerformed(ActionEvent e)
  {
    Baie b=(Baie)choixBaie.getSelectedItem();
    Baie b1=f.getBaie();
    if(b!=b1)
    {
      f.changeBaie(b);
    }
  }
}
