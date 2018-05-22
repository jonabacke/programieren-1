import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Eine Testklasse fuer Spielfeld-Klassen.
 *
 * @author Christian Spaeh, Fredrik Winkler, Axel Schmolitzky
 * @version 2017
 */
public class SpielfeldTest
{
    private Spielfeld _spielfeld;
    private SpielfeldString _spielfeldString;
    private SpielfeldGeflechtEnum _spielfeldGeflechtEnum;

    /**
     * Jede Testmethode arbeitet auf einem frisch erzeugten Test-Exemplar.
     * Im Konstruktor kann man also den erforderlichen Ausgangszustand
     * fuer die einzelnen Testmethoden herstellen, in diesem Fall ein neues Spielfeld.
     */
    public SpielfeldTest()
    {
        _spielfeld = new SpielfeldGeflecht();
        _spielfeldString = new SpielfeldString();
        _spielfeldGeflechtEnum = new SpielfeldGeflechtEnum();
        
    }

    /**
     * Wenn alle Positionen besetzt sind, solle das Spielfeld voll sein.
     * Vorher sollte es immer eine freie Position geben.
     */
    @Test
    public void testBefuelleSpielfeldKomplett()
    {
        for (int zeile = 0; zeile < 3; ++zeile)
        {
            for (int spalte = 0; spalte < 3; ++spalte)
            {
                assertFalse(_spielfeld.istVoll());
                _spielfeld.besetzePosition(zeile, spalte, 1);
            }
        }
        assertTrue(_spielfeld.istVoll());
    }
    
    /**
     * Wenn alle Positionen besetzt sind, solle das Spielfeld voll sein.
     * Vorher sollte es immer eine freie Position geben.
     */
    @Test
    public void testBefuelleSpielfeldStringKomplettAufruf(){
        for (int zeile = 0; zeile < 3; ++zeile)
        {
            for (int spalte = 0; spalte < 3; ++spalte)
            {
                assertFalse(_spielfeldString.istVoll());
                _spielfeldString.besetzePosition(zeile, spalte, 1);
            }
        }
        assertTrue(_spielfeldString.istVoll());
    }
    
    /**
     * Wenn alle Positionen besetzt sind, solle das Spielfeld voll sein.
     * Vorher sollte es immer eine freie Position geben.
     */
    @Test
    public void testBefuelleSpielfeldGeflechtEnumKomplett(){
        for (int zeile = 0; zeile < 3; ++zeile)
        {
            for (int spalte = 0; spalte < 3; ++spalte)
            {
                assertFalse(_spielfeldGeflechtEnum.istVoll());
                _spielfeldGeflechtEnum.besetzePosition(zeile, spalte, 1);
            }
        }
        assertTrue(_spielfeldGeflechtEnum.istVoll());
    }

    /**
     * Wenn alle Positionen besetzt sind, solle das Spielfeld voll sein.
     * Vorher sollte es immer eine freie Position geben. Dieser Test
     * befuellt das Spielfeld von hinten nach vorne.
     */
    @Test
    public void testBefuelleSpielfeldKomplettRueckwaerts()
    {
        for (int zeile = 2; zeile >= 0; --zeile)
        {
            for (int spalte = 2; spalte >= 0; --spalte)
            {
                assertFalse(_spielfeld.istVoll());
                _spielfeld.besetzePosition(zeile, spalte, 1);
            }
        }
        assertTrue(_spielfeld.istVoll());
    }
    
    /**
     * Wenn alle Positionen besetzt sind, solle das Spielfeld voll sein.
     * Vorher sollte es immer eine freie Position geben. Dieser Test
     * befuellt das Spielfeld von hinten nach vorne.
     */
    @Test
    public void testBefuelleSpielfeldStringKomplettRueckwaerts()
    {
        for (int zeile = 2; zeile >= 0; --zeile)
        {
            for (int spalte = 2; spalte >= 0; --spalte)
            {
                assertFalse(_spielfeldString.istVoll());
                _spielfeldString.besetzePosition(zeile, spalte, 1);
            }
        }
        assertTrue(_spielfeldString.istVoll());
    }
    
