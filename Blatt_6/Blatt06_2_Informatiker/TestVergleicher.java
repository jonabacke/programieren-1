

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse TestVergleicher.
 *
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
public class TestVergleicher
{
    private PerNachname nachname;
    private PerVorname vorname;
    private PerGeschlecht geschlecht;
    
    private final Person[] _informatiker =
    {
        new Person("Ada", "Lovelace", 1815, false),
        new Person("Charles", "Babbage", 1791, true),
        new Person("Grace", "Hopper", 1906, false),
        new Person("Konrad", "Zuse", 1910, true),
    };
    
    
    
    /**
     * Konstruktor fuer die Test-Klasse TestVergleicher
     */
    public TestVergleicher()
    {
        nachname = new PerNachname();
        vorname = new PerVorname();
        geschlecht = new PerGeschlecht();
    }

    /**
     *  Testet auf Nachnamen
     */
    @Test
    public void nachnameTest()
    {
        assertEquals(10, nachname.vergleiche(_informatiker[0], _informatiker[1]));
        assertEquals(-6, nachname.vergleiche(_informatiker[1], _informatiker[2]));
        assertEquals(-18, nachname.vergleiche(_informatiker[2], _informatiker[3]));
        assertEquals(14, nachname.vergleiche(_informatiker[3], _informatiker[0]));
    }
    
    /**
     * testet auf vornamen
     */
    @Test
    public void vornameTest()
    {
        assertEquals(-2, vorname.vergleiche(_informatiker[0], _informatiker[1]));
        assertEquals(-4, vorname.vergleiche(_informatiker[1], _informatiker[2]));
        assertEquals(-4, vorname.vergleiche(_informatiker[2], _informatiker[3]));
        assertEquals(10, vorname.vergleiche(_informatiker[3], _informatiker[0]));
    }
    
    /**
     * testet auf geschlecht
     */
    @Test
    public void geschlechtTest()
    {
        assertEquals(-1, geschlecht.vergleiche(_informatiker[0], _informatiker[1]));
        assertEquals(1, geschlecht.vergleiche(_informatiker[1], _informatiker[2]));
        assertEquals(-1, geschlecht.vergleiche(_informatiker[2], _informatiker[3]));
        assertEquals(1, geschlecht.vergleiche(_informatiker[3], _informatiker[0]));
    }

}
