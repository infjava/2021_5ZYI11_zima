public class Displej {
    public Displej() {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 10; x++) {
                Stvorec pixel = new Stvorec();
                pixel.zmenStranu(14);
                pixel.posunVodorovne(-60 + x * 15);
                pixel.posunZvisle(-50 + y * 15);
                pixel.zobraz();
            }
        }
        // sirka je 10
        // vyska je 20
    }
    
    public void nastav(int x, int y, boolean svieti) {
        
    }
}
