package ihm;

import erreur.PriseException;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import event.PortListener;
import java.awt.Color;

/**
  *Classe qui gère l'affichage graphique d'un port ainsi que ses données. 
  *
  *
  *
  *@author J.KOROL
  */

public class Port extends JButton
{
  /**
    *Toutes les infos complémentaires sur le Port.
    *
    *
    */
  private String infos;

  /**
    *Boolean répresentant si le port a quelque chose de branché ou non.
    *
    *
    */
  private boolean branche;

  /**
    *Boolean répresentant si le port a une prise ou non.
    *
    *
    */
  private boolean prise;

  /**
    *Boolean répresentant si le port est relié à un doubleur ou non.
    *
    *
    */
  private boolean doubleur;

  /**
    *Le nom du Port.
    *
    *
    */
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
    this.setContentAreaFilled(false);
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
    this.setContentAreaFilled(false);
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

  public void setBranche(Boolean etat)
  {
    this.branche=etat;
  }

  public void setPrise(Boolean etat)
  {
    this.prise=etat;
  }
  
  public void setDoubleur(Boolean etat)
  {
    this.doubleur=etat;
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

  public String getAllInfos()
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

  public String toString()
  {
    return this.nom;
  }
}