/**
 * Vergleicht zwei Personen anhand ihres Geschlechts.
 * @author  Jonathan Backes
 * @version 01.06.2018
 */
class PerGeschlecht implements Vergleicher
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int vergleiche(Person a, Person b)
    {
        if(a.istMaennlich() == b.istMaennlich()){
            return 0;
        }else if (a.istMaennlich()){
            return 1;
        }else{
            return -1;
        }
    }
}
