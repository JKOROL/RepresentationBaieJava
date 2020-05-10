package ihm;

import ihm.Fenetre;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.Color;

public class Arbre extends JTree
{
  private Fenetre f;
  DefaultMutableTreeNode racine;

  public Arbre(Fenetre f)
  {
    super();
    this.f=f;
    racine = new DefaultMutableTreeNode("Home");

    for(Baie b : f.getListeBaie())
    {
      DefaultMutableTreeNode baie = new DefaultMutableTreeNode(b);

        for(Switch s : b.getListeSwitch())
        {
          DefaultMutableTreeNode switcH = new DefaultMutableTreeNode(s);
          for(Port p : s.getListePort())
          {
            switcH.add(new DefaultMutableTreeNode(p));
          }
          baie.add(switcH);
        }
      racine.add(baie);
    }
    DefaultTreeModel model = new DefaultTreeModel(racine);
    this.setModel(model);
    this.setBackground(new Color(0,0,0,0));
    this.setRootVisible(false);
  }
}
