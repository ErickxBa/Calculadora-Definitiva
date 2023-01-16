public class Main {
    public static void main(String[] args) {
        Decimal total1= new Decimal(Calculadora.sumar(new Decimal("2"),new Decimal("4")));
        Decimal total2 = new Decimal(Calculadora.dividir(new Decimal("40"), new Decimal(8)));
        Binario total3 = new Binario(Calculadora.sumar(new Binario("1000"), new Binario(4)));
        Octal total4 = new Octal(Calculadora.sumar(new Octal("12"), new Octal(6)));
        Hexadecimal total5 = new Hexadecimal(Calculadora.restar(new Hexadecimal("B"), new Hexadecimal(4)));
        Romano total6 = new Romano(Calculadora.sumar(new Romano("XLV"), new Romano(5)));
        Complejo total7 = Calculadora.sumar(new Complejo(4, 6), new Complejo(5, 9));

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
        System.out.println(total6);
        System.out.println(total7);
    }
}