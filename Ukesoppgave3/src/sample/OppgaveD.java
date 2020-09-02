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

        int i = 0; for (; a[i] < verdi; i++) ;  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 10, 12, 14, 16, 21, 24, 27, 30, 32, 33, 34, 37, 40};
        System.out.print(lineærsøk(a, 41));
    }

    // Returverdi for 2 = -1. Insettingspunktet blir da:
    //–(k + 1) = - (-1 +1= 0) Så det er riktig returverdi :)

    //Hvis tabellen er tom blir returverdi
    // - (a.length +1) returnert som er en verdi mer enn det tabellen har.
    // - indikerer at verdien ikke finnes men ville blitt satt inn til slutt
}
    /*
    Svar:

    Returverdi 2: -1
    Returverdi 15: -6
    Returverdi 16: 5
    Returverdi 40: 14
    Returverdi 41: -16

     */

