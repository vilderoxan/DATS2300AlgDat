import eksempelklasser.Heltall;
import eksempelklasser.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class D {
    //d.Seksjon 1.4.4: oppgave 1, 2

    // Oppgave 1:

    /*

1.Kopier class Heltall fra Programkode 1.4.4 a) over til deg selv.
Opprett mappen (package) eksempelklasser og legg den der.

 	a) Lag og kjør et program med Programkode 1.4.4 c).
 	b) Bruk Programkode 1.4.4 b) i compareTo-metoden. Sjekk at alt virker som før!
 	c) La  return verdi - h.verdi;  være kode i compareTo-metoden. Matematisk sett blir det
 	korrekt.Sjekk at alt virker som før. Det er imidlertid et problem her. Hva er det?

 	Svar: Se fasit!

d) Heltall x = new Heltall(3), y = new Heltall(3);  // x og y er like
System.out.println(x.compareTo(y) + "  " + x.equals(y));
Lag et program som inneholder koden over. Hva blir utskriften?
Kommenter så vekk equals-metoden i class Heltall.
Da vil det bli den versjonen av equals som arves fra class Object, som brukes.
Hva blir nå utskriften? Slå opp i kildekoden til class Object og se
hvordan metoden equals er kodet der.
     */

    /*
    Svar:
    returnerer false når vi kommenterer ut equals-metodene i Heltall-klassen
    Hvorfor? Fordi de er to forskjellige objekter selv om de har ulik verdi

    Fasit:
    Her vil x.compareTo(y) gi 0 fordi begge inneholder verdien 3 og er
    dermed like. Men x.equals(y) vil gi false hvis vi bruker den versjonen av equals som
    vi arver fra class Object. Den versjonen av equals gir false hvis vi sammenligner to
    forskjellige objekter. Poenget er at x og y er to forskjellige objekter, men de
    inneholder samme verdi. Metoden equals i class Object er kodet slik at
    x.equals(y) og x == y gir samme resultat.


     */

    /*
    Oppgave 2:

a) 	a) Legg inn flere personer i Person-tabellen i Programkode 1.4.4 e).
	b) Kjør Programkode 1.4.4 e) etter at du har gjort som i a).
	c) Bruk sort-metoden fra class Arrays i Programkode 1.4.4 e).
	d) Legg inn kode i konstruktøren slik at det kastes en NullPointerException
	hvis fornavn eller etternavn er null. Ta med en tekst som forteller hvilket navn
	som er null.

	e) Lag en mer direkte versjon av metoden equals(), dvs. uten å bruke compareTo().
	Bruk også getClass() != o.getClass() istedenfor !(o instanceof Person).
	Men da må det først være kode som returnerer false hvis o er null.
	Hvis ikke, vil o.getClass() kaste en NullPointerException.

	f) Lag metoden public boolean equals(Person p). Da trengs ingen typesjekking.

	g) Metoden hashCode() i klassen Person kan kodes på mange måter.
	Hvis equals() er kodet, men ikke hashCode(), vil f.eks. NetBeans og Eclipse
	si ifra og samtidig komme med forslag om hvordan hashCode() skal kodes.
	Sjekk dette. Obs: I NetBeans er dette en del av standardoppsettet.
	I Eclipse må du selv sette det som en opsjon.
	Men du får tilbudet i menyvalget Source.
	Hash-teknikk blir tatt opp mer grundig i Kapittel 6.

Svar: Skjønner ingenting


h)
 I metoden toString i klassen Person skjøtes fornavn,
 et mellomrom og etternavn sammen. Dette kan også gjøres ved hjelp av metoden join i klassen String. Prøv på det!

 i)
  Legg Programkode 1.4.4 f) bakerst i Programkode 1.4.4 e). Kjør programmet!

     */

    public static void main(String[] args) {
        int[] a = {5, 2, 7, 3, 9, 1, 8, 10, 4, 6};          // en int-tabell
        Heltall[] h = new Heltall[a.length];       // en Heltall-tabell

        for (int i = 0; i < h.length; i++) {
            h[i] = new Heltall(a[i]);
        }
        Tabell.innsettingssortering(h);           // generisk sortering
        //System.out.println(Arrays.toString(h));   // utskrift

        Heltall x = new Heltall(3), y = new Heltall(3);  // x og y er like
        //System.out.println(x.compareTo(y) + "  " + x.equals(y));

        Person[] p = new Person[8];                   // en persontabell

        p[0] = new Person("Kari", "Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");              // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");        // Kari Pettersen
        p[5] = new Person("Vilde", "Fauchald");
        p[6] = new Person("Mikael", "Cabot");
        p[7] = new Person("Mikael", "Cabo");

        Person[] c = new Person[2];
        c[0] = new Person("Kari", "Svendsen");         // Kari Svendsen
        c[1] = new Person("Boris", "Zukanovic");

        Person d = new Person("Vilde", "Fauchald");
        Person e = new Person("Vilde", "Fauchal");

        int m = Tabell.maks(p);                       // posisjonen til den største
        //System.out.println(p[m] + " er størst");      // skriver ut den største

        Tabell.innsettingssortering(p);               // generisk sortering
        //System.out.println(Arrays.toString(p));       // skriver ut sortert

        Stream s = Arrays.stream(p);
        Optional<Person> resultat = s.max(Comparator.naturalOrder());
        resultat.ifPresent(System.out::println);

        Arrays.stream(p).max(Comparator.naturalOrder()).ifPresent(System.out::println);


        boolean like = p.equals(c);
        //System.out.print(like);
    }

}
