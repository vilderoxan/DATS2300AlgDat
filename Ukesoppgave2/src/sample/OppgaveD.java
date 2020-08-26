package sample;

import java.util.Arrays;

public class OppgaveD {
    //d. Seksjon 1.2.4: oppgave 1, 2, 3, 4

    /*
    1: 	Legg nestMaks-metoden fra Programkode 1.2.4 a)
    i samleklassen Tabell. Legg så Programkode 1.2.4 b)
    inn i main-metoden i klassen Program og sjekk at du får rett svar.

    Obs. Du får andre svar enn det som eksempelutskriften i Programkode 1.2.4 b)
    viser siden metoden randPerm gir nye permutasjoner hver gang den kalles.
     */

    /*
    2: Lag en versjon av nestmaks-metoden der du bytter om slik at den største kommer forrest.
    Dermed kan letingen etter den nest største starte i posisjon 1.
    Pass på og bytt tilbake før metoden avslutter slik at tabellen kommer tilbake i sin
    originale tilstand.
    Obs. Det blir et spesialtilfelle her når den nest største verdien
    ligger forrest i tabellen. Pass på at det tilfellet behandles rett.
     */

    /*
    3: Som i Oppgave 2, men bytt om slik at den største havner bakerst.
    Obs. Det blir et spesialtilfelle her når den nest største verdien ligger bakerst i tabellen.
    Pass på at det tilfellet behandles rett.
     */

    /*
    4: Se tabell
     */

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 4}; // tilfeldig permutasjon av 1 . . 20
        /*int[] b = Tabell.nestMaks3(a);  // metoden returnerer en tabell

        int m = b[0]; //For mellomlagring
        int nm = b[1];       // m for maks, nm for nestmaks

        Tabell.skrivLN(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);

         */

        System.out.print(String.format("%s", Arrays.toString(Tabell.sortering(a))));

        // Eksempel på en utskrift:

        // 12 16 15 6 10 8 9 2 14 19 5 18 20 13 3 7 11 1 4 17
        // Størst(20) har posisjon 12, nest størst(19) har posisjon 9
    }
}
