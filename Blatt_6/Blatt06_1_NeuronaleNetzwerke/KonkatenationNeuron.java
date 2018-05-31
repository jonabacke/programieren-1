
/**
 * Beschreiben Sie hier die Klasse KonkatenationNeuron.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KonkatenationNeuron 
{
    private Zug _neuZug;
    private String _string;
    private Wagen _wagen;
    private Zug _zug;
    
    public KonkatenationNeuron(){
        _string = "";
        _zug = new Zug(_string);
    }
    
    public void eingangHinzufügen(Neuronen signal){
        Wagen wagen = signal.getAusgangswert();
        Zug neuZug = dublizieren(wagen);
        _wagen = _zug.getLastWagen();
        _wagen.setNextWagen(neuZug.getLock());
    }
    
    public Wagen getAusgangswert(){
        return _neuZug.getLock();
    }
    
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
