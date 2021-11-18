public class Ucet {
    private String menoVlastnika;
    private String cisloUctu;
    private long stavUctuVCentoch;
    private double urokVPercentach;
    
    public Ucet(String cisloUctu, String menoVlastnika, double urokVPercentach) {
        this.stavUctuVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.cisloUctu = cisloUctu;
        this.urokVPercentach = urokVPercentach;
    }
    
    public double getStav() {
        return this.stavUctuVCentoch / 100.0;
    }
    
    public void pripocitajUroky() {
        this.stavUctuVCentoch += this.stavUctuVCentoch * this.urokVPercentach / 100;
    }
    
    public void vloz(double suma) {
        if (suma <= 0) {
            System.out.println("Nespravna suma vkladu");
            return;
        }
        
        this.stavUctuVCentoch += suma * 100;
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
    }
    
    public String getIban() {
        return this.cisloUctu;
    }
}
