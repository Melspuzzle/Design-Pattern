/*StockEnte ist eine konkrete Unterklasse von Ente. 
Im Konstruktor wird festgelegt, welches Verhalten diese Ente verwendet. 
Hier: Sie fliegt mit Flügeln und kann quaken */

public class StockEnte extends Ente {
    public StockEnte() {
        quakVerhalten = new Quaken(); // Setzt das Quakverhalten
        flugVerhalten = new FliegtMitFlügeln(); // Setzt das Flugverhalten
    }
}
