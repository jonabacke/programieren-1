import java.util.Comparator;
/**
 * Vergleicht zwei Personen anhand ihres Geschlechts.
 * @author  Jonathan Backes
 * @version 01.06.2018
 */

class PerGeschlecht implements Comparator<Person>
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int compare(Person a, Person b)
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
