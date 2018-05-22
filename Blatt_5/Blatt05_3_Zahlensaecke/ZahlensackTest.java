

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse ZahlensackTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZahlensackTest
{
    private Auswahl _auswahl;
    private Permutation _permutation;
    private Naiv _naiv;
    private int _anzahl;
    /**
     * Die verschiedenen Objekte werden mit einer größe von 100 inizialisiert
     */
    public ZahlensackTest()
    {
        _anzahl = 100;
        _auswahl = new Auswahl(_anzahl);
        _permutation = new Permutation(_anzahl);
        _naiv = new Naiv(_anzahl);
        
    }

    /**
     *  Wird getestet ob wirklich eine Zehl entfernt wird.
     */
    @Test
    public void testEntferneZahl()
    {
        for(int i = 99; i == 0; i--){
           _permutation.entferneZahl();
           _auswahl.entferneZahl();
           _naiv.entferneZahl();
           assertEquals(i, _permutation.gibAnzahl());
           assertEquals(i, _auswahl.gibAnzahl());
           assertEquals(i, _naiv.gibAnzahl());
        }
    }

    /**
     *  Teste ob der Sack zu Anfang leer ist
     *  Dann wird der Sack befüllt
     *  Teste ob Sack nicht leer ist
     *  Sack geleert
     *  Teste ob Sack wieder leer ist
     */
    @Test
    public void testLeereSack()
    {
        assertTrue(_permutation.istLeer());
        assertTrue(_auswahl.istLeer());
        assertTrue(_naiv.istLeer());
        _permutation.entferneZahl();
        _auswahl.entferneZahl();
        _naiv.entferneZahl();
        assertFalse(_permutation.istLeer());
        assertFalse(_auswahl.istLeer());
        assertFalse(_naiv.istLeer());
        _permutation.leereSack();
        _auswahl.leereSack();
        _naiv.leereSack();
        assertTrue(_permutation.istLeer());
        assertTrue(_auswahl.istLeer());
        assertTrue(_naiv.istLeer());
    }
}
