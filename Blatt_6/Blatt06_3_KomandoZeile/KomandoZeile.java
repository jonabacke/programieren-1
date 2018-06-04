
/**
 * In dieser Klasse wird die eingabe an den Benutzer wieder ausgegeben und 
 * die Buschstaben der eingabe gezaehlt.
 * 
 * @author Jonathan Backes
 * @version 01.06.2018
 */
public class KomandoZeile
{
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println(args [i]);
        }
        int [] haeufigkeit = new int [26];
        analysiereText(args, haeufigkeit);
        for (int i = 0; i < 26; i++){
            System.out.println((char)('a'+i) +": " + haeufigkeit[i]);
        }
    }
    
    public static void analysiereText(String [] str, int [] haeufigkeit){
        for (int i = 0; i < str.length; i++){
            for (int j = 0; j < str [i].length(); j++){
                haeufigkeit [str[i].charAt(j) - 'a'] += 1;
            }
        }
    }
}
