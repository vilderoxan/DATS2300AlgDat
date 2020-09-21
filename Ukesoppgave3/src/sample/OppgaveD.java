package sample;

public class OppgaveD {
    //Seksjon 1.3.5: oppgave 2, 3, 5


    //Oppgave 2:
    /*
    Sjekk at metoden lineærsøk gir korrekt returverdi hvis det søkes etter en verdi som er
    mindre enn den minste i tabellen. Hva skjer hvis tabellen er tom, dvs. a.length = 0?
    La a være tabellen i Figur 1.3.5 a). Hva blir returverdiene fra lineærsøk hvis vi
    søker etter 2, 15, 16, 40 og 41?
     */


    public static int lineærsøk(int[] a, int verdi) {
        if (a.length == 0 || verdi > a[a.length - 1]) {
            return -(a.length + 1);  // verdi er større enn den største
        }

        int i = 0;
        for (; a[i] < verdi; i++) ;  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }


    // Returverdi for 2 = -1. Insettingspunktet blir da:
    //–(k + 1) = - (-1 +1= 0) Så det er riktig returverdi :)

    //Hvis tabellen er tom blir returverdi
    // - (a.length +1) returnert som er en verdi mer enn det tabellen har.
    // - indikerer at verdien ikke finnes men ville blitt satt inn til slutt

    /*
    Svar:

    Returverdi 2: -1
    Returverdi 15: -6
    Returverdi 16: 5
    Returverdi 40: 14
    Returverdi 41: -16

     */

    //Oppgave 3:
/*
    Hvis verdi forekommer flere ganger i tabellen a,
    vil posisjonen til den første av dem (fra venstre) bli returnert.
    Lag en versjon av lineærsøk der det er posisjonen til den siste av dem som returneres.
    Gjør det f.eks. ved å lete motsatt vei, dvs. fra høyre mot venstre.


 */


    public static int lineærsøk2(int[] a, int verdi) {
        if (a.length == 0 || verdi < a[0]) {
            return -1;  // verdi er større enn den største
        }

        int i = a.length - 1;
        for (; a[i] < verdi; i--) ;  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }


    //Oppgave 5:

    //a:

    /*
     I metoden public static int lineærsøk(int[] a, int k, int verdi)
     skal a og verdi være som i vanlig lineærsøk.
     Parameter k (et positivt heltall) er «hopplengden».
     I beskrivelsen over var k lik 10.
     Metoden skal returnere nøyaktig det samme som vanlig lineærsøk,
     også i det tilfellet den søkte verdien ikke finnes.
     */


    public static int lineærsøk(int[] a, int k, int verdi) {
        if (k < 1)
            throw new IllegalArgumentException("Må ha k > 0!");

        int j = k - 1;
        for (; j < a.length && verdi > a[j]; j += k) ;

        int i = j - k + 1;  // søker i a[j-k+1:j]
        for (; i < a.length && verdi > a[i]; i++) ;

        if (i < a.length && a[i] == verdi) return i;  // funnet
        else return -(i + 1);
    }

    //b:  Test metoden fra a) med ulike verdier på k (k = 1 gir vanlig lineærsøk).


    public static void main(String[] args) {
        int[] a = {3, 8, 10, 12, 14, 16, 21, 24, 27, 30, 32, 33, 34, 37, 40};
        //System.out.print(lineærsøk(a, 41));
        System.out.println(lineærsøk(a, 10, 37));
        System.out.println(lineærsøk(a, 5, 8));

    }

    //c: Hvis «hopplengden» k settes lik heltallsdelen av kvadratroten til tabellens lengde,
    // får vi den beste utnyttelsen av metodens idé. Hvilken orden vil metoden da få?
    // Bruk det til å lage metoden public static int kvadratrotsøk(int[] a, int verdi).


    public static int kvadratrotsøk(int[] a, int verdi) {
        return lineærsøk(a, (int) Math.sqrt(a.length), verdi);
    }
}
