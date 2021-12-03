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
    }
    
    public void vyberSuradnice(int x, int y) {
        int riadok = this.vyska - y / 20;
        int stlpec = x / 20 + 1;
        if (riadok >= 1 && riadok <= this.vyska && stlpec >= 1 && stlpec <= this.sirka) {
            if (riadok == this.nim.getKamenRiadok()) {
                int oKolko = this.nim.getKamenStlpec() - stlpec;
                this.nim.posunVlavo(oKolko);
            } else if (stlpec == this.nim.getKamenStlpec()) {
                int oKolko = this.nim.getKamenRiadok() - riadok;
                this.nim.posunDole(oKolko);
            } else {
                System.out.println("Chybny tah");
            }
        }
    }
}
