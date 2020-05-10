package ihm;

import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.Container;
import javax.swing.JButton;
import event.AnnulerListener;
import event.OkAjBaieListener;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class AjoutBaie extends JDialog
{
  private Fenetre fenetre;
  private JTextField infosField;
  private JTextField nomField;

  public AjoutBaie(Fenetre fenetre)
  {
    super(fenetre,"Ajouter une baie",true);
    this.fenetre=fenetre;
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
    JButton okAjBaie=new JButton("OK");
    okAjBaie.addMouseListener(new OkAjBaieListener(this));
    JButton annuler=new JButton("Annuler");
    annuler.addMouseListener(new AnnulerListener(this));
    panel.add(okAjBaie);
    panel.add(annuler);
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
    panel.add(nomField);
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
}