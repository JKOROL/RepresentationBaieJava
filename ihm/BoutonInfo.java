package ihm;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class BoutonInfo extends JButton
{
  ImageIcon info;

  public BoutonInfo()
  {
    super();
    info=new ImageIcon("icon/info.png");
    this.setIcon(info);
    this.setBorderPainted(false);
    this.setFocusPainted(false);
    this.setBackground(new Color(0,0,0,0));
  }

}