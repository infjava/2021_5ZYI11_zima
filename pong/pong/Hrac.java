public class Hrac {
    private Pad pad;
    private Score score;
    
    public Hrac(boolean jeLavy) {
        this.pad = new Pad(jeLavy);
        this.score = new Score(jeLavy);
    }
    
    public void posunPadHore() {
        this.pad.posunHore();
    }
    
    public void posunPadDole() {
        this.pad.posunDole();
    }
}
