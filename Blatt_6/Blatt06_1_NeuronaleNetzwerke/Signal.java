
/**
 * Beschreiben Sie hier die Klasse Signal.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Signal implements Neuronen
{
    private String _signal;
    private Zug _zug;
    
    public Signal(String signal){
        String [] signalArry = signal.split(" ");
        _zug = new Zug(signalArry [0]);
        for(int i = 1; i < signalArry.length; i++){
            _zug.addLast(signalArry[i]);
        }
    }
    
    public Wagen getAusgangswert(){
        return _zug.getLock();
    }
}
