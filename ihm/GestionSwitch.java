package ihm;

import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.*;
import event.AnnulerListener;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.lang.Exception;
import event.OkGSwitchListener;

/**
  *Classe qui gère l'interface utilisateur lors de la gestion d'un Switch.
  *
  *
  *
  *@author J.KOROL
  */
  
public class GestionSwitch extends JDialog
{

  /**
    *Le Switch sur lequel la boite de dialogue peut effectuer des modifications.
    *
    *@see Switch
    */
  private Switch s;

  /**
    *La fênetre principale de l'application.
    *
    *@see Fenetre
    */
  private Fenetre fenetre;

  /**
    *La zone de texte où sont situés les infos sur le Switch.
    *
    *
    */
  private JTextField infosField;

  /**
    *La zone de texte où est situé le nombre de ports sur le Switch.
    *
    *@see Switch
    */
  private JTextField portsField;

  /**
    *La zone de texte où est situé le nombre de lignes sur le Switch.
    *
    *@see Switch
    */
  private JTextField ligneField;

  /**
    *La zone de texte où est situé le nom du Switch.
    *
    *@see Switch
    */
  private JTextField nomField;

  public GestionSwitch(Switch s,Fenetre fenetre)
  {
    super(fenetre,"Gestion Switch",true);
    this.s=s;
    this.fenetre=fenetre;
    this.setSize(400,300);
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
    JButton okGSwitch=new JButton("OK");
    okGSwitch.addMouseListener(new OkGSwitchListener(this));
    JButton annuler=new JButton("Annuler");
    annuler.addMouseListener(new AnnulerListener(this));
    JButton supprimer=new JButton("Supprimer");
    JPanel panelOkAnnuler=new JPanel();
    JPanel panelSupprimer=new JPanel();
    panelOkAnnuler.add(okGSwitch);
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
    panel.add(panelPorts());
    panel.add(panelLigne());
    panel.add(panelInfos());
    return panel;
  }

  public JPanel panelNom()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nom : "));
    nomField=new JTextField(25);
    nomField.setText(s.getNom());
    panel.add(nomField);
    return panel;
  }

  public JPanel panelPorts()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nombre de ports : "));
    portsField=new JTextField(4);
    portsField.setText(this.s.getNbPorts().toString());
    panel.add(portsField);
    return panel;
  }

  public JPanel panelLigne()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nombre de ligne : "));
    ligneField=new JTextField(4);
    ligneField.setText(this.s.getNbLignes().toString());
    panel.add(ligneField);
    return panel;
  }

  public JPanel panelInfos()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Infos : "));
    infosField=new JTextField(25);
    infosField.setText(this.s.getInfos());
    panel.add(infosField);
    return panel;
  }

  public Switch getSwitch()
  {
    return this.s;
  }

  public Fenetre getFenetre()
  {
    return this.fenetre;
  }

  public int getNbLignes()
  {
    return Integer.parseInt(ligneField.getText());
  }

  public int getNbPorts()
  {
    return Integer.parseInt(portsField.getText());
  }

  public String getNom()
  {
    return nomField.getText();
  }

  public String getInfos()
  {
    return infosField.getText();
  }
}