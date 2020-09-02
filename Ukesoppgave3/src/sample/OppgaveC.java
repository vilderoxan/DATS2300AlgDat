package sample;

public class OppgaveC {
    //Seksjon 1.3.4: oppgave 1, 3, 5, 9, 10, 11

    /* Oppgave 1:
    I Figur 1.3.4 d) er det gjort tre iterasjoner.
    Hva blir det etter i) 5
    og ii) 7 iterasjoner.
     */

    /*
    Svar:

    Hva blir det etter 5 iterasjoner?


3	4	5	16	21	19	7	23	10	14	15	11	6	17	8
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14

4 iterasjoner: 34	5	6	21	19	7	23	10	14	15	11	16	17	8
5 iterasjoner: 3	4	5	6	7	19	21	23	10	14	15	11	16	17	8

2) etter 7 ittersjoner:

6 iterasjoner: 3 4	5	6	7	8	21	23	10	14	15	11	16	17	19
7 iterasjoner: 3 4	5	6	7	8	10	23	21	14	15	11	16	17	19

     */


    //Oppgave 3:
    //Legg metoden i Programkode 1.3.4 a) inn i samleklassen Tabell.
    // Pass på at du da allerede har metodene bytt() og min() der.
    // Se også Oppgave 1 i Avsnitt 1.2.1. Sjekk så at Programkode 1.3.4 b) virker.

    //Oppgave 5:
    //utvalgssortering i Programkode 1.3.4 a) bruker to hjelpemetoder.
    // Det er mest vanlig å kode den uten hjelpemetoder. Søk på internett.
    // Bruk «selection sort» som søkeord.
    // Lag så din egen versjon (uten hjelpemetoder)!
    // Hvor lang tid bruker den for en tilfeldig tabell med 100000 verdier?
    // Er den bedre enn den fra Programkode 1.3.4 a)?

    //Jeg vet ikke om den er bedre. Ser ut som det samme. Men man får jo et mellomledd som kanskje ikke trengs?


    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndeks = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndeks]) {
                    minIndeks = j; // hvorfor gjøre dette?
                    //Swap the found minimum element with the first element
                    int temp = arr[minIndeks]; // det minste elementet til temp
                    arr[minIndeks] = arr[i];
                    arr[i] = temp;
                }

            }
        }
    }


    /*
      Lag metoden public static void utvalgssortering(int[] a, int fra, int til).
      Den skal sortere intervallet a[fra:til>.
      Pass på at du tester lovligheten til intervallet!

     */

    public static void utvalgssortering(int[] a, int fra, int til) {
        Tabell.fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++) {
            Tabell.bytt(a, i, Tabell.min(a, i, til));
        }


    }


    /*
    Oppgave 11

 La m være posisjonen til den minste i intervallet. Hvis m = i, er ombyttingen unødvendig:

     */


    public static void utvalgssortering(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int m = Tabell.min(a, i, a.length);  // posisjonen til den minste
            if (m != i) Tabell.bytt(a, i, m);
        }
    }

    //Hvis vi gjør noen små endringer i koden over, vil vi få vite antallet ganger m = i:

    public static int utvalgssortering2(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int m = Tabell.min(a, i, a.length);  // posisjonen til den minste
            if (m != i) Tabell.bytt(a, i, m);
            else antall++;
        }
        return antall;
    }

//Flg. programbit (med den versjonen av utvalgssortering som står rett over)
// gir antallet for noen tilfeldige permutasjoner av tallene fra 1 til 10:

    /*
      for (int i = 0; i < 10; i++)
    {
        int[] a = Tabell.randPerm(10);
        System.out.print(Tabell.utvalgssortering(a) + " ");
    }

     */

    /*
Ved en kjøring av programbiten ble resultatet slik: 4 4 1 0 3 1 2 0 0 2

Men resultatet blir forskjellig hver gang.
Men hva blir gjennomsnittsverdien? Vi har 10! forskjellige permutasjoner.
Det er 9! stykker som har tallet 1 først. Det betyr at i første iterasjon er sannsynligheten
1/10 for at m og i er like. I neste iterasjon vil sannsynligheten være 1/9 for at de er like.
Osv. til intervallet inneholder kun to verdier. Da vil sannsynligheten være 1/2.
Sammenlagt blir det 1/10 + 1/9 + · · · + 1/2.
Dette er lik H10 − 1 = 4861/2520 = 1.93. Med andre ord er gjennomsnittsverdien nær 2.

Hvis tabellen inneholder tallene fra 1 til n, vil gjennomsnittet bli Hn − 1.
I Avsnitt 1.1.6 fant vi at for store n er Hn − 1 ≈ log(n) – 0,423. Hvis n f.eks. er 100 000,
vil det bli 11,1. Dette betyr at det overhodet ikke lønner seg å ha testen if (m != i).
Den utføres hver gang (n − 1 ganger), men det er svært sjelden at m og i er like.
     */

}