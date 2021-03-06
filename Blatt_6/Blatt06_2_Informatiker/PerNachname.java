/**
 * Vergleicht zwei Personen anhand ihres Nachnamens.
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
class PerNachname implements Vergleicher
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int vergleiche(Person a, Person b)
    {
        return a.gibNachname().compareTo(b.gibNachname());
    }
}
