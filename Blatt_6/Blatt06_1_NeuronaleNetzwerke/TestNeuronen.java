

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse TestNeuronen.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestNeuronen
{
    Signal _signal1;
    Signal _signal2;
    Signal _signal3;
    KonkatenationNeuron _kette;
    PalindromNeuron _palindrom;
    /**
     * Konstruktor fuer die Test-Klasse TestNeuronen
     */
    public TestNeuronen()
    {
        _signal1 = new Signal("Affe axa faul lagerregaL");
        _signal2 = new Signal("du bist doch viel zu faul um das alles zu lesen");
        _signal3 = new Signal("Anna geht des öfteren mit otto ein lagerregaL aufbauen");
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Test
    public void beachtungGross()
    {
        _palindrom = new PalindromNeuron(true);
        _palindrom.eingangHinzufügen(_signal1);
        _palindrom.palindromNeuron();
        _kette = new KonkatenationNeuron();
        _kette.eingangHinzufügen(_signal1);
        assertEquals("axa ", _kette.ausgabe());
        _palindrom.eingangHinzufügen(_signal2);
        _palindrom.palindromNeuron();
        _kette.eingangHinzufügen(_signal2);        
        _palindrom.eingangHinzufügen(_signal3);
        _palindrom.palindromNeuron();
        _kette.eingangHinzufügen(_signal3);
        assertEquals("axa otto ", _kette.ausgabe());
        _kette.eingangHinzufügen(_signal1);
        assertEquals("axa otto axa ", _kette.ausgabe());
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void nichtBeachtungGross()
    {
        _palindrom = new PalindromNeuron(false);
        _palindrom.eingangHinzufügen(_signal1);
        _palindrom.palindromNeuron();
        _kette = new KonkatenationNeuron();
        _kette.eingangHinzufügen(_signal1);
        assertEquals("axa lagerregaL ", _kette.ausgabe());
        _palindrom.eingangHinzufügen(_signal2);
        _palindrom.palindromNeuron();
        _kette.eingangHinzufügen(_signal2);        
        _palindrom.eingangHinzufügen(_signal3);
        _palindrom.palindromNeuron();
        _kette.eingangHinzufügen(_signal3);
        assertEquals("axa lagerregaL Anna otto lagerregaL ", _kette.ausgabe());
        _kette.eingangHinzufügen(_signal1);
        assertEquals("axa lagerregaL Anna otto lagerregaL axa lagerregaL ", _kette.ausgabe());
    }
}
