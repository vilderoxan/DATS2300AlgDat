package sample;

public class OppgaveC {
    //Seksjon 1.1.4: deloppgave i og deloppgave ii

    //i:
    // Hvor mange grunnleggende operasjoner utfører Programkode 1.1.4
    // hvis tabellen a inneholder i) 10, 5, 7, 2, 9, 1, 3, 8, 4, 6

    int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};

    public static int maks(int[] a) {
        int m = 0;
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                {
                    maksverdi = a[i];
                    m = i;
                }
            }
        }
        return m;
    }
}

//Det opprettes en hjelpevariabel m som får 0 som startverdi: assignment (1)
//Det opprettes en hjelpevariabel til maksverdi som får a sin 0-posisjon som startverdi, pluss aksesering: (2)
//Løkkevariabelen i opprettes og får 1 som startverdi: (1)
//I for-løkken utføres sammenligningen i < a.length n ganger: (n)
// I for-løkken utføres addisjonen i++ n – 1 ganger: (n – 1)
//Setningen if (a[i] > maksverdi) utføres n – 1 ganger. Den består av én tabelloperasjon og én sammenligning: 2(n – 1)
//Tilordningen maksverdi = a[i] utføres hver gang a[i] > maksverdi er sann: 3x
//Verdien til m returneres: (1)

//Sum: 1 + 2 + 1 + n + (n-1) + 2(n-1) + 3x + 1 =
// 5 + n + (n-1) + 2n -2 + 3x =
// 3 + n + n -1 + 2n + 3x =
// 4n + 2 + 3x


/*
Fasit: Regnskapet blir nå
1 + 2 + 1 + n + n−1 + 2(n−1) + 3x + 1 = 4n + 2 + 3x
der x er antallet ganger sammenligningen a[i] > maksverdi er sann.


Hvis 10, 5, 7, 2, 9, 1, 3, 8, 4, 6 Så blir x = 0
Hvis 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 blir x = 9
 */