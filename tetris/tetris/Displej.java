public class Displej {
    private static final int VYSKA = 20;
    private static final int SIRKA = 10;
    private static final int VELKOST_PIXELU = 15;
    
    public Displej() {
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                Stvorec pixel = new Stvorec();
                pixel.zmenStranu(Displej.VELKOST_PIXELU - 1);
                pixel.posunVodorovne(-60 + x * Displej.VELKOST_PIXELU);
                pixel.posunZvisle(-50 + y * Displej.VELKOST_PIXELU);
                pixel.zobraz();
            }
        }
    }
    
    public void nastav(int x, int y, boolean svieti) {
        
    }
}
