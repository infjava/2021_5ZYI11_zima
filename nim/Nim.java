import java.util.Random;

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
    
    public void posunSikmo(int oKolko) {
        this.vykonajPosun(oKolko, oKolko);
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
        
        if (this.vyherca == null && this.getHracNaTahu().equals("PC")) {
            if (novyStlpec < novyRiadok) {
                this.posunDole(novyRiadok - novyStlpec);
            } else if (novyStlpec > novyRiadok) {
                this.posunVlavo(novyStlpec - novyRiadok);
            } else {
                Random nahodneCisla = new Random();
                int oKolko;
                if (novyRiadok == 2 || novyRiadok == 3) {
                    oKolko = 1;
                } else {
                    oKolko = nahodneCisla.nextInt(novyRiadok - 2) + 1;
                }
                if (nahodneCisla.nextBoolean()) {
                    this.posunDole(oKolko);
                } else {
                    this.posunVlavo(oKolko);
                }
            }
        }
    }
    
    public int getKamenRiadok() {
        return this.kamen.getRiadok();
    }
    
    public int getKamenStlpec() {
        return this.kamen.getStlpec();
    }
}
