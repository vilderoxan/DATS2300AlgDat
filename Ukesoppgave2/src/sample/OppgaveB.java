package sample;

public class OppgaveB {
    //b. Seksjon 1.2.2: oppgave 1, 2, 3, 4, 5

//1.Bygg opp class Tabell slik som beskrevet i
// Programkode 1.2.2 a).

    public static void main(String... args)      // hovedprogram
    {
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a med mellomrom

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        Tabell.skriv(a, 0, 5);


    } // main

    //Oppgave 3, 4, 5:



}
