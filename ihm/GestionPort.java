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
import javax.swing.JCheckBox;
import ihm.Fenetre;
import event.GestionPortListener;
import event.OkGPortListener;

public class GestionPort extends JDialog
{
  private Port port;

  private Fenetre fenetre;

  private JTextField nomField;

  private JTextField infosField;

  private JCheckBox prise;

  private JCheckBox branche;

  private JCheckBox doubleur;

  public GestionPort(Port port,Fenetre fenetre)
  {
    super();
    this.port=port;
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
    JButton okGPort=new JButton("OK");
    okGPort.addMouseListener(new OkGPortListener(this));
    JButton annuler=new JButton("Annuler");
    annuler.addMouseListener(new AnnulerListener(this));
    panel.add(okGPort);
    panel.add(annuler);
    return panel;
  }

  public JPanel panelData()
  {
    JPanel panel=new JPanel();
    panel.setLayout(new GridLayout(0,1));
    panel.add(panelNom());
    panel.add(panelInfos());
    panel.add(panelBox());
    return panel;
  }

  public JPanel panelNom()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Nom : "));
    nomField=new JTextField(25);
    nomField.setText(port.getNom());
    panel.add(nomField);
    return panel;
  }

  public JPanel panelInfos()
  {
    JPanel panel=new JPanel();
    panel.add(new JLabel("Infos : "));
    infosField=new JTextField(25);
    infosField.setText(this.port.getInfos());
    panel.add(infosField);
    return panel;
  }

  public JPanel panelBox()
  {
    GestionPortListener listener=new GestionPortListener(this);
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0,1));
    prise=new JCheckBox("Prise",port.getPrise());
    prise.addItemListener(listener);
    panel.add(prise);
    branche = new JCheckBox("Branché",port.getBranche());
    branche.setEnabled(prise.isSelected());
    branche.addItemListener(listener);
    panel.add(branche);
    doubleur = new JCheckBox("Doubleur",port.getDoubleur());
    doubleur.setEnabled(branche.isSelected());
    doubleur.addItemListener(listener);
    panel.add(doubleur);
    return panel;

  }

  public Port getPort()
  {
    return this.port;
  }
  public Fenetre getFenetre()
  {
    return this.fenetre;
  }
  public String getNom()
  {
    return this.nomField.getText();
  }
  public String getInfos()
  {
    return this.infosField.getText();
  }
  public JCheckBox getPrise()
  {
    return this.prise;
  }
  public JCheckBox getBranche()
  {
    return this.branche;
  }
  public JCheckBox getDoubleur()
  {
    return this.doubleur;
  }
}