public enum TvarTetromina {
    I(new boolean[][] {{true, true, true, true}}),
    O(new boolean[][] {{true, true}, {true, true}}),
    T(new boolean[][] {{true, true, true}, {false, true, false}}),
    J(new boolean[][] {{false, true}, {false, true}, {true, true}}),
    L(new boolean[][] {{true, false}, {true, false}, {true, true}}),
    S(new boolean[][] {{false, true, true}, {true, true, false}}),
    Z(new boolean[][] {{true, true, false}, {false, true, true}});
    
    private final boolean[][] tvar;
    
    TvarTetromina(boolean[][] tvar) {
        this.tvar = tvar;
    }
    
    public boolean[][] getTvar() {
        return this.tvar;
    }
}
