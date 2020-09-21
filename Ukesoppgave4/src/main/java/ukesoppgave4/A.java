public class A {
    //Seksjon 1.4.1: oppgave 1, 2, 3, 4, 5, 6

    // Oppgave 2:
    //Lag en maks-metode som finner posisjonen til den «største» verdien
    // i en char-tabell. Hvor mange endringer må du gjøre hvis du tar utgangspunkt
    // i maks-metoden for datatypen double, dvs. Programkode 1.4.1 a).
    // Test metoden din ved å legge inn en char-tabell i Programkode 1.4.1 c).
    // Hint: En char-tabell c som for eksempel inneholder tegnene
    // J, A, S, M, I og N, kan lages slik: char[] c = "JASMIN".toCharArray();


    /*
    Svar:

    Jeg måtte kun gjøre to endringer. argumentet måtte byttes til char-array og
    maksverdi måtte byttes fra int til char. Ellers kan man fint sammenligne chars aritmetisk.
    Man trenger ikke compareTo.
     */
    // Oppgave 1:
    public static void main(String[] args) {
        int[] a = {5, 2, 7, 3, 9, 1, 8, 4, 6};
        double[] d = {5.7, 3.14, 7.12, 3.9, 6.5, 7.1, 7.11};
        String[] s = {"Sohil", "Per", "Thanh", "Fatima", "Kari", "Jasmin"};
        char[] c = "VILDE".toCharArray();

        int k = Tabell.maks(a);     // posisjonen til den største i a
        int l = Tabell.maks(d);     // posisjonen til den største i d
        int m = Tabell.maks(s);     // posisjonen til den største i s
        int n = Tabell.maks(c);     // posisjonen til den største i c

        System.out.println(a[k] + "  " + d[l] + "  " + s[m] + " " + c[n]);
        String g = "A", t = "B";
        System.out.println(g.compareTo(t));
        System.out.println(Boolean.compare(false, true));
    }

    //Oppgave 3:
    /*
    Lag en maks-metode som finner posisjonen til den største verdien i en Integer-tabell.
    Hvor mange endringer må du gjøre hvis du tar utgangspunkt i maks-metoden for
    tegnstrenger, dvs. Programkode 1.4.1 b).
    Test metoden.

    En testtabell kan du opprette slik: Integer[] a = {5,2,7,3,9,1,8,4,6};
     */

    // Svar: Jeg måtte gjøre to endringer. Argumentet må være en Integer, Maksverdi må være en
    // Integer. compareTo-funksjonen Kan være der da den tar en Integer.

    public static int maks(Integer[] a)    // legges i class Tabell = 1 endring
    {
        int m = 0;                          // indeks til største verdi
        Integer maksverdi = a[0];            // største verdi  = 2 endringer

        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        return m;  // returnerer posisjonen til største verdi
    }

    // Oppgave 4:
    /*
    	La a og b være ta variabler av typen Integer.
    	Finn ut f.eks. ved å eksperimentere,
    	hva a.compareTo(b) returnerer.
    	Sett så opp den regelen som metoden er kodet etter.
     */

    /*
    Svar:
    Hvis a er mindre enn b vil a.compareTo(b) returnere -1!
    Hvis de er like, vil metodekallet returnere 0!
    Hvis a er større enn b vil den returnere: 1
     */


    // Oppgave 5:
/*
Metoden compareTo i class String virker slik: Hvis strengen s er forskjellig fra strengen t, s ikke utgjør første del av t og t ikke utgjør første del av s, så finnes det en første posisjon der s og t har forskjellige tegn. La f.eks. s = "Jasmin" og t = "Jason". Første posisjon der disse er forskjellige, er posisjon 3 siden tegnet m er forskjellig fra tegnet o. (Obs. første posisjon i en streng er 0). Metoden compareTo returnerer da differansen mellom ascii-verdiene til disse to tegnene. I dette tilfellet vil s.compareTo(t) returnere 'm' - 'o' = -2.

Hvis s og t er gitt slik som i oppgaveteksten, dvs. s = "A" og t = "B", vil s.compareTo(t) returnere verdien 'A' - 'B' = -1.

Problemet med Æ, Ø og Å er at de er plassert i feil innbyrdes rekkefølge i både UTF-8, Unicode og ISO-8859-1. Se Avsnitt 1.4.9.

Vi får et spesialtilfelle hvis s utgjør første del av t eller t første del av s. F.eks. s = "Karianne" og t = "Kari". Da vil s.compareTo(t) returnere differansen mellom de to strengenes lengder. I dette tilfellet blir det 8 - 4 = 4. Legg også merke til at s eller t eller begge, kan være tomme. Hvis f.eks. s = "" og t = "Petter", utgjør egentlig s første del av t. Dermed vil s.compareTo(t) returnere verdien 0 - 6 = -6.

Til slutt får vi at s.compareTo(t) vil returnere 0 hvis s og t har nøyaktig samme innhold.

 */

//Oppgave 6:

    /*

Ulikhetstegn gjelder ikke for boolean.
F.eks. er false < true ulovlig.
Men Boolean har metoden public static int compare(boolean x,boolean y)
og ved hjelp av den kan vi finne hva som regnes som «minst» og «størst» av false og true.
Hva blir utskriften:
System.out.println(Boolean.compare(false, true)); = -1
False er mindre enn true :)
*/



}
