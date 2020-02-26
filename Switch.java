import java.util.ArrayList;

public class Switch
{
  private int nb_ports;
  private int nb_lignes;
  private ArrayList<Port> liste_port;
  private String infos;

  public Switch()
  {
    this.nb_ports = 16;
    this.nb_lignes = 2;
    this.liste_port = new ArrayList<Port>();
    this.infos = "Pas d'infos";
  }

  
}