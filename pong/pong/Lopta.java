import java.util.Random;

public class Lopta {
    private Kruh lopta;
    private int smerX;
    private int smerY;
    private int poziciaY;
    private int poziciaX;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        
        this.poziciaY = nahodneCisla.nextInt(291) + 5;
        this.poziciaX = 150;
        
        this.lopta = new Kruh();
        this.lopta.zmenPriemer(10);
        this.lopta.posunVodorovne(125);
        this.lopta.posunZvisle(this.poziciaY - 65);
        this.lopta.zobraz();
        
        if (nahodneCisla.nextBoolean()) {
            this.smerX = 5;
        } else {
            this.smerX = -5;
        }
        
        if (nahodneCisla.nextBoolean()) {
            this.smerY = 5;
        } else {
            this.smerY = -5;
        }
    }
    
    public void posun() {
        if (this.poziciaY <= 5 || this.poziciaY >= 295) {
            this.smerY = -this.smerY;
        }
        this.lopta.skry();
        this.lopta.posunVodorovne(this.smerX);
        this.lopta.posunZvisle(this.smerY);
        this.lopta.zobraz();
        this.poziciaX += this.smerX;
        this.poziciaY += this.smerY;
    }
    
    public boolean jeMimoObrazovkyVpravo() {
        return this.poziciaX > 305;
    }
    
    public boolean jeMimoObrazovkyVlavo() {
        return this.poziciaX < -5;
    }
    
    public void odrazSaOdPadu() {
        this.smerX = -this.smerX;
    }
    
    public int getPoziciaX() {
        return this.poziciaX;
    }
    
    public int getPoziciaY() {
        return this.poziciaY;
    }
}
