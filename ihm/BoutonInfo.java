package ihm;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
  *Classe qui gère le bouton info pour chacun des Switch.
  *
  *
  *
  *@author J.KOROL
  */
  
public class BoutonInfo extends JButton
{

  /**
    *L'icone représentant le bouton info
    *
    *
    */
  ImageIcon info;

  /**
    *Le Switch associé au bouton
    *
    *@see Switch
    */
  Switch s;

  public BoutonInfo(Switch s)
  {
    super();
    this.s=s;
    info=new ImageIcon("icon/info.png");
    this.setIcon(info);
    this.setBorderPainted(false);
    this.setFocusPainted(false);
    this.setContentAreaFilled(false);
    this.setBackground(new Color(0,0,0,0));
  }

  public Switch getSwitch()
  {
    return this.s;
  }

}