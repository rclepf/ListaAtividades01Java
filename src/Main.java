
public class Main {
    public static void main(String[] args) {
        // 1. Cria a matriz 3x2 (3 alunos, 2 notas)
        double[][] notasAlunos = {
                {8.5, 7.0},  // Notas do Aluno 1
                {9.0, 8.0},  // Notas do Aluno 2
                {6.5, 5.0}   // Notas do Aluno 3
        };
        // 3. Percorre cada linha da matriz (cada aluno)
        for (int i = 0; i < notasAlunos.length; i++) {
            double soma = 0;
            // Percorre as colunas da linha atual (as notas do aluno)
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma = soma + notasAlunos[i][j];
            }
            // 4. Calcula a média e imprime
            double media = soma / notasAlunos[i].length;
            System.out.println("A média do Aluno " + (i + 1) + " é: " + media);
        }
    }
}