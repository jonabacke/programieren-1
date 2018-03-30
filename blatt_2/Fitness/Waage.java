
/**
 * Beschreiben Sie hier die Klasse Waage.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Waage
{
    // Im folgendem werden die Feldvariablen deklariert
    private int _gewicht;
    private int _letztesGewicht;
    private int _minimum;
    private int _maximum;
    private double _durchschnitt;
    private double _counter;
    private int _trend;

    /**
     * Konstruktor für Objekte der Klasse Waage
     * @param Gewicht ganzzahligem in kg angeben
     */
    public Waage(int gewicht)
    {
        _gewicht = gewicht;
        _maximum = gewicht;
        _minimum = gewicht;
        _durchschnitt = gewicht;
        _counter = 2;
    }

    /**
     * Hier werden die gemessenen Gewichte regestriert und verwertet
     * minimum und maximum ermitelt
     * durchschnitt berechnet
     * 
     * @param  neues Gewicht in kg (ganzzahlig)
     */
    public void regestriere(int neuesGewicht)
    {
        if (neuesGewicht > _maximum)
        {
            _maximum = neuesGewicht;
        }
        if (neuesGewicht < _minimum)
        {
            _minimum = neuesGewicht;
        }
        _durchschnitt = (_counter - 1) / _counter * _durchschnitt + 1 / _counter * neuesGewicht;
        _letztesGewicht = _gewicht;
        _gewicht = neuesGewicht;
        _counter++;
        _trend += gibTrend();
    }
    
    /**
     * In dieser Methode wird der Trend berechnet
     * @return 1 wenn das Gewicht rauf geht
     * @return -1 wenn das Gewicht runter geht
     * @return 0 wenn das Gewicht gleich bleibt
     */
    
    public int gibTrend()
    {
        if (_letztesGewicht < _gewicht)
        {
            return 1;
        }
        else if (_letztesGewicht > _gewicht)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    //hier wird das minimalgewciht zurueckgegeben
    public int gibMinimalgewicht()
    {
        return _minimum;
    }
    
    //hier wird das Maximalgewicht zurueckgegeben
    public int gibMaximalgewicht()
    {
        return _maximum;
    }
    
    //hier wird das Durchschnittsgewicht zurückgegeben
    public double gibDurchschnittsgewicht()
    {
        return _durchschnitt;
    }
}
