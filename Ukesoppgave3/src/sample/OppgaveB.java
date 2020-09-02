package sample;

public class OppgaveB {
    // Seksjon 1.3.2: oppgave 1

    /*

1.	Hvor mange inversjoner har premutasjonen 3 5 4 7 6 8 1 2 9 10 ?
     */

    /*
    Gå for hvert tall x, videre mot høyre og se om det kommer et
    (eller flere) tall y som er mindre enn x.
    Det gir flg. inversjoner: (4 , 3), (6 , 5), (7 , 5), (9 , 5) og (9 , 8).
    Med andre ord fem inversjoner.
     */

    /*
    3 5 4 7 6 8 1 2 9 10
     */

    //1: (5,4)
    // 2: (7,6)
    // 3: (8, 1)

    /*
    Da får vi : 3 4 5 6 7 1 8 2 9 10

    Igjen:

    (7, 1)
    (8, 2)

    3 4 5 6 1 7 2 8 9 10

    Igjen:

    (6,1)
    (7,2)

    3 4 5 1 6 2 7 8 9 10

    Igjen

    (5,1)
    (6,2)

    3 4 1 5 2 6 7 8 9 10

    (4,1)
    (5, 2)

    3 1 4 2 5 6 7 8 9 10

    (3,1)
    (4, 2)

    1 3 2 4 5 6 7 8 9 10

    (3, 2)

    1 2 3 4 5 6 7 8 9 10

    Totalt: 14 inversjoner!

     */

}
