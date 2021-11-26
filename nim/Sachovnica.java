import java.util.ArrayList;

public class Sachovnica {
    private int sirka;
    
    private ArrayList<Stvorec> policka;
    
    public Sachovnica(int sirka, int vyska) {
        this.sirka = sirka;
        
        this.policka = new ArrayList<Stvorec>();
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(20);
                policko.posunZvisle(-50 + y*20);
                policko.posunVodorovne(-60 + x*20);
                policko.zmenFarbu("black");
                if (x % 2 != (vyska - y) % 2) {
                    this.policka.add(policko);
                }
            }
        }
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
    }
    
    public Kamen polozKamen() {
        return new Kamen(this);
    }
    
    public int getSirka() {
        return this.sirka;
    }
}
