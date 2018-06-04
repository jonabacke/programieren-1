
/**
 * In dieser Klasse werden die verschiedenen Signale aneinander gereiht
 * und ausgegeben
 * 
 * @author Jonathan Backes
 * @version 31.05.2018
 */
public class KonkatenationNeuron 
{
    private String _string;
    private Wagen _wagen;
    private Zug _zug;
    
    /**
     * Im Konstruktor wird der Anfang der Liste erstellt die später alle 
     * eingegebenen Signale beinhaltet
     * 
     */
    public KonkatenationNeuron(){
        _string = "";
        _zug = new Zug(_string);
    }
    
    /**
     * In dieser Methode wird ein neues Signal in die Liste eingefügt
     * 
     * @param signal Signal aus dem Signalneuron
     */
    public void eingangHinzufügen(Neuronen signal){
        Wagen wagen = signal.getAusgangswert();
        Zug neuZug = dublizieren(wagen);
        _wagen = _zug.getLastWagen();
        _wagen.setNextWagen(neuZug.getLock());
    }
    
    /**
     * Referenz auf das erste Listenobjekt
     * 
     * @return Wagen erster Wagen der Liste
     */
    public Wagen getAusgangswert(){
        return _zug.getLock();
    }
    
    /**
     * Mit dieser Methode werden alle Palindrome aus der Liste ausgegeben
     * und zurückgegeben
     * 
     * @return String String mit allen Palindromen
     */
    public String ausgabe(){
        String ausgabe = _string;
        Wagen schaffner = _zug.getLock();
        while (schaffner != null){
            if (schaffner.getBool()){
                ausgabe += schaffner.getString();
                ausgabe += " ";
            }
            schaffner = schaffner.getNextWagen();
        }
        System.out.println(ausgabe);
        return ausgabe;
    }
    
    /**
     * In dieser Hilfsmethode werden die eingehenden Listen dubliziert 
     * um eine in ihren eigenen Schwanz beißende Schlange zu verhindern
     * 
     * @param wagen erstes Element der dublizierenden Liste
     * @return Zug neu erstellte Liste
     */
    public Zug dublizieren(Wagen wagen){
        Zug zug = new Zug("");
        Wagen schaffner = wagen;
        while(schaffner != null){
            zug.addLast(schaffner.getString(), schaffner.getBool());
            schaffner = schaffner.getNextWagen();
        }
        return zug;
    }
}
