class Main {
  public static void main(String[] args) {
    Port portVide=new Port();
    System.out.println(portVide.getInfos());
    Baie baieVide=new Baie();
    Switch switchVide=new Switch();
    System.out.println(switchVide);
    System.out.println(portVide);
    portVide.setDoubleur();
    System.out.println(portVide);
    portVide.setDoubleur();
    portVide.setBranche();
    System.out.println(portVide);
    portVide.setPrise();
    System.out.println(portVide);
    System.out.println(baieVide);
  }
}