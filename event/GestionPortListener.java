package event;

import ihm.GestionPort;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GestionPortListener implements ItemListener
{

  private GestionPort gestionPort;

  public GestionPortListener(GestionPort gestionPort)
  {
    this.gestionPort=gestionPort;
  }

  public void itemStateChanged(ItemEvent event)
  {
    JCheckBox box=(JCheckBox) event.getSource();
    if(box.getLabel()=="Prise")
    {
      if(gestionPort.getPrise().isSelected())
      {
        gestionPort.getBranche().setEnabled(true);
      }
      else
      {
        gestionPort.getBranche().setEnabled(false);
        gestionPort.getBranche().setSelected(false);
        gestionPort.getDoubleur().setSelected(false);
        gestionPort.getDoubleur().setEnabled(false);
      }
    }
    else if(box.getLabel()=="Branché")
    {
      if(gestionPort.getBranche().isSelected())
      {
        gestionPort.getDoubleur().setEnabled(true);
      }
      else
      {
        gestionPort.getDoubleur().setSelected(false);
        gestionPort.getDoubleur().setEnabled(false);
      }
    }
  }
}