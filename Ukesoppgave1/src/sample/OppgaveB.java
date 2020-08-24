package sample;

public class OppgaveB {
    //Seksjon 1.1.3: oppgave 5, 6

    //Oppgave 5: Lag en metode public static int[] minmaks(int[] a).
    // Den skal ved hjelp av en int-tabell med lengde 2
    // returnere posisjonene til minste og største verdi i tabellen a.
    //
    // Hvis du har funnet at m1 er posisjonen til den minste og m2 til den
    // største, kan du returnere tabellen b definert ved:
    // int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?

    int[] a = {1, 3, 2, 7, 5, 9, 6, 8, 10, 4};

    public static int[] minmaks(int[] a) {

        int min = 0;
        int maks = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
            if (a[i] > a[maks]) {
                maks = i;
            }
        }
        int[] b = {min, maks};
        return b;
    }


// Hvor mange sammenligninger? Den vil bruke 2(n-1) / 2n - 2 sammenligninger
// Hvis n = 10 så blir det 2 * (10-1) = 2* 9 = 18 sammenligninger.


//Oppgave 6:
// Utrykket n! betyr n fakultet og er gitt ved
// n! = n · (n-1)  ·  ·  · 2 · 1 . Lag en metode
//long fak(int n) som regner ut n! . Hvor mange multiplikasjoner
// utføres i metoden?


    public static long fak(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n < 0");
        long fak = 1;

        for (int i = 2; i <= n; i++) {
            fak = fak * i; // (2*1) (3*2) (4*6) (5*24) (120*6) (720 *7) (5040 *8) (40320 * 9) osv..
        } //skal skrive ut svaret av n! ikke fakultetet
        return fak;
    }
}


//Hvis n = 0 eller 1 utføres ingen multiplikasjoner. Hvis n > 1 utføres det n − 1 multiplikasjoner. Hvis n = 10 utfører 9 multiplikasjoner

//