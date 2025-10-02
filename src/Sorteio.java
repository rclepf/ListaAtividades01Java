// É preciso importar a classe Random para poder usá-la
import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. Cria um objeto gerador de números aleatórios
        Random gerador = new Random();

        // 2. Gera um número inteiro aleatório entre 0 e 99, e soma 1.
        // O resultado será um número entre 1 e 100.
        int numeroSecreto = gerador.nextInt(100) + 1;

        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Eu pensei em um número entre 1 e 100. Tente adivinhar!");

        do {
            System.out.print("Qual o seu palpite? ");
            palpite = leitor.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número secreto, que era " + numeroSecreto + "!");
        leitor.close();
    }
}