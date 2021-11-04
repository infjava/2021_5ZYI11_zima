public class Score {
    private SegmentovyDisplej jednotky;
    private SegmentovyDisplej desiatky;
    private int aktualneScore;
    
    public Score(boolean jeLavy) {
        if (jeLavy) {
            this.desiatky = new SegmentovyDisplej(30, 0);
            this.jednotky = new SegmentovyDisplej(80, 0);
        } else {
            this.desiatky = new SegmentovyDisplej(180, 0);
            this.jednotky = new SegmentovyDisplej(230, 0);
        }
        
        this.desiatky.zobrazCislicu(0);
        this.jednotky.zobrazCislicu(0);
        
        this.aktualneScore = 0;
    }
    
    public void zvys() {
        //this.aktualneScore += 1;
        this.aktualneScore++;
        this.desiatky.zobrazCislicu(this.aktualneScore / 10);
        this.jednotky.zobrazCislicu(this.aktualneScore % 10);
    }
}
