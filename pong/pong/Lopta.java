public class Lopta {
    private Kruh lopta;
    
    public Lopta() {
        this.lopta = new Kruh();
        this.lopta.zmenPriemer(10);
        this.lopta.posunVodorovne(125);
        this.lopta.posunZvisle(85);
        this.lopta.zobraz();
    }
}
