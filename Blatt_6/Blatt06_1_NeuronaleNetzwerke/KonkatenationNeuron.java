
/**
 * Beschreiben Sie hier die Klasse KonkatenationNeuron.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KonkatenationNeuron implements Neuronen
{
    private Zug _zug;
    private String _string;
    private Wagen _wagen;
    private Zug _hilfsZug;
    
    public KonkatenationNeuron(){
        _string = "";
        _zug = new Zug(_string);
    }
    
    public void eingangHinzufügen(Neuronen signal){
        _wagen = _zug.getLastWagen();
        _wagen.setNextWagen(signal.getAusgangswert());
    }
    
    public Wagen getAusgangswert(){
        return _zug.getLock();
    }
    
    public String ausgabe(){
        String ausgabe = _string;
        _hilfsZug = new Zug("");
        Wagen lastWagen = _hilfsZug.getLastWagen();
        lastWagen = _zug.getLock();
        Wagen schaffner = _hilfsZug.getLock();
        while (schaffner.getNextWagen() != null){
            if (schaffner.getBool()){
                ausgabe += schaffner.getString();
                ausgabe += " ";
            }
            schaffner = schaffner.getNextWagen();
        }
        System.out.println(ausgabe);
        lone();
        return ausgabe;
    }
    
    public void lone(){
        Wagen schaffner = _zug.getLock();
        _hilfsZug = new Zug(_zug.getLock().getString());
        while(schaffner.getNextWagen() != null){
            _hilfsZug.addLast(schaffner.getString());
        }
    }
}
