public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    
    public Nim(int sirka, int vyska) {
        this.sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = this.sachovnica.polozKamen();
        this.sachovnica.zobraz();
    }
    
    public void posunVlavo(int oKolko) {
        
    }
    
    public void posunDole(int oKolko) {
        
    }
}
