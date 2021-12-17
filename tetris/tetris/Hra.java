public class Hra {
    private Tetromino padajuce;
    private PadnuteKocky padnute;
    
    public Hra() {
        this.padajuce = new Tetromino(TvarTetromina.getNahodne());
        this.padnute = new PadnuteKocky();
        new Manazer().spravujObjekt(this);
    }
    
    public void posunVlavo() {
        this.padajuce.posunVlavo();
    }
    
    public void posunVpravo() {
        this.padajuce.posunVpravo();
    }
    
    public void aktivuj() {
        this.padajuce.otoc();
    }
    
    public void tik() {
        if (this.padajuce.getJeUplneDole()) {
            this.padnute.pridajTetromino(this.padajuce);
            this.padajuce = new Tetromino(TvarTetromina.getNahodne());
        } else {
            if (this.padnute.jeKolizia(this.padajuce)) {
                this.padnute.pridajTetromino(this.padajuce);
                this.padajuce = new Tetromino(TvarTetromina.getNahodne());
            } else {
                this.padajuce.posunDole();
            }
        }
    }
    
    public void zrus() {
        System.exit(0);
    }
}
