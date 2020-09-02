package sample;

public class OppgaveA {
    //Seksjon 1.3.1: oppgave 1, 2, 3

    /*
Legg metodene fra Programkode 1.3.1
a) og Programkode 1.3.1
b) i samleklassen Tabell
     */

    /*
Gitt flg. permutasjoner av tallene fra 1 til 6:
a) 2 3 6 1 4 5,
b) 2 3 6 1 5 4,
c) 2 3 1 6 5 4,
d) 2 3 6 5 4 1 og
e) 2 6 5 4 3 1.
Finn, for hver av dem, den neste i leksikografisk rekkefølge.
Bruk så metoden nestePermutasjon som fasit.
     */

    //a) 2 3 6 1 4 5, = 2 3 6 1 5 4
    //b) 2 3 6 1 5 4 = 2 3 6 4 1 5

  /*
    145
    154
    415
    451
    514
    541

   */

  //c) 2 3 1 6 5 4 =

    /*
    456
    465
    546
    564
    645
    654
     */

    /*
    1 byttes med 4 fordi 4 er det minste til høyre som er større.
    Da får vi :

    2 3 4 6 5 1

    Dermed snur vi alle til høyre for posisjon x som er 4.

    Da får vi

    2 3 4 1 5 6
     */

    //d) 2 3 6 5 4 1

    /*

    1 4 5
    1 5 4
    4 1 5
    4 5 1
    5 1 4
    5 4 1

    Ok. Det er det siste alternativet. Da må vi se videre.

    3 bryter med sorteringen.
    Vi bytter 3 med det minste som er større til høyre = 4

    2 4 6 5 3 1
        1 3 5 6
    dermed snur vi til høyre for pos. x

    2 4 1 3 5 6
     */

    //e) 2 6 5 4 3 1

    /*
    2 bryter.

    Bytter 2 med 3

    3 6 5 4 2 1

    Snur:

    3 1 2 4 5 6
     */


    //Oppg. 3
    //Skriv opp de 10 første permutasjonene som kommer
    // etter 3 1 4 9 7 10 8 6 5 2 leksikografisk.
    // Bruk metoden nestePermutasjon som fasit.

    /*
    3 1 4 9 7 10 8 6 5 2
    3 1 4 9 8 10 7 6 5 2
               2 5 6 7 10

første perm: 3 1 4 9 8 2 5 6 7 10

andre perm:  3 1 4 9 8 2 5 6 10 7

tredje perm: 3 1 4 9 8 2 5 7 6 10

fjerde perm: 3 1 4 9 8 2 5 7 10 6

femte perm:  3 1 4 9 8 2 5 10 6 7

sjette perm:

       3 1 4 9 8 2 5 10 7 6  - >
       3 1 4 9 8 2 6 10 7 5

                     6 5 10 7
                     6 5 7 10

            3 1 4 9 8 2 6 5 7 10

Syvende perm: 3 1 4 9 8 2 6 5 10 7

åttende perm: 3 1 4 9 8 2 6 7 5 10

Niende perm:  3 1 4 9 8 2 6 7 10 5


     */
}