    /**
     * Wenn alle Positionen besetzt sind, solle das Spielfeld voll sein.
     * Vorher sollte es immer eine freie Position geben. Dieser Test
     * befuellt das Spielfeld von hinten nach vorne.
     */
    @Test
    public void testBefuelleSpielfeldGeflechtEnumKomplettRueckwaerts()
    {
        for (int zeile = 2; zeile >= 0; --zeile)
        {
            for (int spalte = 2; spalte >= 0; --spalte)
            {
                assertFalse(_spielfeldGeflechtEnum.istVoll());
                _spielfeldGeflechtEnum.besetzePosition(zeile, spalte, 1);
            }
        }
        assertTrue(_spielfeldGeflechtEnum.istVoll());
    }

    /**
     * Wenn neun Mal dieselbe Position besetzt wird,
     * sollte das Spielfeld nicht voll sein.
     */
    @Test
    public void testBesetzeNeunMalDieselbePosition()
    {
        for (int i = 0; i < 9; ++i)
        {
            _spielfeld.besetzePosition(0, 0, 1);
        }
        assertFalse(_spielfeld.istVoll());
    }

    /**
     * Schreibt in diesen Kommentar, was diese Methode testet:
     * Testet ob ein Feld leer ist dann besetzt es das Feld und 
     * testet ob es mit dem richtigen besetzt ist. Dies passert mit beiden 
     * Spielern uind nochmal mit dem Null-Spieler(leeres Feld)
     * Das wird für jedes Feld durchgeführt.
     * 
     */
    @Test
    public void testBesetzung()
    {
        for (int zeile = 0; zeile < 3; ++zeile)
        {
            for (int spalte = 0; spalte < 3; ++spalte)
            {
                assertEquals(0, _spielfeld.gibBesitzer(zeile, spalte));

                _spielfeld.besetzePosition(zeile, spalte, 1);
                assertEquals(1, _spielfeld.gibBesitzer(zeile, spalte));

                _spielfeld.besetzePosition(zeile, spalte, 2);
                assertEquals(2, _spielfeld.gibBesitzer(zeile, spalte));

                _spielfeld.besetzePosition(zeile, spalte, 0);
                assertEquals(0, _spielfeld.gibBesitzer(zeile, spalte));
            }
        }
    }
    
    /**
     * Schreibt in diesen Kommentar, was diese Methode testet:
     * Testet ob ein Feld leer ist dann besetzt es das Feld und 
     * testet ob es mit dem richtigen besetzt ist. Dies passert mit beiden 
     * Spielern uind nochmal mit dem Null-Spieler(leeres Feld)
     * Das wird für jedes Feld durchgeführt.
     * 
     */
    @Test
    public void testBesetzungString()
    {
        for (int zeile = 0; zeile < 3; ++zeile)
        {
            for (int spalte = 0; spalte < 3; ++spalte)
            {
                assertEquals(0, _spielfeldString.gibBesitzer(zeile, spalte));

                _spielfeldString.besetzePosition(zeile, spalte, 1);
                assertEquals(1, _spielfeldString.gibBesitzer(zeile, spalte));

                _spielfeldString.besetzePosition(zeile, spalte, 2);
                assertEquals(2, _spielfeldString.gibBesitzer(zeile, spalte));

                _spielfeldString.besetzePosition(zeile, spalte, 0);
                assertEquals(0, _spielfeldString.gibBesitzer(zeile, spalte));
            }
        }
    }
    
    /**
     * Schreibt in diesen Kommentar, was diese Methode testet:
     * Testet ob ein Feld leer ist dann besetzt es das Feld und 
     * testet ob es mit dem richtigen besetzt ist. Dies passert mit beiden 
     * Spielern uind nochmal mit dem Null-Spieler(leeres Feld)
     * Das wird für jedes Feld durchgeführt.
     * 
     */
    @Test
    public void testBesetzungGeflechtEnum()
    {
        for (int zeile = 0; zeile < 3; ++zeile)
        {
            for (int spalte = 0; spalte < 3; ++spalte)
            {
                assertEquals(0, _spielfeldGeflechtEnum.gibBesitzer(zeile, spalte));

                _spielfeldGeflechtEnum.besetzePosition(zeile, spalte, 1);
                assertEquals(1, _spielfeldGeflechtEnum.gibBesitzer(zeile, spalte));

                _spielfeldGeflechtEnum.besetzePosition(zeile, spalte, 2);
                assertEquals(2, _spielfeldGeflechtEnum.gibBesitzer(zeile, spalte));

                _spielfeldGeflechtEnum.besetzePosition(zeile, spalte, 0);
                assertEquals(0, _spielfeldGeflechtEnum.gibBesitzer(zeile, spalte));
            }
        }
    }
}
