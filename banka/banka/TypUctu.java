public class TypUctu {
    private String nazov;
    private double urokVPercentach;
    private double poplatokZaVklad;
    private double poplatokZaVyber;
    
    public TypUctu(String nazov, double urokVPercentach, double poplatokZaVklad, double poplatokZaVyber) {
        this.nazov = nazov;
        this.urokVPercentach = urokVPercentach;
        this.poplatokZaVklad = poplatokZaVklad;
        this.poplatokZaVyber = poplatokZaVyber;
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public double getUrokVPercentach() {
        return this.urokVPercentach;
    }
    
    public double getPoplatokZaVklad() {
        return this.poplatokZaVklad;
    }
    
    public double getPoplatokZaVyber() {
        return this.poplatokZaVyber;
    }
}
