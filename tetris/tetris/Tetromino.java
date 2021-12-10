public class Tetromino {
    public Tetromino(boolean[][] tvar) {
        int poziciaX = (Displej.SIRKA - tvar[0].length) / 2;
        int poziciaY = 0;
        
        for (int y = 0; y < tvar.length; y++) {
            for (int x = 0; x < tvar[0].length; x++) {
                Displej.getDisplej().nastav(x + poziciaX, y + poziciaY, tvar[y][x]);
            }
        }
    }
}
