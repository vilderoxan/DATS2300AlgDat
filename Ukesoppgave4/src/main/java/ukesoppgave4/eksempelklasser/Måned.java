package eksempelklasser;

import java.util.Arrays;

public enum Måned {

    /*
    Lag enumtypen Måned.
    Den skal inneholde konstanter for hver måned (med tre bokstaver),
    JAN, FEB, . . . , NOV, DES.

    La typen få en instansvariabel med navn mndnr og en aksessmetode med samme navn.
     */

    JAN(1, "januar"),
    FEB(2, "februar"),
    MAR(3, "mars"),
    APR(4, "april"),
    MAI(5, "mai"),
    JUN(6, "juni"),
    JUL(7, "juli"),
    AUG(8, "august"),
    SEP(9, "september"),
    OKT(10, "oktober"),
    NOV(11, "november"),
    DES(12, "desember");

    private final int mndnr;      // instansvariabel
    private final String fulltnavn;

    private Måned(int mndnr, String fulltnavn) {
        this.mndnr = mndnr;
        this.fulltnavn = fulltnavn;
    }

    public int getMndnr() {
        return this.mndnr;
    }

    // Overskriv toString() slik at den gir det fulle navnet.

    @Override
    public String toString() {
        return this.fulltnavn;
    }


    //Lag også public static String toString(int mnd) slik at den gir januar for mnd
    // lik 1, osv

    public static String toString(int mnd) {
        if (mnd < 1 || mnd > 12) {
            throw new IllegalArgumentException("Ulovlig månedsnummer");
        }
        return values()[mnd - 1].toString();
    }


    /*
    La videre Måned ha fire statiske metoder vår(), sommer(), høst() og vinter().
    Hver av dem skal reture en Måned-tabell som inneholder de tilsvarende enumkonstantene.
    Vi sier at APRIL og MAI er vår,
    JUN, JUL og AUG er sommer,
    SEP og OKT er høst
    og at NOV, DES, JAN, FEB og MAR er vinter.
     */

    public static Måned[] vår() {
        return Arrays.copyOfRange(values(), 3, 5); // skriver ut indeks 3 og 4
    }

    public static Måned[] sommer() {
        return Arrays.copyOfRange(values(), 5, 8); // 5, 6, 7
    }

    public static Måned[] høst() {
        return Arrays.copyOfRange(values(), 8, 10); // 8, 9
    }

    public static Måned[] vinter() {
        return new Måned[]{NOV, DES, JAN, FEB, MAR};
    }


}
