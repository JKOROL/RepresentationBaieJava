package data;

import java.util.ArrayList;

public class Baie
{
  private ArrayList<Switch> listeSwitch;
  private String infos;

  public Baie()
  {
    this.listeSwitch = new ArrayList<Switch>();
    this.infos = "Pas d'infos";
  }

  public Baie(ArrayList<Switch> listeSwitch,String infos)
  {
    this.listeSwitch = listeSwitch;
    this.infos = infos;
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

  public String toString()
  {
    return "Cette baie a "+Integer.toString(listeSwitch.size())+" switchs. Et voici les infos que nous avons : "+infos;
  }
}