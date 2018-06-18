/**
 * Abstrakte Klasse Pumpe - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class AbstraktePumpe
{
    private String _bezeichnung;
    private float _maximalerBetriebsdruck;
    private int _maximaleFoerdermenge;
    private int _tiefe;
    private int _hoehe;
    private int _breite;
    private int _gewicht;
    
    
    
    public AbstraktePumpe(String bezeichnung, float maximalerBetriebsdruck,
    int maximaleFoerdermenge, int tiefe , int hoehe, int breite, int gewicht)
    {
        this._bezeichnung = bezeichnung;
        this._maximalerBetriebsdruck = maximalerBetriebsdruck;
        this._maximaleFoerdermenge = maximaleFoerdermenge;
        this._tiefe = tiefe;
        this._hoehe = hoehe;
        this._breite = breite;
        this._gewicht = gewicht;
    }
    
    public AbstraktePumpe(String bezeichnung, int tiefe , int hoehe, int breite, int gewicht)
    {
        this._bezeichnung = bezeichnung;
        this._tiefe = tiefe;
        this._hoehe = hoehe;
        this._breite = breite;
        this._gewicht = gewicht;
    }
    
    public String getBezeichnung(){
        return _bezeichnung;
    }
    
    public float getMaximalerBetriebsdruck(){
        return _maximalerBetriebsdruck;
    }
    
    public int getMaximaleFoerdermenge(){
        return _maximaleFoerdermenge;
    }
    
    public int getHoehe(){
        return _hoehe;
    }
    
    public int getBreite(){
        return _breite;
    }
    
    public int getGewicht(){
        return _gewicht;
    }
    
    public int getTiefe(){
        return _tiefe;
    }
    
    public abstract void infoAusgeben();
}
