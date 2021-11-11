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
        if (suma > 0) {
            this.stavUctuVCentoch += suma * 100;
        } else {
            System.out.println("Nespravna suma vkladu");
        }
    }
    
    public void vyber(double suma) {
        if (suma > 0) {
            if (suma * 100 <= this.stavUctuVCentoch) {
                this.stavUctuVCentoch -= suma * 100;
            } else {
                System.out.println("Telo penazi nemas");
            }
        } else {
            System.out.println("Nespravna suma vyberu");
        }
    }
}
