import eksempelklasser.Komparator;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {


    private Tabell() {
    } //privat standardkonstruktør - hindrer instansiering


    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    // Metoden randPerm(int n)                   Programkode 1.1.8 e)

    public static int[] randPerm(int n) {
        int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n
        for (int i = 0; i < n; i++) a[i] = i + 1;

        Random r = new Random();  // hentes fra java.util

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }

        return a; // tabellen med permutasjonen returneres

    } // randPerm


    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)

    public static int maks(int[] a, int fra, int til) {
        if (a.length == 0) {
            throw new NullPointerException("Arrayet er tom");
        }

        if (fra < 0 || til > a.length || fra > til) {
            fratilKontroll(a.length, fra, til);
        }
        if (fra == til) {
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
        }


        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }


    // Metoden maks(int[] a)                     Programkode 1.2.1 c)

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a, 0, a.length);     // kaller metoden over
    }

    // min-metodene - se Oppgave 1 i Avsnitt 1.2.1:

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

    /* 3.Lag metoden public static void
    bytt(char[] c, int i, int j).
    Den skal bytte om innholdet i posisjon i og j  i
    char-tabellen c. Legg metoden i samleklassen Tabell.

     */
    public static void bytt(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    /*
    4. Lag metoden
    public static void skriv(int[] a, int fra, int til).
    Den skal skrive ut tallene i intervallet
    a[fra:til> til konsollet -
    alle på én linje og et mellomrom mellom hvert tall.
    Ikke mellomrom og ikke linjeskift etter siste verdi.

    Lag så metoden
    public static void skriv(int[] a).
    Den skal skrive ut hele tabellen
    - alle på én linje, en blank mellom hvert tall.
    Ikke mellomrom og ikke linjeskift etter siste verdi.
    Legg begge metodene i samleklassen Tabell.
     */

    public static void skriv(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");

        for (int i = fra; i < til - 1; i++) { //NB! her er det mindre enn til - 1 så til -1 er ikke med
            System.out.print(a[i] + " ");
        }
        System.out.print(a[til - 1]);
    }

    public static void skriv(int[] a) {
        skriv(a, 0, a.length);
    }

    // OPPGAVE 5:
    //	Lag to skrivln-metoder.
    //	De skal ha samme signatur og fungere på samme måte som de to skriv-metodene i Oppgave 4 ,
    //	men utskriften skal avsluttes med et linjeskift. Legg begge metodene i samleklassen Tabell.

    public static void skrivln(int[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivLN(int[] a) {
        skrivln(a, 0, a.length);
    }

    //Oppgave C 1:

    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    //Setter det største tallet først
    public static int[] nestMaks2(int[] a) {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a, 0, m);  // bytter om slik at den største kommer forrest

        int k = Tabell.maks(a, 1, a.length);

        if (k == m) k = 0; // den nest største lå opprinnelig forrest

        Tabell.bytt(a, 0, m); // bytter tilbake

        return new int[]{m, k};

    }

    // Setter det største tallet sist
    public static int[] nestMaks3(int[] a) {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");
        int m = Tabell.maks(a);

        Tabell.bytt(a, a.length - 1, m);

        int nm = Tabell.maks(a, 0, a.length - 1);

        if (nm == m) {
            nm = a.length - 1;
        }

        Tabell.bytt(a, a.length - 1, m);

        return new int[]{m, nm};
    }


    public static int[] nestMaks(int[] a) { // legges i class Tabell
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi


        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        } else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        } else {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[]{m, nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    //Oppgave D 4:


    public static int[] sortering(int[] a) {

        for (int i = a.length; i > 1; i--) {
            int m = Tabell.maks(a, 0, i);
            Tabell.bytt(a, i - 1, m);
        }
        return a;
    }

    //Ukesoppgave 3:

    public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
    {
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
    {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a)  // snur hele tabellen
    {
        snu(a, 0, a.length - 1);
    }


    public static boolean nestePermutasjon(int[] a) {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a, i, j);
        snu(a, i + 1);               // bytter og snur

        return true;                             // en ny permutasjon
    }

    public static void utvalgssortering(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }


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
            bytt(a, i, min(a, i, til));
        }
    }

    // Ukesoppgave 4


    public static int maks(double[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        double maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdaters
            }
        return m;     // returnerer posisjonen til største verdi
    }

    public static int maks(char[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        char maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdaters
            }
        return m;     // returnerer posisjonen til største verdi
    }

/*
    public static int maks(String[] a)    // legges i class Tabell
    {
        int m = 0;                          // indeks til største verdi
        String maksverdi = a[0];            // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        return m;  // returnerer posisjonen til største verdi
    }

 */

    public static <T extends Comparable<? super T>> int maks(T[] a) {
        int m = 0;                     // indeks til største verdi
        T maksverdi = a[0];            // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        return m;  // returnerer posisjonen til største verdi
    } // maks


    public static <T extends Comparable<? super T>> void innsettingssortering(T[] a) {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int j = i - 1;        // j er en indeks
            // sammenligner og forskyver:
            for (; j >= 0 && verdi.compareTo(a[j]) < 0; j--) a[j + 1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }

    public static void skriv(Object[] a, int fra, int til) {
        Tabell.fratilKontroll(a.length, fra, til);

        String output = "";
        for (int i = fra; i < til; i++) {
            output = output + a[i] + " ";
        }
        output = output.substring(0, output.length() - 1);
        System.out.println(output);
    }

    public static void skriv(Object[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivln(Object[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(Object[] a) {
        skriv(a, 0, a.length);
        System.out.println();
    }

    public static void bytt(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static Integer[] randPermInteger(int n) {
        Integer[] a = new Integer[n];               // en Integer-tabell
        Arrays.setAll(a, i -> i + 1);               // tallene fra 1 til n

        Random r = new Random();   // hentes fra  java.util

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);             // bytter om
        }
        return a;  // tabellen med permutasjonen returneres
    }

    public static void createDoubleArray() {
        double[] d = {5.7, 3.14, 7.12, 3.9, 6.5, 7.1, 7.11};                // en doubel-tabell
        Double[] b = new Double[d.length];             // en tom Double-tabell
        for (int i = 0; i < b.length; i++) {
            b[i] = d[i];  // fyller tabellen (autoboksing)
        }
        Tabell.innsettingssortering(b);
        Tabell.skrivln(b);
    }

    public static <T> void innsettingssortering(T[] a, Komparator<? super T> c) {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet //i = 1, j = 0
            int j = i - 1;        // j er en indeks

            // sammenligner og forskyver:
            for (; j >= 0 && c.compare(verdi, a[j]) < 0; j--) a[j + 1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }


    public static <T> int maks(T[] a, Komparator<? super T> c) {
        return maks(a, 0, a.length, c);  // kaller metoden nedenfor
    }


    public static <T> int maks(T[] a, int fra, int til, Komparator<? super T> c) {
        fratilKontroll(a.length, fra, til);

        if (fra == til) throw new NoSuchElementException
                ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        int m = fra;                // indeks til største verdi
        T maksverdi = a[fra];       // største verdi

        for (int i = fra + 1; i < til; i++)   // går gjennom intervallet
        {
            if (c.compare(a[i], maksverdi) > 0)  // bruker komparatoren
            {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }
        return m;                 // posisjonen til største verdi

    }  // maks

}








