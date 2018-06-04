
/**
 * In dieser Klasse werden die Strings, die in den einzelnen Listenelementen
 * sind auf palindrom geprüft
 * 
 * @author Jonathan Backes
 * @version 31.05.2018
 */
public class PalindromNeuron implements Neuronen
{
    private Wagen _lock;
    private boolean _gross;
    
    /**
     * im Konstruktor wird übergeben ob gross- und kleinschreibung beachtet
     * werden soll
     * 
     * @param gross true fuer soll beachtet werden fals fuer soll nicht 
     * beachtet werden 
     */
    public PalindromNeuron(boolean gross){
        _gross = gross;
    }
    
    /**
     * In dieser Methode wird ein neues Signal in die Liste eingefügt
     * 
     * @param signal Signal aus dem Signalneuron
     */
    public void eingangHinzufügen(Neuronen signal){
        _lock = signal.getAusgangswert();
    }
    
    /**
     * Bei dieser Methode werden die Strings aus dem Listenelement geholt in
     * den Palindrompruefer geworfen und das Ergebniss in das Listenelement 
     * geschrieben
     */
    public void palindromNeuron(){
        Wagen schaffner = _lock;
        while (schaffner != null){
            boolean istPalindrom;
            istPalindrom = istPalindrom(schaffner.getString());
            schaffner.setBool(istPalindrom);
            schaffner = schaffner.getNextWagen();
        }
    }
    
    /**
    * Gibt an, ob die Zeichenkette ein Palindrom ist. Auswertungen:
    *
    * istPalindrom("anna") -> istPalindrom("nn") -> istPalindrom("") -> true
    * istPalindrom("asta") -> istPalindrom("st") -> false
    * istPalindrom("axa") -> istPalindrom("x") -> true
    * istPalindrom("xyz") -> false
    * @param signal ein beliebiger String ungleich null
    */
    private boolean istPalindrom(String signal)
    {
      if (!_gross){
        signal = signal.toLowerCase();
      }
      if (signal.length() <= 1) {
        return true;
      }
      else {
        if (signal.charAt(0) == signal.charAt(signal.length()-1)) {
          return istPalindrom(signal.substring(1,signal.length()-1));
        }
        else{
          return false;
        }
      }
    }
    
    /**
     * Referenz auf das erste Listenobjekt
     * 
     * @return Wagen erster Wagen der Liste
     */
    public Wagen getAusgangswert(){
        return _lock;
    }
}
