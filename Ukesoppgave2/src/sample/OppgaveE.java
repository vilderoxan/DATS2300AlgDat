package sample;

public class OppgaveE {
    //e. Seksjon 1.2.6: oppgave 1, 2, 3

    /*
    1:
    Sjekk at versjonen av nestMaks-metoden i Programkode
    1.2.5 a) utfører nøyaktig 2n − 3 sammenligninger når tabellen er sortert.
     */

    public static int[] nestMaks(int[] a) {
        int n = a.length;
        if (n < 2) throw
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 0;
        int nm = 1;


        if (a[1] > a[0]) { // 1 sammenligning
            m = 1;
            nm = 0;
        }

        int maksverdi = a[m];
        int nestmaksverdi = a[nm];


        for (int i = 2; i < n; i++) {
            if (a[i] > nestmaksverdi) { //n - 2 sammenligninger
                if (a[i] > maksverdi) { // n - 2 sammenligninger

                    // 2n - 4 + 1 ? 2n -3
                    nm = m;
                    nestmaksverdi = maksverdi;

                    m = i;
                    maksverdi = a[m];
                } else {
                    nm = i;
                    nestmaksverdi = a[nm];
                }
            }
        } // for

        return new int[]{m, nm};

    } // nestMaks

    // 2.For hvilke tabeller bruker metoden færrest mulig sammenligninger?
    // Når de to første tallene ligger først i tabellen.

    //3. 3.	Er det noen forskjell på gjennomsnittlig effektivitet,
    // effektiviteten i det mest ugunstige tilfellet og effektiviteten i det beste
    // tilfellet for maks-metoden, dvs. for den metoden som finner posisjonen til
    // den største verdien i en tabell?

    /*
    I maks-metoden er det ingen forskjell når det gjelder sammenligninger.
    Uansett hvordan en tabell med lengde n ser ut, må det utføres n − 1 sammenligninger for å
    finne den største verdien. Men hvis vi bruker den versjonen av maks-metoden vi har i
    Programkode 1.1.4, så er det også mulig å ta med de tilordningene som utføres når a[i] >
    maksverdi er sann. De blir det flest av hvis tabellen er sortert stigende og færrest av
    lhvis den største ligger først.
     */

}
