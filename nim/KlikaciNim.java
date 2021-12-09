public class KlikaciNim {
    private Nim nim;
    private Manazer manazer;
    
    private int vyska;
    private int sirka;
    
    public KlikaciNim(int sirka, int vyska, String prvyHrac, String druhyHrac) {
        this.nim = new Nim(sirka, vyska, prvyHrac, druhyHrac);
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        
        this.vyska = vyska;
        this.sirka = sirka;
        
        System.out.format("Na tahu je hrac: %s%n", this.nim.getHracNaTahu());
    }
    
    public void vyberSuradnice(int x, int y) {
        int riadok = this.vyska - y / 20;
        int stlpec = x / 20 + 1;
        if (riadok >= 1 && riadok <= this.vyska && stlpec >= 1 && stlpec <= this.sirka) {
            int oKolkoStlpcov = this.nim.getKamenStlpec() - stlpec;
            int oKolkoRiadkov = this.nim.getKamenRiadok() - riadok;
            if (riadok == this.nim.getKamenRiadok()) {
                this.nim.posunVlavo(oKolkoStlpcov);
            } else if (stlpec == this.nim.getKamenStlpec()) {
                this.nim.posunDole(oKolkoRiadkov);
            } else if (oKolkoRiadkov == oKolkoStlpcov) {
                this.nim.posunSikmo(oKolkoRiadkov);
            } else {
                System.out.println("Chybny tah");
            }
        }
        
        if (this.nim.getVyherca() != null) {
            System.out.format("Vyhral: %s%n", this.nim.getVyherca());
        } else {
            System.out.format("Na tahu je hrac: %s%n", this.nim.getHracNaTahu());
        }
    }
}
