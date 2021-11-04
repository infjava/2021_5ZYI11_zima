public class Score {
    private SegmentovyDisplej jednotky;
    private SegmentovyDisplej desiatky;
    
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
    }
    
    public void zvys() {
        
    }
}
