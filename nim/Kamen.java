public class Kamen {
    private Kruh kamen;
    private int poziciaStlpec;
    private int poziciaRiadok;
    
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(18);
        this.kamen.posunZvisle(-59);
        this.kamen.posunVodorovne(sachovnica.getSirka() * 20 - 39);
        
        this.poziciaStlpec = sachovnica.getSirka();
        this.poziciaRiadok = sachovnica.getVyska();
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
    
    public void posunSa(int riadok, int stlpec) {
        this.kamen.skry();
        this.kamen.posunZvisle(-(riadok - this.poziciaRiadok) * 20);
        this.kamen.posunVodorovne((stlpec - this.poziciaStlpec) * 20);
        this.kamen.zobraz();
        
        this.poziciaStlpec = stlpec;
        this.poziciaRiadok = riadok;
    }
}
