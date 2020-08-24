package sample;

public class Main {


    //Oppgave d.Seksjon 1.1.5: oppgave 1

       /* 1. Sjekk at Programkode 1.1.5 gir korrekte resultater.
       Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
       Se også Avsnitt 1.1.7.
        */


    public static int maks ( int[] a){
        int sist = a.length - 1;
        int m = 0;
        int maksverdi = a[0];
        int temp = a[sist];
        a[sist] = 0x7fffffff;

        for (int i = 0; ; i++)
            if (a[i] >= maksverdi) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp >= maksverdi ? sist : m;
                } else {
                    maksverdi = a[i];
                    m = i;
                }
            }
    }


    public static void main(String[] args) {

    }

}
