import eksempelklasser.Komparator;
import eksempelklasser.Person;

import java.util.Arrays;

public class G {
    //g.Seksjon 1.4.7: oppgave 1, 2, 3, 4, 5

    //Oppgave 2:
    /*
    Sorter og skriv ut tabellen Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
    Bruk en naturligOrden-komparator. Sorter så tabellen motsatt vei (minst til slutt).

    SKJØNNER IKKE DISSE OPPGAVENE! MIKAEL
     */

    public static void main(String[] args) {
        Double[] d = {5.7, 3.14, 7.12, 3.9, 6.5, 7.1, 7.11};
        Tabell.innsettingssortering(d, Komparator.naturligOrden());
        System.out.println(Arrays.toString(d));
        Tabell.innsettingssortering(d, Komparator.omvendtOrden());
        System.out.println(Arrays.toString(d));
        Boolean[] b = {false, true, true, false, false, true, false, true};
        Tabell.innsettingssortering(b, Komparator.naturligOrden());
        System.out.println(Arrays.toString(b)); // False er mindre enn true.

        Person[] p = new Person[5];                                         // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen
        //Oppgave 4:
        //Lag kode som sorterer kun med hensyn på etternavn. Bruk en orden-teknikk.

        Tabell.innsettingssortering(p, Komparator.orden(Person::etternavn));
        System.out.println(Arrays.toString(p));

        //I Programkode 1.4.7 i) sorteres strenger mhp. lengde.
        // Lag kode som sorterer motsatt vei, dvs. lange strenger kommer først.
        // Lag en komparator eller bruk en orden-teknikk.

        String[] s = {"Lars", "Anders", "Bodil", "Kari", "Per", "Berit"};
        Tabell.innsettingssortering(s, (x, y) -> y.length() - x.length());
        // eller

        Tabell.innsettingssortering(s, Komparator.orden(x -> -x.length()));

        System.out.println(Arrays.toString(s));

    }


}
