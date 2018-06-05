import java.util.Comparator;
/**
 * Vergleicht zwei Personen anhand ihres Vornamens.
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
class PerVorname implements Comparator<Person>
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int compare(Person a, Person b)
    {
        return a.gibVorname().compareTo(b.gibVorname());
    }
}
