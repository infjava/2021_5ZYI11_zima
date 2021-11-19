public class Ucet {
    private String menoVlastnika;
    private String cisloUctu;
    private long stavUctuVCentoch;
    private TypUctu typUctu;
    
    public Ucet(String cisloUctu, String menoVlastnika, TypUctu typUctu) {
        this.stavUctuVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.cisloUctu = cisloUctu;
        this.typUctu = typUctu;
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
        
        this.stavUctuVCentoch += suma * 100;
        this.stavUctuVCentoch -= this.typUctu.getPoplatokZaVklad() * 100;
    }
    
    public void vyber(double suma) {
        if (suma <= 0) {
            System.out.println("Nespravna suma vyberu");
            return;
        }
        
        if (suma * 100 > this.stavUctuVCentoch) {
            System.out.println("Telo penazi nemas");
            return;
        }
        
        this.stavUctuVCentoch -= suma * 100;
        this.stavUctuVCentoch -= this.typUctu.getPoplatokZaVyber() * 100;
    }
    
    public String getIban() {
        return this.cisloUctu;
    }
}
