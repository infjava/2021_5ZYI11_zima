public class Kamen {
    private Kruh kamen;
    
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(18);
        this.kamen.posunZvisle(-59);
        this.kamen.posunVodorovne(sachovnica.getSirka() * 20 - 39);
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
}
