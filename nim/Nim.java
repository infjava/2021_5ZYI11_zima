public class Nim {
    private Kamen kamen;
    private Sachovnica sachovnica;
    private String[] hraci;
    private int indexHracaNaTahu;
    
    public Nim(int sirka, int vyska, String prvyHrac, String druhyHrac) {
        this.sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = this.sachovnica.polozKamen();
        this.sachovnica.zobraz();
        
        this.hraci = new String[] { prvyHrac, druhyHrac };
        this.indexHracaNaTahu = 0;
    }
    
    public String getHracNaTahu() {
        return this.hraci[this.indexHracaNaTahu];
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
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.hraci.length;
    }
}
