package ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import event.ChoixBaieListener;

/**
  *Classe qui gère l'apparence de la fenêtre principale.
  *
  *
  *
  *@author J.KOROL
  */

public class Fenetre extends JFrame
{

  /**
    *La liste des baies de l'application
    *
    *@see Baie
    */
  private ArrayList<Baie> listeBaie;

  /**
    *Le Container principal de l'application.
    *
    *
    */
  private Container cont;

  /**
    *Le ScrollPane qui affiche la Baie choisie.
    *
    *@see Baie
    */
  private JScrollPane scrollPanel;

  /**
    *Le Panel qui contient tout le menu.
    *
    *
    */
  private JPanel menu;

  /**
    *La Baie choisie par l'utilisateur à afficher dans le scrollPanel.
    *
    *@see Baie
    */
  private Baie baieActuelle;

  /**
    *Le Panel qui contient l'arborescence des Baies.
    *
    *@see Arbre
    */
  private JPanel arbrePanel;

  /**
    *L'arborescence des Baies.
    *
    *@see Arbre
    */
  private Arbre arbre;

  /**
    *Le ScrollPane affichant l'arborescence des Baies.
    *
    *@see Arbre
    */
  private JScrollPane arbreScroll;

  /**
    *Le menu déroulant permettant de choisir quelle Baie afficher.
    *
    *@see Baie
    */
  private DefaultComboBoxModel<Baie> listeChoix;

  public Fenetre()
  {
    super();
    this.setTitle("Representation Baie Java");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cont= this.getContentPane();
    cont.setLayout(new BorderLayout());
    //Initialisation des Baies.
    initBaie();
    //Initialisation du Menu.
    initMenu();
    //Initialisation de l'arborescence.
    initArbre();
    //Initialisation de la vue sur la Baie choisie.
    scrollPanel=new JScrollPane(baieActuelle);
    //Ajout des divers élements au container principal.
    cont.add(menu,BorderLayout.NORTH);
    cont.add(scrollPanel,BorderLayout.CENTER);
    cont.add(arbreScroll,BorderLayout.WEST);
    this.setVisible(true);
  }

  public void initMenu()
  {
    JComboBox choixBaie= new JComboBox();
    listeChoix=(DefaultComboBoxModel<Baie>)choixBaie.getModel();
    for(Baie b:listeBaie)
    {
      listeChoix.addElement(b);
    }
    menu=new JPanel();
    menu.setLayout(new GridLayout(1,0,4,5));
    menu.add(choixBaie);
    menu.add(new BoutonAjBaie());
    menu.add(new BoutonGererBaie());
    menu.add(new BoutonAjSwitch());
    choixBaie.addActionListener(new ChoixBaieListener(choixBaie,this));
  }

  public void initArbre()
  {
    arbrePanel=new JPanel();
    arbre=new Arbre(this);
    arbrePanel.add(arbre);
    arbreScroll=new JScrollPane(arbrePanel);
  }

  public void initBaie()
  {
    listeBaie=new ArrayList<Baie>();
    baieActuelle= new Baie();
    listeBaie.add(baieActuelle);
  }

  public Baie getBaie()
  {
    return baieActuelle;
  }

  public ArrayList<Baie> getListeBaie()
  {
    return listeBaie;
  }

  public void changeBaie(Baie nouvelleBaie)
  {
    this.baieActuelle=nouvelleBaie;
    scrollPanel.setViewportView(baieActuelle);
  }

  public void ajouterBaie(Baie nouvelleBaie)
  {
    this.listeBaie.add(nouvelleBaie);
  }

  public DefaultComboBoxModel<Baie> getListeChoix()
  {
    return this.listeChoix;
  }

  public void majArbre()
  {
    arbre=new Arbre(this);
    arbrePanel=new JPanel();
    arbrePanel.add(arbre);
    arbreScroll.setViewportView(arbrePanel);

  }

  public String toString()
  {
    return "Je suis la fênetre.";
  }

}
