package ihm;

import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.Container;
import javax.swing.JButton;
import event.AnnulerListener;
import event.OkGBaieListener;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import event.SupprimerListener;
import interfaces.GetObjet;

/**
  *Classe qui gère l'interface utilisateur pour gerer une Baie.
  *@see Baie
  *
  *
  *@author J.KOROL
  */

public class GestionBaie extends JDialog implements GetObjet
{

  /**
    *La fenêtre pricipale de l'application
    *
    *@see Fenetre
    */
  private Fenetre fenetre;

  /**
    *Zone de texte pour les infos
    *
    *
    */
  private JTextField infosField;

  /**
    *Zone de texte pour le nom
    *
    *
    */
  private JTextField nomField;

  /**
    *Baie qui est en train d'être consulté
    *
    *
    */
  private Baie baie;

  public GestionBaie(Fenetre fenetre)
  {
    super(fenetre,"Gerer une baie",true);
    this.fenetre=fenetre;
    this.baie = fenetre.getBaie();
    this.setSize(400, 300);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    init();
    this.setVisible(true);
  }

  public void init()
  {
    Container cont =this.getContentPane();
    cont.setLayout(new BorderLayout());
    cont.add(panelBouton(),BorderLayout.SOUTH);
    cont.add(panelData(),BorderLayout.CENTER);
  }

  public JPanel panelBouton()
  {
    JPanel panel=new JPanel();
    panel.setLayout(new BorderLayout());
    JButton okGBaie=new JButton("OK");
    okGBaie.addMouseListener(new OkGBaieListener(this));
    JButton annuler=new JButton("Annuler");
    annuler.addMouseListener(new AnnulerListener(this));
    JButton supprimer=new JButton("Supprimer");
    supprimer.addMouseListener(new SupprimerListener(this));
    JPanel panelOkAnnuler=new JPanel();
    JPanel panelSupprimer=new JPanel();
    panelOkAnnuler.add(okGBaie);
    panelOkAnnuler.add(annuler);
    panelSupprimer.add(supprimer);
    panel.add(panelOkAnnuler,BorderLayout.WEST);
    panel.add(panelSupprimer,BorderLayout.EAST);
    return panel;
  }


  public JPanel panelData()
  {
    JPanel panel=new JPanel();
    panel.setLayout(new GridLayout(0,1));
    panel.add(panelNom());
    panel.add(panelInfos());
    return panel;
  }

  public JPanel panelNom()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nom : "));
    nomField=new JTextField(25);
    nomField.setText(this.baie.toString());
    panel.add(nomField);
    return panel;
  }

  public JPanel panelInfos()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Infos : "));
    infosField=new JTextField(25);
    infosField.setText(this.baie.getInfos());
    panel.add(infosField);
    return panel;
  }

  public String getNom()
  {
    return nomField.getText();
  }
  public String getInfos()
  {
    return infosField.getText();
  }
  public Fenetre getFenetre()
  {
    return fenetre;
  }
  public Baie getBaie()
  {
    return this.baie;
  }
  public Baie getObj()
  {
    return this.baie;
  }
}
