package ihm;

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import event.BoutonInfoListener;

public class Switch extends JPanel
{
  private String nom;
  private int nbPorts;
  private int nbLignes;
  private ArrayList<Port> listePort;
  private String infos;
  private BoutonInfo boutonInfo;

  public Switch()
  {
    super();
    this.nbPorts = 8;
    this.nbLignes = 1;
    this.listePort = new ArrayList<Port>();
    this.infos = "Pas d'infos";
    this.setBorder(new LineBorder(Color.BLACK,3));
    this.setLayout(new BorderLayout());
    boutonInfo=new BoutonInfo(this);
    boutonInfo.addMouseListener(new BoutonInfoListener(boutonInfo));
    this.add(boutonInfo,BorderLayout.EAST);
    initListePort(this.nbPorts);
    this.add(port(),BorderLayout.CENTER);
    this.nom="Pas de nom";
  }

  public Switch(int nbPorts,int nbLignes,ArrayList<Port> listePort,String infos,String nom)
  {
    super();
    this.setBorder(new LineBorder(Color.BLACK,3));
    this.setLayout(new BorderLayout());
    boutonInfo=new BoutonInfo(this);
    boutonInfo.addMouseListener(new BoutonInfoListener(boutonInfo));
    this.add(boutonInfo,BorderLayout.EAST);
    this.nbPorts = nbPorts;
    this.nbLignes = nbLignes;
    this.listePort = listePort;
    this.infos = infos;
    this.add(port(),BorderLayout.CENTER);
    this.nom=nom;
  }

  public Switch(int nbPorts,int nbLignes,String infos,String nom)
  {
    super();
    this.setBorder(new LineBorder(Color.BLACK,3));
    this.setLayout(new BorderLayout());
    boutonInfo=new BoutonInfo(this);
    boutonInfo.addMouseListener(new BoutonInfoListener(boutonInfo));
    this.add(boutonInfo,BorderLayout.EAST);
    this.nbPorts = nbPorts;
    this.nbLignes = nbLignes;
    this.listePort = new ArrayList<Port>();
    this.infos = infos;
    this.nom=nom;
    initListePort(this.nbPorts);
    this.add(port(),BorderLayout.CENTER);
  }

  public void initListePort(int nbPort)
  {
    for(int i=0;i<nbPort;i++)
    {
      listePort.add(new Port());
    }
  }

  public JPanel port()
  {
    JPanel port=new JPanel();
    port.setLayout(new GridLayout(nbLignes,0,4,0));
    for(Port p : listePort)
    {
      port.add(p);
    }

    return port;
  }

  public void setNom(String nom)
  {
    this.nom=nom;
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

  public Integer getNbPorts()
  {
    return new Integer(this.nbPorts);
  }

  public Integer getNbLignes()
  {
    return new Integer(this.nbLignes);
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

  public String getAllInfos()
  {
    return "Ce switch a "+Integer.toString(nbPorts)+" ports. Et voici les infos que nous avons : "+infos;
  }
  public String getNom()
  {
    return this.nom;
  }

  public String toString()
  {
    return this.nom;
  }

}