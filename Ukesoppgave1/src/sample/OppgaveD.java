package sample;

public class OppgaveD {
    // Seksjon 1.1.5: oppgave 1

    /*
    	Sjekk at Programkode 1.1.5 gir korrekte resultater.
    	Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
    	Se også Avsnitt 1.1.7.
     */

    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                } else {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    //Hvis a har lengde 1: Vil gå igjennom for-løkka en gang og returnere "sist" fordi den blir true
    // Hvis a har lengde 0: Array Out Of bounce exception.

    /*
    Fasit:
    Hvis det Programkode 1.1.5 brukes på en tabell a med ingen elementer (dvs. a.length lik 0), finnes det ikke noe element med indeks lik 0. Dermed vil setningen int maksverdi = a[0] gi en ArrayIndexOutOfBoundsException.

Hvis tabellen a har kun ett element, vil for-løkken gå én gang siden sist er 0. Dermed returneres 0 som er posisjonen til den største. Hvis det er kun ett element, er det også størst.
     */
}
