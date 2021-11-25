public class Sachovnica {
    public Sachovnica(int sirka, int vyska) {
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(20);
                policko.posunZvisle(-50 + y*20);
                policko.posunVodorovne(-60 + x*20);
                policko.zmenFarbu("black");
                if (x % 2 != (vyska - y) % 2) {
                    policko.zobraz();
                }
            }
        }
    }
}
