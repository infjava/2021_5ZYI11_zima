public class Pad {
    private Obdlznik pad;
    
    public Pad(boolean jeLavy) {
        this.pad = new Obdlznik();
        this.pad.zmenStrany(10, 50);
        if (jeLavy) {
            this.pad.posunVodorovne(-60);
        } else {
            this.pad.posunVodorovne(230);
        }
        this.pad.posunZvisle(75);
        this.pad.zobraz();
    }
}
