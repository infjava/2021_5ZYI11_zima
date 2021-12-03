public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String[] hraci;
    private int indexHracaNaTahu;
    private String vyherca;
    
    public Nim(int sirka, int vyska, String prvyHrac, String druhyHrac) {
        this.sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = this.sachovnica.polozKamen();
        this.sachovnica.zobraz();
        
        this.hraci = new String[] { prvyHrac, druhyHrac };
        this.indexHracaNaTahu = 0;
        
        this.vyherca = null;
    }
    
    public String getHracNaTahu() {
        return this.hraci[this.indexHracaNaTahu];
    }
    
    public String getVyherca() {
        return this.vyherca;
    }
    
    public void posunVlavo(int oKolko) {
        if (oKolko <= 0) {
            System.out.println("Nespravna hodnota tahu");
            return;
        }
        
        int novyRiadok = this.kamen.getRiadok();
        int novyStlpec = this.kamen.getStlpec() - oKolko;
        
        if (novyStlpec <= 0) {
            System.out.println("Nespravna hodnota tahu");
            return;
        }
        
        this.kamen.posunSa(novyRiadok, novyStlpec);
        
        if (novyRiadok == 1 && novyStlpec == 1) {
            this.vyherca = this.getHracNaTahu();
        }
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.hraci.length;
    }
    
    public void posunDole(int oKolko) {
        if (oKolko <= 0) {
            System.out.println("Nespravna hodnota tahu");
            return;
        }
        
        int novyRiadok = this.kamen.getRiadok() - oKolko;
        int novyStlpec = this.kamen.getStlpec();
        
        if (novyRiadok <= 0) {
            System.out.println("Nespravna hodnota tahu");
            return;
        }
        
        this.kamen.posunSa(novyRiadok, novyStlpec);
        
        if (novyRiadok == 1 && novyStlpec == 1) {
            this.vyherca = this.getHracNaTahu();
        }
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.hraci.length;
    }
    
    public int getKamenRiadok() {
        return this.kamen.getRiadok();
    }
    
    public int getKamenStlpec() {
        return this.kamen.getStlpec();
    }
}
