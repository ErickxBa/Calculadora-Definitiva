public abstract class Número {
    private final String representación;
    private final int valor;
    private int valorAdicional;


    public Número(int númeroBaseDiez, int...númeroAdicional) {
        this.valor = númeroBaseDiez;
        if (númeroAdicional.length > 0) {
            this.valorAdicional = númeroAdicional[0];
        }
        this.representación = transformarDecimalABase();
    }

    public Número(String númeroBase) {
        this.representación = númeroBase;
        this.valor = transformarBaseADecimal();
    }

    public String getRepresentación() {
        return representación;
    }

    public int getValor() {
        return valor;
    }
    public int getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        return representación;
    }

    public abstract String transformarDecimalABase();

    public abstract int transformarBaseADecimal();
}
