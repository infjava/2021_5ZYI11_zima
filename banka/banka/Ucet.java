public class Ucet {
    private String menoVlastnika;
    private String cisloUctu;
    private long stavUctuVCentoch;
    
    public Ucet(String cisloUctu, String menoVlastnika) {
        this.stavUctuVCentoch = 0;
        this.menoVlastnika = menoVlastnika;
        this.cisloUctu = cisloUctu;
    }
}
