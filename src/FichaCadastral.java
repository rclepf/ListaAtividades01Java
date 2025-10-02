public class FichaCadastral {
    public static void main(String[] args) {
        String primeiroNome = "Rodolfo";
        String sobrenome = "Carvalho";
        int idade = 35;
        char inicial = primeiroNome.charAt(0);

        System.out.println("Ficha Cadastral:");
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("Olá, meu nome é " + primeiroNome + " " + sobrenome +
                ", tenho " + idade + " anos e meu nome começa com '" + inicial + "'.");
    }
}
