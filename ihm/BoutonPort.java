package ihm;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import data.Port;
import event.PortListener;

public class BoutonPort extends JButton
{
  private Port port;

  public BoutonPort()
  {
    super();
    this.port=new Port();
    this.addMouseListener(new PortListener(this));
  }
  public BoutonPort(ImageIcon icon)
  {
    super(icon);
    this.port=new Port();
    this.addMouseListener(new PortListener(this));
  }

  public BoutonPort(Port port,ImageIcon icon)
  {
    super(icon);
    this.port=port;
    this.addMouseListener(new PortListener(this));
  }

}