public class StredovaCiara {
    private Obdlznik ciara;
    
    public StredovaCiara() {
        this.ciara = new Obdlznik();
        this.ciara.zmenStrany(2, 300);
        this.ciara.posunVodorovne(89);
        this.ciara.posunZvisle(-50);
        this.ciara.zobraz();
    }
}
