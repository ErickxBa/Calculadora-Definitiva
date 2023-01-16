public final class Decimal extends Número {

    public Decimal(int númeroBaseDiez) {
        super(númeroBaseDiez);
    }

    public Decimal(String númeroBaseDiez) {
        super(númeroBaseDiez);
    }
    @Override
    public String transformarDecimalABase() {
        return Integer.toString(getValor());
    }

    @Override
    public int transformarBaseADecimal() {
        return Integer.parseInt(getRepresentación());
    }
}
