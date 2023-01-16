public final class Complejo extends Número {

    public Complejo(int valorReal, int valorImaginario) {
        super(valorReal, valorImaginario);
    }

    @Override
    public String transformarDecimalABase() {
        int valorImaginario = getValorAdicional();
        if (valorImaginario >= 0) {
            return getValor() + " + " + valorImaginario + "i";
        }
        return getValor() + " - " + Math.abs(valorImaginario) + "i";
    }

    @Override
    public int transformarBaseADecimal() {
        return 0;
    }
}
