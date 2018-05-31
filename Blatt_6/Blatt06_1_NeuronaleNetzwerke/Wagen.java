
/**
 * Beschreiben Sie hier die Klasse ListenObjekt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wagen
{
    Wagen _nextWagen;
    String _string;
    boolean _istPalindrom;
    
    public Wagen(String string){
        setString(string);
        _nextWagen = null;
    }
    
    public Wagen getNextWagen(){
        return _nextWagen;
    }
    
    public String getString(){
        return _string;
    }
    
    public boolean getBool(){
        return _istPalindrom;
    }
    
    public void setString(String string){
        _string = string;
    }
    
    public void setIstPalindrom(boolean bool){
        _istPalindrom = bool;
    }
    
    public void setNextWagen(Wagen wagon){
        _nextWagen = wagon;
        //this._nextWagen = wagon; Unterschied????
    }
}
