import java.util.Comparator;
/**
 * Vergleicht zwei Personen anhand ihres Alters.
 * 
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
class PerAlterUmgekehrt implements Comparator<Person>
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int compare(Person a, Person b)
    {
        // Achtung: Dieser Trick funktioniert nur, wenn die Differenz garantiert in einen int passt.
        return b.gibGeburtsjahr() - a.gibGeburtsjahr();
    }
}