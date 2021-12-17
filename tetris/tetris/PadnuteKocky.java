public class PadnuteKocky {
    private boolean[][] kocky;
    
    public PadnuteKocky() {
        this.kocky = new boolean[Displej.VYSKA][Displej.SIRKA];
    }
    
    public void pridajTetromino(Tetromino tetromino) {
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                if (tetromino.svietiNaPozicii(x, y)) {
                    this.kocky[y][x] = true;
                }
            }
        }
    }
    
    public boolean jeKolizia(Tetromino tetromino) {
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                if (tetromino.svietiNaPozicii(x, y) && this.kocky[y][x]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
