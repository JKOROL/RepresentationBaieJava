package ihm;

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
  *Classe qui gère l'affichage graphique de chaque Baie ainsi que ses données.
  *
  *
  *
  *@author J.KOROL
  */

public class Baie extends JPanel
{

  /**
    *La liste des Switch contenu dans la Baie.
    *
    *@see Switch
    */
  private ArrayList<Switch> listeSwitch;

  /**
    *Toutes les informations complémentaires sur la Baie.
    *
    *
    */
  private String infos;

  private GridBagConstraints gbc;

  /**
    *Le nom de la Baie.
    *
    *
    */
  private String nom;

  public Baie()
  {
    super();
    this.listeSwitch = new ArrayList<Switch>();
    this.infos = "Pas d'infos";
    this.setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    this.nom = "Pas de nom";
  }

  public Baie(String nom,String infos)
  {
    super();
    this.listeSwitch = new ArrayList<Switch>();
    this.infos = infos;
    this.setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    this.nom = nom;
    initSwitch();
  }

  public Baie(ArrayList<Switch> listeSwitch,String infos,String nom)
  {
    super();
    this.listeSwitch = listeSwitch;
    this.infos = infos;
    this.setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    this.nom = nom;
    initSwitch();
  }

  public void initSwitch()
  {
    for(Switch s : listeSwitch)
    {
      gbc.gridy++;
      double ratio=s.getNbPorts().doubleValue()/s.getNbLignes().doubleValue();
      if(ratio>8.0)
      {
        Double r=ratio/8;
        gbc.gridwidth=r.intValue()+1;
      }
      else
      {
        gbc.gridwidth=1;
      }
      this.add(s,gbc);
    }
  }

  public void refresh()
  {
    this.removeAll();
    this.setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    initSwitch();
  }

  public void setListeSwitch(ArrayList<Switch> listeSwitch)
  {
    this.listeSwitch = listeSwitch;
  }

  public void setInfos(String infos)
  {
    this.infos = infos;
  }

  public void setNom(String nom)
  {
    this.nom=nom;
  }

  public ArrayList<Switch> getListeSwitch()
  {
    return this.listeSwitch;
  }

  public String getInfos()
  {
    return this.infos;
  }

  public Switch getSwitch(int numero)
  {
    return this.listeSwitch.get(numero-1);
  }

  public GridBagConstraints getGbc()
  {
    return gbc;
  }

  public String getAllInfos()
  {
    return "Cette baie a "+Integer.toString(listeSwitch.size())+" switchs. Et voici les infos que nous avons : "+infos;
  }

  public String toString()
  {
    return nom;
  }

}
