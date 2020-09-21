import eksempelklasser.Måned;
import eksempelklasser.Student;
import eksempelklasser.Studium;

public class E {
    //e.Seksjon 1.4.5: oppgave 1, 2, 3, 4, 5

    //1:

    /*
    Flytt enumtypen Studium over til deg.
    Legg den under (package) eksempelklasser. Lag så et program der Programkode 1.4.5 b)
    inngår og kjør programmet.

     */

    //4:

    /*
    Det hender at en elektrostudent tar emnet Algoritmer og datastrukturer.
    Utvid enumtypen Studium slik at det også inngår en enumkonstant Elektro.
    Legge den f.eks. som nr. fire (foran Enkeltemne).
    Studiets navn er: Ingeniørfag - elektronikk og informasjonsteknologi.
     */

    //5
    /*
    Flytt klassen Student over til deg (package eksempelklasser)
    og sjekk at Programkode 1.4.5 d) virker som de skal.
    Legg inn et par elektrostudenter (se Oppgave 4) og et par
    enkeltemnestudenter i tabellen i Programkode 1.4.5 d).
    Kjør programmet.
     */

    public static void main(String[] args) {
        for (Studium s : Studium.values()) {
            System.out.println(s.toString() + " (" + s.name() + ")");
        }

        //  Returns the name of this enum constant, exactly as declared in its
        //  enum declaration.

        // Ingeniørfag - data (Data)
        // Informasjonsteknologi (IT)
        // Anvendt datateknologi (Anvendt)
        // Enkeltemnestudent (Enkeltemne)

        for (Måned m : Måned.values()) {
            System.out.println(m.toString() + " mnd.nr: " + m.getMndnr());
        }

        Student[] s = new Student[7];  // en Studenttabell

        s[0] = new Student("Kari", "Svendsen", Studium.Data);    // Kari Svendsen
        s[1] = new Student("Boris", "Zukanovic", Studium.IT);    // Boris Zukanovic
        s[2] = new Student("Ali", "Kahn", Studium.Anvendt);      // Ali Kahn
        s[3] = new Student("Azra", "Zukanovic", Studium.IT);     // Azra Zukanovic
        s[4] = new Student("Kari", "Pettersen", Studium.Data);   // Kari Pettersen
        s[5] = new Student("Hei", "Sveis", Studium.Elektro);
        s[6] = new Student("Hva", "Skjer", Studium.Enkeltemne);


        Tabell.innsettingssortering(s);                     // Programkode 1.4.2 e)
        for (Student t : s) System.out.println(t);

        // Utskrift:
        // Ali Kahn Anvendt
        // Kari Pettersen Data
        // Kari Svendsen Data
        // Azra Zukanovic IT
        // Boris Zukanovic IT
    }
}
