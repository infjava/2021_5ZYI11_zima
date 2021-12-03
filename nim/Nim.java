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
        this.vykonajPosun(0, oKolko);
    }
    
    public void posunDole(int oKolko) {
        this.vykonajPosun(oKolko, 0);
    }
    
    private void vykonajPosun(int oKolkoRiadkov, int oKolkoStlpcov) {
        if (oKolkoRiadkov <= 0 && oKolkoStlpcov <= 0) {
            System.out.println("Nespravna hodnota tahu");
            return;
        }
        
        int novyRiadok = this.kamen.getRiadok() - oKolkoRiadkov;
        int novyStlpec = this.kamen.getStlpec() - oKolkoStlpcov;
        
        if (novyStlpec <= 0 || novyRiadok <= 0) {
            System.out.println("Nespravna hodnota tahu");
            return;
        }
        
        this.kamen.posunSa(novyRiadok, novyStlpec);
        
        if (novyRiadok == 1 && novyStlpec == 1) {
            this.vyherca = this.getHracNaTahu();
        }
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.hraci.length;
        
        if (this.getHracNaTahu().equals("PC")) {
            // vykonaj tah PC
        }
    }
    
    public int getKamenRiadok() {
        return this.kamen.getRiadok();
    }
    
    public int getKamenStlpec() {
        return this.kamen.getStlpec();
    }
}
