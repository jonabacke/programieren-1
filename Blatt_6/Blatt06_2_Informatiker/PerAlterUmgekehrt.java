/**
 * Vergleicht zwei Personen anhand ihres Alters.
 * 
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
class PerAlterUmgekehrt implements Vergleicher
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int vergleiche(Person a, Person b)
    {
        // Achtung: Dieser Trick funktioniert nur, wenn die Differenz garantiert in einen int passt.
        return b.gibGeburtsjahr() - a.gibGeburtsjahr();
    }
}