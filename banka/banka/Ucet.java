public class Ucet {
    private String menoVlastnika;
    private String cisloUctu;
    private long stavUctuVCentoch;
    
    public Ucet(String cisloUctu, String menoVlastnika) {
        this.stavUctuVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.cisloUctu = cisloUctu;
    }
    
    public double getStav() {
        return this.stavUctuVCentoch / 100.0;
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
}
