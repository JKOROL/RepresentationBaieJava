package ihm;

import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.*;
import event.AnnulerListener;
import event.OkAjSwitchListener;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.lang.Exception;

/**
  *Classe qui gère l'interface utilisateur pour ajouter un Switch.
  *
  *
  *
  *@author J.KOROL
  */

public class AjoutSwitch extends JDialog
{

  /**
    *La fenêtre principale de l'application.
    *
    *@see Fenetre
    */
  private Fenetre fenetre;

  /**
    *Zone de texte pour les infos.
    *
    *
    */
  private JTextField infosField;

  /**
    *Zone de texte pour le nombre de ports.
    *
    *
    */
  private JTextField portsField;

  /**
    *Zone de texte pour le nombre de lignes.
    *
    *
    */
  private JTextField ligneField;

  /**
    *Zone de texte pour le nom du Switch.
    *
    *@see Switch
    */
  private JTextField nomField;

  public AjoutSwitch(Fenetre fenetre)
  {
    super(fenetre,"Ajouter un switch",true);
    this.setSize(400, 300);
    this.fenetre=fenetre;
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
    JButton okAjSwitch=new JButton("OK");
    okAjSwitch.addMouseListener(new OkAjSwitchListener(this));
    JButton annuler=new JButton("Annuler");
    annuler.addMouseListener(new AnnulerListener(this));
    panel.add(okAjSwitch);
    panel.add(annuler);
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
    panel.add(nomField);
    return panel;
  }

  public JPanel panelPorts()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nombre de ports : "));
    portsField=new JTextField(4);
    panel.add(portsField);
    return panel;
  }

  public JPanel panelLigne()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nombre de ligne : "));
    ligneField=new JTextField(4);
    panel.add(ligneField);
    return panel;
  }

  public JPanel panelInfos()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Infos : "));
    infosField=new JTextField(25);
    panel.add(infosField);
    return panel;
  }
  
  public Fenetre getFenetre()
  {
    return this.fenetre;
  }

  public Integer getNbPorts()
  {
    try
    {
      return new Integer(Integer.parseInt(portsField.getText()));
    }
    catch(Exception e)
    {
      return 8;
    }
  }

  public Integer getNbLigne()
  {
    try
    {
      return new Integer(Integer.parseInt(ligneField.getText()));
    }
    catch(Exception e)
    {
      return 1;
    }
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