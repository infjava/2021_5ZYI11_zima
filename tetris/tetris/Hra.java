public class Hra {
    private Tetromino padajuce;
    
    public Hra() {
        this.padajuce = new Tetromino(TvarTetromina.getNahodne());
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
            this.padajuce = new Tetromino(TvarTetromina.getNahodne());
        } else {
            this.padajuce.posunDole();
        }
    }
    
    public void zrus() {
        System.exit(0);
    }
}
