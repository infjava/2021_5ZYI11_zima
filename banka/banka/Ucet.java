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
        // this.stavUctuVCentoch = this.stavUctuVCentoch + suma * 100;
        this.stavUctuVCentoch += suma * 100;
    }
    
    public void vyber(double suma) {
        this.stavUctuVCentoch -= suma * 100;
    }
}
