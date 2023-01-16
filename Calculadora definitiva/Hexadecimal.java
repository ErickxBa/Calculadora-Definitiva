public final class Hexadecimal extends Número {
    public Hexadecimal(int númeroBaseDiez) {
        super(númeroBaseDiez);
    }

    public Hexadecimal(String númeroBase16) {
        super(númeroBase16);
    }

    @Override
    public String transformarDecimalABase() {
        return Integer.toHexString(getValor());
    }

    @Override
    public int transformarBaseADecimal() {
        return Integer.parseInt(getRepresentación(), 16);
    }
}
