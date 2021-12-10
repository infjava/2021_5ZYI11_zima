public class Tetromino {
    private int poziciaX;
    private int poziciaY;
    private boolean[][] tvar;
    
    public Tetromino(boolean[][] tvar) {
        this.poziciaX = (Displej.SIRKA - tvar[0].length) / 2;
        this.poziciaY = 0;
        this.tvar = tvar;
        
        this.nakresli();
    }
    
    public void posunDole() {
        if (this.poziciaY >= Displej.VYSKA - tvar.length) {
            return;
        }
        
        this.skry();
        this.poziciaY++;
        this.nakresli();
    }
    
    public void posunVlavo() {
        if (this.poziciaX <= 0) {
            return;
        }
        
        this.skry();
        this.poziciaX--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        if (this.poziciaX >= Displej.SIRKA - tvar[0].length) {
            return;
        }
        
        this.skry();
        this.poziciaX++;
        this.nakresli();
    }
    
    private void nakresli() {
        for (int y = 0; y < this.tvar.length; y++) {
            for (int x = 0; x < this.tvar[0].length; x++) {
                Displej.getDisplej().nastav(x + this.poziciaX, y + this.poziciaY, this.tvar[y][x]);
            }
        }
    }
    
    private void skry() {
        for (int y = 0; y < this.tvar.length; y++) {
            for (int x = 0; x < this.tvar[0].length; x++) {
                Displej.getDisplej().nastav(x + this.poziciaX, y + this.poziciaY, false);
            }
        }
    }
}
