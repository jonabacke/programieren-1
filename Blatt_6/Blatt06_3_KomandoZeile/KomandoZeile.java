
/**
 * In dieser Klasse wird die eingabe an den Benutzer wieder ausgegeben und 
 * die Buschstaben der eingabe gezaehlt.
 * 
 * @author Jonathan Backes
 * @version 01.06.2018
 */
public class KomandoZeile
{
    private int haufen;
    private static int stack;
    public static void main(String[] args){
        int [] haeufigkeit = new int [26];
        for(int i = 0; i < args.length; i++){
            System.out.println(args [i]);
            analysiereText(args[i], haeufigkeit);
        }
        for (int i = 0; i < 26; i++){
            System.out.println((char)('a'+i) +": " + haeufigkeit[i]);
        }
        KomandoZeile komando = new KomandoZeile();
        komando.haufen = komando.haufen + 1;
        stack = stack + 1;
    }
    /**
     * zaehlt die chars im wort.
     * Andere Zeichen als Buchstaben werden ignoriert
     * 
     * @param str Uebergeben eines Wortes
     * @param int-array in dem die anzahl Buchstaben gezaehlt wird.
     */
    public static void analysiereText(String str, int [] haeufigkeit){
        try {
            str = str.toLowerCase();
            for (int j = 0; j < str.length(); j++){
                haeufigkeit [str.charAt(j) - 'a'] += 1;
            }
        } catch(ArrayIndexOutOfBoundsException e){
        }
    }
}
