public class Port
{
  private String infos;
  private boolean branche;
  private boolean prise;
  private boolean doubleur;

  public Port()
  {
    this.infos = "Pas d'infos";
    this.branche = false;
    this.prise = true;
    this.doubleur = false;
  }

  public Port(String infos, boolean branche, boolean prise, boolean doubleur)
  {
    this.infos = infos;
    this.branche = branche;
    this.prise = prise;
    this.doubleur = doubleur;
  }

  public String getInfos()
  {
    return this.infos;
  }

  public boolean getBranche()
  {
    return this.branche;
  }

  public boolean getPrise()
  {
    return this.prise;
  }

  public boolean getDoubleur()
  {
    return this.doubleur;
  }

  public void setInfos(String infos)
  {
    this.infos = infos;
  }

  public void setBranche()
  {
    if(this.prise)
    {
      this.branche = !this.branche;
    }
    else
    {
      System.out.println("Il n'y a pas de prise, impossible de brancher.");
    }
  }

  public void setPrise()
  {
    if(this.prise)
    {
      this.prise = false;
      this.branche = false;
      this.doubleur = false;
    }
    else
    {
      this.prise = true;
    }
  }
  
  public void setDoubleur()
  {
    if(this.prise)
    {
      if(this.doubleur)
      {
        this.doubleur = false;
        this.branche = false;
      }
      else
      {
        this.doubleur = true;
        this.branche = true;
      }
    }
    else
    {
      System.out.println("Il n'y a pas de prise, impossible de brancher.");
    }
  }
}