package sample;

public class Main {
    //Når man jobber i felleskap kan det være vanskelig med merging osv.

    // commit = lokal versjon kun for deg selv.

    //Pull HELE tiden. Commit ofte og push ofte.

    // Testing av kildekode og debuggin.

    /*
    Hvordan sette opp testing i intellij:
    -
     */

    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

    }

    static int min(int[] a) {
        int min_value = a[0];
        int min_index = 0;

        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int index = i;
            if (value < min_value) {
                min_value = value;
                min_index = index;
            }
        }
        return min_value;
    }
}
