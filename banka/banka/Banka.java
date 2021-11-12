import java.util.Random;

public class Banka {
    private int kodBanky;
    
    public Banka(int kodBanky) {
        this.kodBanky = kodBanky;
    }
    
    public Ucet zalozUcet(String menoVlastnika) {
        Random nahodneCisla = new Random();
        
        long cisloUctu = Math.abs(nahodneCisla.nextLong()) % 10000000000L;
        
        String iban = String.format(
            "SK%02d%04d000000%010d",
            14,
            this.kodBanky,
            cisloUctu
        );
        return new Ucet(iban, menoVlastnika);
    }
}
