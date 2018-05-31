
/**
 * Beschreiben Sie hier die Klasse PalindromNeuron.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PalindromNeuron implements Neuronen
{
    private Wagen _lock;
    private boolean _gross;
    
    public PalindromNeuron(boolean gross){
        _gross = gross;
    }
    
    public void eingangHinzufügen(Neuronen signal){
        _lock = signal.getAusgangswert();
    }
    
    public void palindromNeuron(){
        Wagen schaffner = _lock;
        while (schaffner.getNextWagen() != null){
            boolean istPalindrom;
            istPalindrom = istPalindrom(schaffner.getString());
            schaffner.setIstPalindrom(istPalindrom);
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
    * @param s ein beliebiger String ungleich null
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
          return istPalindrom(signal.substring(1,1));
        }
        else{
          return false;
        }
      }
    }
    
    public Wagen getAusgangswert(){
        return _lock;
    }
}
