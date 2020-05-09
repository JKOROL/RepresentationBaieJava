package ihm;

import erreur.PriseException;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import event.PortListener;
import java.awt.Color;

public class Port extends JButton
{
  private String infos;
  private boolean branche;
  private boolean prise;
  private boolean doubleur;
  private String nom;

  public Port()
  {
    super();
    this.infos = "Pas d'infos";
    this.branche = false;
    this.prise = true;
    this.doubleur = false;
    this.nom="Pas de nom";
    this.majIcone();
    this.addMouseListener(new PortListener(this));
    this.setBorderPainted(false);
    this.setFocusPainted(false);
    this.setBackground(new Color(0,0,0,0));
  }

  public Port(String infos, boolean branche, boolean prise, boolean doubleur, String nom)
  {
    super();
    this.infos = infos;
    this.branche = branche;
    this.prise = prise;
    this.doubleur = doubleur;
    this.nom=nom;
    this.majIcone();
    this.addMouseListener(new PortListener(this));
    this.setBorderPainted(false);
    this.setFocusPainted(false);
    this.setBackground(new Color(0,0,0,0));
  }

  public String getInfos()
  {
    return this.infos;
  }

  public boolean getBranche()
  {
    return this.branche;
  }

  public boolean getPrise()
  {
    return this.prise;
  }

  public boolean getDoubleur()
  {
    return this.doubleur;
  }

  public String getNom()
  {
    return this.nom;
  }

  public void setNom(String nom)
  {
    this.nom=nom;
  }

  public void setInfos(String infos)
  {
    this.infos = infos;
  }

  public void setBranche() throws PriseException
  {
    if(this.prise)
    {
      this.branche = !this.branche;
    }
    else
    {
      System.out.println("Il n'y a pas de prise, impossible de brancher.");
      throw new PriseException();
    }
  }

  public void setPrise()
  {
    if(this.prise)
    {
      this.prise = false;
      this.branche = false;
      this.doubleur = false;
    }
    else
    {
      this.prise = true;
    }
  }
  
  public void setDoubleur() throws PriseException
  {
    if(this.prise)
    {
      if(this.doubleur)
      {
        this.doubleur = false;
        this.branche = false;
      }
      else
      {
        this.doubleur = true;
        this.branche = true;
      }
    }
    else
    {
      System.out.println("Il n'y a pas de prise, impossible de brancher.");
      throw new PriseException();
    }
  }

  public void majIcone()
  {
    if(this.prise)
    {
      if(this.branche)
      {
        if(this.doubleur)
        {
          this.setIcon(new ImageIcon("icon/ethernetDoubleur.png"));
        }
        else
        {
          this.setIcon(new ImageIcon("icon/ethernetBranche.png"));
        }
      }
      else
      {
        this.setIcon(new ImageIcon("icon/ethernet.png"));
      }
    }
    else
    {
      this.setIcon(new ImageIcon("icon/ethernetAbsent.png"));
    }
  }

  public String toString()
  {
    String s = "Ce port ";
    if(this.prise)
    {
      if(this.branche)
      {
        if(this.doubleur)
        {
          s = s + "a un doubleur de branché.";
        }
        else
        {
          s = s + "a un cable de branché.";
        }
      }
      else
      {
        s = s + "n'est pas branché.";
      }
    }
    else
    {
      s = s + "n'as pas de prise.";
    }
    s = s + " Et voici les infos que nous avons : " + infos;
    return s;
  }
}