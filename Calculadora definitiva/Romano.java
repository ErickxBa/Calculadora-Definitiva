public final class Romano extends Número {
    public Romano(int númeroBaseDiez) {
        super(númeroBaseDiez);
    }

    public Romano(String númeroRomano) {
        super(númeroRomano);
    }

    @Override
    public String transformarDecimalABase() {
        int valor = getValor();
        String romano = "";
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valores.length; i++) {
            while (valor >= valores[i]) {
                valor -= valores[i];
                romano += simbolosRomanos[i];
            }
        }
        return romano;
    }

    @Override
    public int transformarBaseADecimal() {
        String romano = getRepresentación();
        int num = 0;
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valores.length; i++) {
            while (romano.startsWith(simbolosRomanos[i])) {
                num += valores[i];
                romano = romano.substring(simbolosRomanos[i].length());
            }
        }
        return num;
    }
}
