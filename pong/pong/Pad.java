public class Pad {
    private Obdlznik pad;
    private int poziciaX;
    private int poziciaY;
    
    public Pad(boolean jeLavy) {
        this.pad = new Obdlznik();
        this.pad.zmenStrany(10, 50);
        if (jeLavy) {
            this.poziciaX = 5;
            this.pad.posunVodorovne(-60);
        } else {
            this.poziciaX = 295;
            this.pad.posunVodorovne(230);
        }
        this.pad.posunZvisle(75);
        this.pad.zobraz();
        
        this.poziciaY = 150;
    }
    
    public void posunDole() {
        if (this.poziciaY < 275) {
            this.pad.posunZvisle(5);
            this.poziciaY += 5;
        }
    }
    
    public void posunHore() {
        if (this.poziciaY > 25) {
            this.pad.posunZvisle(-5);
            this.poziciaY -= 5;
        }
    }
    
    public boolean kolidujeS(Lopta lopta) {
        if (this.poziciaX - 5 <= lopta.getPoziciaX() && lopta.getPoziciaX() <= this.poziciaX + 5) {
            if (this.poziciaY - 25 <= lopta.getPoziciaY() && lopta.getPoziciaY() <= this.poziciaY + 25) {
                return true;
            }
        }
        return false;
    }
}
