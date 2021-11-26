import java.util.ArrayList;

public class Sachovnica {
    private int sirka;
    
    private ArrayList<Stvorec> policka;
    private ArrayList<Kamen> kamene;
    
    private boolean jeZobrazena;
    
    public Sachovnica(int sirka, int vyska) {
        this.sirka = sirka;
        
        this.jeZobrazena = false;
        
        this.policka = new ArrayList<Stvorec>();
        this.kamene = new ArrayList<Kamen>();
        
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
        for (Kamen kamen : this.kamene) {
            kamen.zobraz();
        }
        this.jeZobrazena = true;
    }
    
    public void skry() {
        for (Kamen kamen : this.kamene) {
            kamen.skry();
        }
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
        this.jeZobrazena = false;
    }
    
    public Kamen polozKamen() {
        Kamen kamen = new Kamen(this);
        this.kamene.add(kamen);
        if (this.jeZobrazena) {
            kamen.zobraz();
        }
        return kamen;
    }
    
    public int getSirka() {
        return this.sirka;
    }
}
