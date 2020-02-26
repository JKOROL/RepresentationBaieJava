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

  public String get_infos()
  {
    return this.infos;
  }

  public boolean get_branche()
  {
    return this.branche;
  }

  public boolean get_prise()
  {
    return this.prise;
  }

  public boolean get_doubleur()
  {
    return this.doubleur;
  }

  public void set_infos(String infos)
  {
    this.infos = infos;
  }

  public void set_branche()
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

  public void set_prise()
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
  
  public void set_doubleur()
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