/*Ente ist eine abstrakte Klasse bzw. Oberklasse für alle Enten. 
Sie nutzt das Strategy Pattern, indem sie das Verhalten (fliegen, quaken) auslagert. 
Dadurch können konkrete Entenklassen verschiedene Verhaltensweisen zusammensetzen. */

public class Ente {
    FlugVerhalten flugVerhalten; // Referenz auf ein Flugverhalten (Strategie)
    QuakVerhalten quakVerhalten; // Referenz auf ein Quakverhalten (Strategie)

    public Ente() {
        // Konstruktor – wird in der konkreten Ente (z. B. StockEnte) überschrieben
    }

    public void tuFliegen() {
        flugVerhalten.fliegen(); // Delegiert das Fliegen an das aktuelle Flugverhalten
    }

    public void tuQuaken() {
        quakVerhalten.quaken(); // Delegiert das Quaken an das aktuelle Quakverhalten
    }

    public void schwimmen() {
        System.out.println("Allen Enten schwimmen, auch Holzenten"); // Standardverhalten
    }
}
