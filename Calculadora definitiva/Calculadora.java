public class Calculadora {
    public static int sumar(Número n1, Número n2) {
        return (n1.getValor() + n2.getValor());
    }

    public static Complejo sumar(Complejo n1, Complejo n2) {
        return new Complejo(n1.getValor() + n2.getValor(), n1.getValorAdicional() + n2.getValorAdicional());
    }

    public static int restar(Número n1, Número n2) {
        return (n1.getValor() - n2.getValor());
    }

    public static int multiplicar(Número n1, Número n2) {
        return (n1.getValor() * n2.getValor());
    }

    public static int dividir(Número n1, Número n2) {
        return (n1.getValor() / n2.getValor());
    }
}
