package sample;

public class OppgaveA {

    //Seksjon 1.2.1: oppgave 1, 5
// Lag to min-metoder
// (metoder som finner posisjonen til den minste verdien)
// tilsvarende de to maks-metodene i Programkode 1.2.1
// b) og 1.2.1 c).
// Legg dem i samleklassen Tabell. Se Avsnitt 1.2.2.

    //a[fra:til>   // halvåpent tabellintervall
    // til er ikke med
    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");
        int m = fra; // indeks til minste verdi.
        int minverdi = a[fra]; //største verdi

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;
                minverdi = a[m]; //Det blir vel det samme om man skriver a[i] her?
            }
        }
        return m;
    }

    // Dersom man skulle behøve å sjekke hele tabellen, trenger man ikke å
    //skrive metoden på nytt. Man bare kaller på metoden over og sender in index 0 - a.length.
    public static int min(int[] a) {
        return min(a, 0, a.length);
    }

    //Oppgave 5

    /*
    	I Java 1.5 ble det innført en ny type for-løkke -
    	en såkalt for-alle-løkke.
    	Se Programkode 1.2.1 d).
    	Den må du lære deg hvis du ikke allerede kan den.
    	Se f.eks. Vedlegg E.
     */
}
