/**
 * Vergleicht zwei Personen anhand ihres Vornamens.
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
class PerVorname implements Vergleicher
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int vergleiche(Person a, Person b)
    {
        return a.gibVorname().compareTo(b.gibVorname());
    }
}
