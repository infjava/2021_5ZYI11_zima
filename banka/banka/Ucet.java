public class Ucet {
    private String menoVlastnika;
    private String cisloUctu;
    private long stavUctuVCentoch;
    private TypUctu typUctu;
    private Banka banka;
    
    public Ucet(Banka banka, String cisloUctu, String menoVlastnika, TypUctu typUctu) {
        this.stavUctuVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.cisloUctu = cisloUctu;
        this.typUctu = typUctu;
        this.banka = banka;
    }
    
    public double getStav() {
        return this.stavUctuVCentoch / 100.0;
    }
    
    public void pripocitajUroky() {
        this.stavUctuVCentoch += this.stavUctuVCentoch * this.typUctu.getUrokVPercentach() / 100;
    }
    
    public void vloz(double suma) {
        if (suma <= 0) {
            System.out.println("Nespravna suma vkladu");
            return;
        }
        
        if (suma * 100 + this.stavUctuVCentoch < this.typUctu.getPoplatokZaVklad() * 100) {
            System.out.println("Nemas na poplatok za vklad");
            return;
        }
        
        this.stavUctuVCentoch += suma * 100;
        this.stavUctuVCentoch -= this.typUctu.getPoplatokZaVklad() * 100;
    }
    
    public void vyber(double suma) {
        if (suma <= 0) {
            System.out.println("Nespravna suma vyberu");
            return;
        }
        
        double vybernaSumaVCentoch = suma * 100 + this.typUctu.getPoplatokZaVyber() * 100;
        
        if (vybernaSumaVCentoch > this.stavUctuVCentoch) {
            System.out.println("Telo penazi nemas");
            return;
        }
        
        this.stavUctuVCentoch -= vybernaSumaVCentoch;
    }
    
    public String getIban() {
        return this.cisloUctu;
    }
    
    public void preved(String iban, double suma) {
        if (suma <= 0) {
            System.out.println("Nespravna suma vyberu");
            return;
        }
        
        if (suma * 100 > this.stavUctuVCentoch) {
            System.out.println("Telo penazi nemas");
            return;
        }
        
        Ucet ciel = this.banka.getUcet(iban);
        this.stavUctuVCentoch -= suma * 100;
        ciel.stavUctuVCentoch += suma * 100;
    }
}
