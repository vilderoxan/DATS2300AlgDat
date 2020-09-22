import eksempelklasser.*;

import java.util.Arrays;

public class F {
    //f.Seksjon 1.4.6: oppgave 1, 2, 3, 4, 5, 7

    //Oppgave 2:
    /*
    Sjekk at Programkode 1.4.6 g) virker.
    Utvid tabellen, dvs. med flere studenter og studier.
    Erstatt så de to siste linjene med Programkode 1.4.6 h).
    Dropp så komparatorvariabelen c og la isteden
    lambda-uttrykket inngå direkte som argument i sorteringsmetoden.

     */

    /*
    3.	Lag et lamda-uttrykk som ordner studentene etter studium, fornavn og etternavn.
     */

    /*

Utvid lambda-uttrykket i Programkode 1.4.6 i)
slik at like lange strenger ordnes alfabetisk.
La så tabellen s inneholde "21","18","8","13","20","6","16","25","3","10".
Kan du forutsi hvordan den vil bli sortert? Kjør så koden.

Jeg skjønner ikke oppgave 5 i det hele tatt!! Ikke oppgave 7 heller.

Må gjøre hele OPPGAVE F på NYTT!!!
     */


    public static void main(String[] args) {
        Student[] s = new Student[5];                             // en studenttabell
        s[0] = new Student("Kari", "Svendsen", Studium.Data);      // Kari Svendsen
        s[1] = new Student("Boris", "Zukanovic", Studium.IT);      // Boris Zukanovic
        s[2] = new Student("Ali", "Kahn", Studium.Anvendt);        // Ali Kahn
        s[3] = new Student("Azra", "Zukanovic", Studium.IT);       // Azra Zukanovic
        s[4] = new Student("Kari", "Pettersen", Studium.Data);     // Kari Pettersen

        //Tabell.innsettingssortering(s, (s1,s2) -> s1.studium().compareTo(s2.studium()));
        //System.out.println(Arrays.toString(s));

        Tabell.innsettingssortering(s, (s1, s2) -> s1.studium().compareTo(s2.studium()));    // Programkode 1.4.6 b)
        System.out.println(Arrays.toString(s));

        // Oppgave 3:


        Tabell.innsettingssortering(s, (s1, s2) -> {
                    int k = s1.studium().compareTo(s2.studium());
                    if (k != 0) return k;
                    k = s1.fornavn().compareTo(s2.fornavn());
                    if (k != 0) return k;
                    return s1.etternavn().compareTo(s2.etternavn());
                }
        );

        String[] g = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        Tabell.innsettingssortering(g, (g1,g2) -> g1.length() - g2.length());

        System.out.println(Arrays.toString(g));
        // Utskrift: [Per, Lars, Kari, Bodil, Berit, Anders]


    }
}
