
import java.util.Arrays;

public class C {
    //c.Seksjon 1.4.3: oppgave 2, 5, 6, 7, 8


    // Oppgave 2
    /*
    Hva tror du flg. metodekall returnerer:
    Integer.compare(-1, 1); ?
    Hva med: Integer.compareUnsigned(-1, 1); ?
     */

    /* Svar:
     * @param  x the first {@code int} to compare
     * @param  y the second {@code int} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     */

    /*
    Svar:
      * @param  x the first {@code int} to compare
     * @param  y the second {@code int} to compare
     * @return the value {@code 0} if {@code x == y}; a value less
     *         than {@code 0} if {@code x < y} as unsigned values; and
     *         a value greater than {@code 0} if {@code x > y} as
     *         unsigned values
     */

    // Oppgave 5:

    /*
    	Lag metoden public static void skriv(Object[] a, int fra, int til).
    	Den skal skrive elementene (mellomrom mellom hvert) fra a[fra:til>
    	på én linje (uten mellomrom til slutt).

    	Lag så en skriv-metode som skriver ut hele a.
    	Lag også tilsvarende metoder med navn skrivln (de skal avslutte med linjeskift).
    	Lag også metoden public static void bytt(Object[] a, int i, int j).
    	Den skal bytte om elementene på plassene i og j i tabellen a.
    	Legg alle metodene i samleklassen Tabell.
     */

    //Oppgave 6:

    /*
    	Legg bytt og randPermInteger fra Programkode 1.4.3 d)
    	inn i samleklassen Tabell og sjekk at Programkode 1.4.3 e) virker.
    	Lag større tabeller, f.eks. med 20 verdier.
     */

    // Oppgave 7:


    /*
    Gitt tabellen: double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
    Lag kode som lager en Double-tabell ved hjelp av den gitte double-tabellen
    og som så bruker den generiske innsettingssorteringen. Se Programkode 1.4.3 c).
    */

    // Oppgave 8:

    /*
    	Det kan oppstå tvetydigheter hvis primitive typer og omslagsklasser blandes.
    	Metoden public static void f(int a, Integer b) { } har først en int og så en Integer som
    	argument. I metoden public static void f(Integer a, int b) { }  er det motsatt.
    	Dermed er disse metodene forskjellige. Hva vil kompilatoren si til metodekallet f(1,1);
    	Hva skjer hvis en av metodene kommenteres vekk? Hvis begge metodene finnes, hvordan kan
    	en da endre i kallet f(1,1); for at en bestemt av dem skal brukes?
     */

    /*
    svar:

 Hvis du har tilgang til begge metodene i et program, vil metodekallet f(1,1);
 føre til at kompilatoren gir en feilmelding som denne: Reference to f is ambiguous.
 Both method f(int,Integer) og method f(Integer,int) match.
 Det kommer av at hvis den første f-en skal brukes, må det andre 1-tallet konverteres til en Integer.
 Hvis derimot den andre f-en skal brukes, må de første 1-tallet konverteres til en Integer.
 Det ene er ikke noe riktigere enn det andre. Derfor er det tvetydig.

Hvis en av metodene tas vekk, vil metodekallet f(1,1); bli utført.
Det er det samme hvilken som tas vekk.

En kan bestemme hvem av dem som skal brukes ved å konvertere ett av tallene til en Integer:

  f(1, (Integer)1);  // nå brukes f(int a, Integer b)
  f((Integer)1,1);   // f(Integer a, int b)

     */

    public static void main(String[] args) {
        //System.out.println(Integer.compare(-1, 1)); // -1 fordi x er mindre enn y
        //System.out.println(Integer.compareUnsigned(-1, 1)); // 1 fordi
        //Object[] a = {"H", 3, 1};
        //Tabell.skriv(a, 0, 2);
        //Integer[] a = Tabell.randPermInteger(20);
        //System.out.println(Arrays.toString(a));
        // En mulig utskrift: [7, 1, 8, 2, 10, 3, 4, 6, 5, 9]

        //Tabell.innsettingssortering(a);
        //System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Tabell.createDoubleArray();
    }
}
