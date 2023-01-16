public final class Octal extends Número {
    public Octal(int númeroBaseDiez) {
        super(númeroBaseDiez);
    }

    public Octal(String númeroBaseOcho) {
        super(númeroBaseOcho);
    }

    @Override
    public String transformarDecimalABase() {
        return Integer.toOctalString(getValor());
    }

    @Override
    public int transformarBaseADecimal() {
        return Integer.parseInt(getRepresentación(), 8);
    }
}
