package sample;

public class OppgaveC {

    //c. Seksjon 1.2.3: oppgave 1, 2, 3, 4, 5

    //Oppgave 1:

    //1. Legg metodene Programkode 1.2.3 a) og 1.2.3 d), inn i samleklassen Tabell.

    //2.

    /**
     * 789        * Checks that {@code fromIndex} and {@code toIndex} are in
     * 790        * the range and throws an appropriate exception, if they aren't.
     * 791
     */
    private static void rangeCheck(int length, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(
                    "fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }
        if (toIndex > length) {
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }

    //3.
   /* Gjør om maks-metoden i Programkode 1.2.1 b),
   som du nå skal ha lagt inn i class Tabell,
   slik at parameterverditesten blir erstattet med Programkode 1.2.3 b) og c).
   Lag så et testprogram der maks-metoden inngår (bruk main i class Program),
   men med parameterverdier som du vet vil føre til at unntak kastes.
   Velg verdier slik at du får frem alle de mulige feilmeldingstypene.
    */

   /*
   4.	Gå videre fra Oppgave 3. Dvs.
   lag også kode som tester parameteren a og som gir en fornuftig feilmelding hvis a er null.
    */

   /*
   5.
    I Oppgave 5, 6 og 7 i Avsnitt 1.2.2 skulle det lages metoder som arbeidet i et halvåpent intervall.
    Bruk metoden fratilKontroll() til å sjekke at intervallene er lovlige.
    */

   public static void main(String[] args) {
       int[] a = {1, 4, 8, 2};
       int[] c = {};
       //Tabell.maks(a, -1, 2); //ArrayOutOfBOunceException
       //Tabell.maks(a, 0, 5); //ArrayOutOfBOunceException
       //Tabell.maks(a, 5, 0); //Illegalt intervall
       //Tabell.maks(a, 4, 4); //No such element exception
       Tabell.maks(c, 0, 1); //NullpointerException

   }
}
