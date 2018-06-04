
/**
 * Die Klasse Signal nimmt die Eingaben auf, splittet sie und verteilt die
 * einzelnen Teile in einer Liste
 * 
 * @author Jonathan Backes 
 * @version 31.05.2018
 */
public class Signal implements Neuronen
{
    private String _signal;
    private Zug _zug;
    
    /**
     * In den Konstruktor wird ein ein String übergeb der durch die Split
     * Funktion in ein String Array gewandelt wird und in eine Liste 
     * geschrieben wird.
     * 
     * @param signal eingehendes Stringsignal
     */
    public Signal(String signal){
        String [] signalArry = signal.split(" ");
        _zug = new Zug(signalArry [0]);
        for(int i = 1; i < signalArry.length; i++){
            _zug.addLast(signalArry[i]);
        }
    }
    
    /**
     * Referenz auf das erste Listenobjekt
     * 
     * @return Wagen erster Wagen der Liste
     */
    public Wagen getAusgangswert(){
        return _zug.getLock();
    }
}
