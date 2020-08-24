package sample;

public class OppgaveA {
    //Seksjon 1.1.2: oppgave 1, 2, 3

    //Oppgave 1: Anta at vi har en min-metode, dvs. en metode som finner
    // (og returnerer) posisjonen til den minste verdien i en tabell.
    // Hva ville metodekallet min(a) returnere med hvis a er tabellen
    // i Figur 1.1.2?

    int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

    // Min-metoden ville returnert tallet 6 fordi tallet 1 ligger på indeks nummer 6


    //Oppgave 2: Lag en min-metode på samme måte som maks-metoden i
    // Programkode 1.1.2, dvs. en metode som finner (og returnerer)
    // posisjonen til den minste verdien i en tabell.

    public static int min(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        int min = 0;  // indeks til foreløpig minste verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < a[min]) { //Sammenligner verdiene
                min = i;  // min oppdaterer med indeksen hvis det er over er sant
            }
        }

        return min;  // returnerer indeksen/posisjonen til største verdi
    }

    //Oppgave 3: Hvis den største verdien forekommer flere ganger,
    // vil maks-metoden returnere posisjonen til den første av dem.
    // Hva må endres for at den skal returnere posisjonen til den siste?


    //Svar:
    // I for-løkken i stedet for int i = 1 så kan man Starte på int i = a.length - 2; i >= 0; i--
    // Da vil det siste elementet blir lagret dersom det finnes to verdier som er like
    // Itterer baklengs. ELLER skirve <= for da erstattes min med tallet dersom det er likt og da kan det siste tallet lagres.


}
