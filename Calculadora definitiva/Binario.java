public final class Binario extends Número {
    public Binario(int númeroBaseDiez) {
        super(númeroBaseDiez);
    }

    public Binario(String númeroBaseDos) {
        super(númeroBaseDos);
    }

    @Override
    public String transformarDecimalABase() {
        return Integer.toBinaryString(getValor());
    }

    @Override
    public int transformarBaseADecimal() {
        return Integer.parseInt(getRepresentación(), 2);
    }
}
