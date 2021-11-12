import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;

public class Banka {
    private int kodBanky;
    private ArrayList<Ucet> ucty;
    
    public Banka(int kodBanky) {
        this.kodBanky = kodBanky;
        this.ucty = new ArrayList<Ucet>();
    }
    
    public Ucet zalozUcet(String menoVlastnika) {
        Random nahodneCisla = new Random();
        
        long cisloUctu = Math.abs(nahodneCisla.nextLong()) % 10000000000L;
        
        BigInteger ibanPreVypocet = new BigInteger(
            String.format(
                "%04d000000%010d282000",
                this.kodBanky,
                cisloUctu
            )
        );
        
        int kontrolnaCislica = 98 - ibanPreVypocet
            .mod(new BigInteger("97"))
            .intValue();
        
        String iban = String.format(
            "SK%02d%04d000000%010d",
            kontrolnaCislica,
            this.kodBanky,
            cisloUctu
        );
        Ucet vytvaranyUcet = new Ucet(iban, menoVlastnika);
        this.ucty.add(vytvaranyUcet);
        return vytvaranyUcet;
    }
    
    public Ucet getUcet(String iban) {
        for (Ucet aktualny : this.ucty) {
            if (aktualny.getIban().equals(iban)) {
                return aktualny;
            }
        }
        
        return null;
    }
}
