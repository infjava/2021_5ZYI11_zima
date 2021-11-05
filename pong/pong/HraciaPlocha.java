public class HraciaPlocha {
    private Hrac hracLavy;
    private Hrac hracPravy;
    private Lopta lopta;
    private StredovaCiara stredovaCiara;
    
    public HraciaPlocha() {
        this.hracLavy = new Hrac(true);
        this.hracPravy = new Hrac(false);
        this.lopta = new Lopta();
        this.stredovaCiara = new StredovaCiara();
        
        Manazer manzer = new Manazer();
        manzer.spravujObjekt(this);
    }
    
    public void tik() {
        this.lopta.posun();
    }
    
    public void posunHore() {
        this.hracPravy.posunPadHore();
    }
    
    public void posunDole() {
        this.hracPravy.posunPadDole();
    }
    
    public void posunVlavo() {
        this.hracLavy.posunPadHore();
    }
    
    public void posunVpravo() {
        this.hracLavy.posunPadDole();
    }
    
    public void zrus() {
        System.exit(0);
    }
}
