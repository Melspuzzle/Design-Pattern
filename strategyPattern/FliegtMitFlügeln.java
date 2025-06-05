/*Diese Klasse ist eine konkrete Strategie (Implementierung von FlugVerhalten).
Die Ente kann damit richtig fliegen, wie eine echte Ente. */

public class FliegtMitFlügeln implements FlugVerhalten {
    public void fliegen() {
        System.out.println("Ich fliege!!");
    }
}