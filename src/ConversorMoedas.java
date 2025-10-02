public class ConversorMoedas {
    public static void main(String[] args) {
        double valorDolar = 100.00;
        double taxaCambio = 5.20;

        double valorReais = valorDolar * taxaCambio;

        System.out.println("Valor em dólares: $" + valorDolar);
        System.out.println("Taxa de câmbio: " + taxaCambio);
        System.out.println("Valor em reais: R$ " + valorReais);
    }
}
