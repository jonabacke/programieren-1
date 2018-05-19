/**
 * In Dieser Klasse wird Lotto gespielt.
 * Dafür werden die Methoden Auswahl, Naiv, und Permutation genutzt.
 * 
 * Autor: Jonathan Backes
 * Version: 18.05.2018
 */


class Lotto{
  private Zahlensack zahlensack;
  /**
   * In dieser Methode werden die drei Exemplare erstellt und in die 
   * Ausgabe geschickt.
   */
  public void sechsAus49(){
    zahlensack = new Auswahl(49);
    zahlenHoler(zahlensack, 6);
    zahlensack = new Naiv(49);
    zahlenHoler(zahlensack, 6);
    zahlensack = new Permutation(49);
    zahlenHoler(zahlensack, 6);
  }
  
  /**
   * In diese Methoden werden die Saecke übergeben und die anzahl wie oft zufällig 
   * Zahlen entnommen werden sollen. Schlieslich werden sie noch ausgegeben
   */
  public void zahlenHoler(Zahlensack zahlensack, int anzahl){
      for(int i = 0; i < anzahl; i++){
          System.out.print (zahlensack.entferneZahl()+", ");
      }
      System.out.println();
    }
}