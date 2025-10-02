public class CalculadoraEstoque {
    public static void main(String[] args) {
        String produto = "Notebook";
        double preco = 3500.00;
        int quantidade = 5;

        double valorTotal = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + valorTotal);
    }
}
