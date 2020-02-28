import java.util.ArrayList;

public class Switch
{
  private int nbPorts;
  private int nbLignes;
  private ArrayList<Port> listePort;
  private String infos;

  public Switch()
  {
    this.nbPorts = 16;
    this.nbLignes = 2;
    this.listePort = new ArrayList<Port>();
    this.infos = "Pas d'infos";
  }

  public Switch(int nbPorts,int nbLignes,ArrayList<Port> listePort,String infos)
  {
    this.nbPorts = nbPorts;
    this.nbLignes = nbLignes;
    this.listePort = listePort;
    this.infos = infos;
  }

  public void setInfos(String infos)
  {
    this.infos=infos;
  }

  public void setNbLignes(int nbLignes)
  {
    this.nbLignes = nbLignes;
  }

  public void setNbPorts(int nbPorts)
  {
    this.nbPorts = nbPorts;
  }

  public void setListePort(ArrayList<Port> listePort)
  {
    this.listePort = listePort;
  }

  public int getNbPorts()
  {
    return this.nbPorts;
  }

  public int getNbLignes()
  {
    return this.nbLignes;
  }

  public ArrayList<Port> getListePort()
  {
    return this.listePort;
  }

  public String getInfos()
  {
    return this.infos;
  }

  public Port getPort(int numero)
  {
    return this.listePort.get(numero-1);
  }

}