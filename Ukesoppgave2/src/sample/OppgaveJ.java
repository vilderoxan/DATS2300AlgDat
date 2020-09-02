package sample;

import java.util.Arrays;

public class OppgaveJ {
    //j. Seksjon 1.2.13: oppgave 1, 3, 4

    //hvis k er nummeret til en node, så er k/2 nummeret til forelderen.
    //Med k/2 mener vi heltallsdivisjon.
/*
Setning 1.2.13  For en node med k som nodenummer,
vil 2k være nummeret til et venstre barn og 2k + 1 nummeret til et høyre barn.
Hvis noden har en forelder (dvs. k > 1), vil k / 2 (heltallsdivisjon) være
forelderens nodenummer.
 */

/*
Oppgave 1:

	Sjekk at Programkode 1.2.13 a)
	virker. Obs: metoden returnerer størst og nest størst verdi og ikke indeksene.
	Legg inn en setning som skriver ut tabellen b etter ut turneringen er gjennomført.
	Dermed kan en se resultatet av turneringen.



 */


    public static int[] nestMaks(int[] a)   // en turnering
    {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2 * n];          // turneringstreet
        System.arraycopy(a, 0, b, n, n);     // legger a bakerst i b

        for (int k = 2 * n - 2; k > 1; k -= 2)   // lager turneringstreet
            b[k / 2] = Math.max(b[k], b[k + 1]);

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2 * n - 1, k = 2; k < m; k *= 2) {
            int tempverdi = b[k + 1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) {
                tempverdi = b[k];
                k++;
            }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        return new int[]{maksverdi, nestmaksverdi}; // størst og nest størst

    } // nestMaks

    public static void main(String[] args) {
        int[] a = {15, 27, 23, 13, 31, 8, 9, 18, 14};
        System.out.print("Vinnererene er: " + Arrays.toString(nestMaks(a)));
    }
    /*
    Oppgave 3:
    Metoden public static void kopier(int[] a, int i, int[] b, int j, int ant)
    skal virke som arraycopy() fra class System. Lag den!

     */


    /*
     * Copies an array from the specified source array, beginning at the
     * specified position, to the specified position of the destination array.
     */

    int[] a = {1, 2, 3, 4, 5};
    int[] b = {};

    //ant = hvor mange elementer
    public static void kopier(int[] a, int i, int[] b, int j, int ant) {
        for (int n = i + ant; i < n; ) {
            b[j++] = a[i++];
        }
    }



    /*
Oppgave 4:
Gitt tabeller int[] a og int[] b med a.length <= b.length. Lag kode, vha. arraycopy() eller vha. kopier()
fra Oppgave 3, slik at 1) a kopieres inn først i b,  2) a kopieres inn bakerst i b og 3)
a kopieres inn på midten av b (gitt at lengdeforskjellen er et partall).
     */


    // 1:

    public static void kopier2(int[] a, int i, int[] b, int j, int ant) {
        // kopierer a først i b
        System.arraycopy(a, 0, b, 0, a.length);
    }

    // 2:
    public static void kopier3(int[] a, int i, int[] b, int j, int ant) {
        //a kopieres inn bakerst i b
        System.arraycopy(a, 0, b, b.length - a.length, a.length);
    }
    // hvis b = 10 og a = 4 så kopierer man fra 6 og ut i b
    //Veldig vanlig operasjon!!!

    // 3:


    public static void kopier4(int[] a, int i, int[] b, int j, int ant) {
        //a kopieres inn på midten av b
        System.arraycopy(a, 0, b, (b.length - a.length) / 2, a.length);
    }


}
