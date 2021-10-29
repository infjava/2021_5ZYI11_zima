public class Lopta {
    private Kruh lopta;
    private int smerX;
    private int smerY;
    private int poziciaY;
    
    public Lopta() {
        this.lopta = new Kruh();
        this.lopta.zmenPriemer(10);
        this.lopta.posunVodorovne(125);
        this.lopta.posunZvisle(85);
        this.lopta.zobraz();
        
        this.poziciaY = 150;
        
        this.smerX = 5;
        this.smerY = 5;
    }
    
    public void tik() {
        if (this.poziciaY == 5 || this.poziciaY == 295) {
            this.smerY = -this.smerY;
        }
        this.lopta.skry();
        this.lopta.posunVodorovne(this.smerX);
        this.lopta.posunZvisle(this.smerY);
        this.lopta.zobraz();
        this.poziciaY += this.smerY;
    }
}
