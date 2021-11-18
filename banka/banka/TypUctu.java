public class TypUctu {
    private String nazov;
    private double urokVPercentach;
    
    public TypUctu(String nazov, double urokVPercentach) {
        this.nazov = nazov;
        this.urokVPercentach = urokVPercentach;
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public double getUrokVPercentach() {
        return this.urokVPercentach;
    }
}
