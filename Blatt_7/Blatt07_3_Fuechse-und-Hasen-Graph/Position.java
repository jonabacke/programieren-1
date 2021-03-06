/**
 * Objekte dieser Klasse repräsentieren 
 * Positionen in einem rechteckigen Feld.
 * 
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class Position
{
    // Zeilen- und Spaltenposition.
    private int zeile;
    private int spalte;

    /**
     * Repräsentiere eine Zeile und eine Spalte.
     * @param zeile   die Zeile
     * @param spalte  die Spalte
     */
    public Position(int zeile, int spalte)
    {
        this.zeile = zeile;
        this.spalte = spalte;
    }
    
    /**
     * Prüfung auf Datengleichheit.
     */
    public boolean equals(Object obj)
    {
        if(obj instanceof Position) {
            Position anderePosition = (Position) obj;
            return zeile == anderePosition.gibZeile()
                && spalte == anderePosition.gibSpalte();
        }
        else {
            return false;
        }
    }
    
    /**
     * Liefere einen String in der Form 'Zeile,Spalte'
     * @return  eine Stringdarstellung dieser Position
     */
    public String toString()
    {
        return zeile + "," + spalte;
    }
    
    /**
     * Benutze die 16 höherwertigen Bits für den den Zeilenwert
     * und die 16 niederwertigen Bits für den Spaltenwert.
     * Außer für sehr große Felder sollte dies einen eindeutigen
     * Hashwert für jedes Zeile-Spalte-Paar geben.
     * @return  einen Hash-Code für diese Position
     */
    public int hashCode()
    {
        return (zeile << 16) + spalte;
    }
    
    /**
     * @return  die Zeile
     */
    public int gibZeile()
    {
        return zeile;
    }
    
    /**
     * @return  die Spalte
     */
    public int gibSpalte()
    {
        return spalte;
    }
}
