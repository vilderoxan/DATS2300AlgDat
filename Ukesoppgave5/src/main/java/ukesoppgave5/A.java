package ukesoppgave5;

public class A {

    //.Seksjon 1.5.1: oppgave 1, 3, 4, 7, 8, 9, 10, 11

    // 1: Lag en iterativ versjon av metoden a i Programkode 1.5.1 a).
    // SKJØNNER INGENTING!

    // 2:  an  =  2 an−1  +  3 an−2  , n ≥ 2     a0 = 1 ,  a1 = 2

    /*
    3: Lag denne itterativ:
     */

    public static int tverrsum(int n)              // n må være >= 0
    {
        if (n < 10) return n;                        // kun ett siffer
        else return tverrsum(n / 10) + (n % 10);     // metoden kalles
    }

    public static int tverrsum2(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }


    public static int a(int n)           // n må være et ikke-negativt tall
    {
        if (n == 0) return 1;              // a0 = 1
        else if (n == 1) return 2;         // a1 = 2
        else return 2 * a(n - 1) + 3 * a(n - 2);   // to rekursive kall
    }

    public static int b(int n)           // n et ikke-negativt tall
    {
        if (n < 0) throw new IllegalArgumentException("n er negativ!");

        int x = 0, y = 1, z = 1;

        for (int i = 0; i < n; i++) {
            z = 2 * y + 3 * x;
            x = y;
            y = z;
        }
        return z;
    }

    /*
    Gjentatt tverrsum til et tall n får vi ved å ta tverrsummen til n,
    så tverrsummen av dette, osv. til vi står igjen med et tall med kun ett siffer.
    Vi bruker navnet sifferrot på dette istedenfor gjentatt tverrsum.
    Det svarer til det engelske navnet digital root.
    Ta tallet 956847 som eksempel: tverrsum(956847) = 39, tverrsum(39) = 12 og tverrsum(12) = 3.
    Dermed blir sifferrot(956847) = 3. Lag metoden public static int sifferrot(int n).
    Den skal returnere sifferroten til n.
     */


    // 7:
    /*
    Lag en rekursiv metode som finner summen av kvadrattallene fra 1 til n, dvs.
    finner summen 1^2 + 2^2 + 3^2 + . . . + n2. Kjenner du noen formel for den samme summen?
     */

    public static int kvadratsum(int n) {
        if (n == 1) return 1;
        else return kvadratsum(n - 1) + n * n;
    }

    //8:

    /*
      Summen av heltallene fra 1 til n er et spesialtilfelle av det å finne summen av heltallene
      fra k til n der k <= n.
      Lag en metode public static int sum(int k, int n) som finner denne summen,
      og gjør det ved å bruke «splitt og hersk».
     */
    public static int sum(int n, int k) {
        if (n == k) return n;
        int m = (n + k) / 2;
        return sum(n, m) + sum(m + 1, k);
    }

    //9:
    /*
 Lag en rekursiv metode som returnerer posisjonen til den
 største blant de n første verdiene i en heltallstabell.
 Kan du få det til ved en «splitt og hersk»-teknikk?
     */

    public static int maks(int[] a, int v, int h) {
        if (v == h) return v;
        int m = (v + h) / 2;  // midten
        int mv = maks(a, v, m);
        int mh = maks(a, m + 1, h);

        return a[mv] >= a[mh] ? mv : mh;
    }


    //10:
    /*
    	Lag en rekursiv metode som finner n! (dvs. n fakultet) når n er parameterverdi.
     */

    public static int nFakultet(int n) {
        if (n < 2) {
            return 1;
        }
        return nFakultet(n - 1) * n;
    }

    //11:

    /*
    Bruk Programkode 1.5.1 h) til å finne Fibonacci-tall nr. 20, 30, 40 og 50. Hva skjer?
     */

    public static int fib(int n)         // det n-te Fibonacci-tallet
    {
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n - 1) + fib(n - 2);   // summen av de to foregående
    }

    public static int sifferrot(int n) {
        while (n >= 10) n = tverrsum(n);
        return n;
    }
    // denne blir rekursiv så lenge n returneres som over 10. med en gang det er under vil n returneres


    public static void main(String[] args) {
        int somethig = b(3);

        //int sifferrrot = sifferrot(234567);
        //System.out.println(sifferrrot);

        //int kvadratsum = kvadratsum(3);
        //int sum = sum(1, 10);
        //System.out.println(sum);
        //int[] a = {567, 4, 76, 2, 8, 90, 4, 5, 678};
        //int max = maks(a, 0, 8);
        //System.out.println(a[max]);

        //int fakultet = nFakultet(5);
        //System.out.println(fakultet);

        System.out.println(fib(10));     // Utskrift: 55
        System.out.println(fib(20));     // Utskrift: 6765
    }
}
