import java.lang.reflect.Array;
import java.util.Arrays;

public class B {

    //b.Seksjon 1.4.2: oppgave 1, 2

    // Oppgave1:
/*
	Legg inn maks-metoden fra Programkode 1.4.2 b) i klassen Tabell
	(legg også inn, hvis du ikke gjorde det i forrige avsnitt, maks-metoden fra 1.4.1 b).
	Lag et program som utfører Programkode 1.4.2 d).
	Hvilken metode velges?
	Fjern så maks-metoden for String (dvs. Programkode 1.4.1 b)
	fra Tabell og utfør Programkode 1.4.2 d) på nytt.
 */

    public static void main(String[] args) {
        String[] s = {"Sohil", "Per", "Thanh", "Fatima", "Kari", "Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh
        Integer[] a = {1, 3, 2, 4};
        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
    }

    //Oppgave 2
/*
Legg Programkode 1.4.2 e) i klassen Tabell og sjekk at Programkode 1.4.2 f) virker.
Den virker!
     */

}
