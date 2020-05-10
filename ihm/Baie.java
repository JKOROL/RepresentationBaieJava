package ihm;

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Baie extends JPanel
{
  private ArrayList<Switch> listeSwitch;
  private String infos;
  private GridBagConstraints gbc;
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

  public void setListeSwitch(ArrayList<Switch> listeSwitch)
  {
    this.listeSwitch = listeSwitch;
  }

  public void setInfos(String infos)
  {
    this.infos = infos;
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
