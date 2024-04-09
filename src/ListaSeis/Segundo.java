package ListaSeis;

import java.util.Scanner;

// Faça um algoritmo que armazena em vetores 3 notas de 1000 alunos.
// Para cada aluno deve ser calculada a média e deve ser armazenada em outro vetor e  Caso a média seja maior que 6 informa "Aprovado", entre 4 e 6 em "Recuperação" e menor que 4 "Reprovado".
// No final apresenta a média das médias dos 1000 alunos.
public class Segundo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma,media;
        double notas[] = new double[10];
        double mediavar[] = new double[10];

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Digite a " + j + " nota do " + i + " aluno: ");
                notas[j] = ler.nextDouble();

            }
            soma = notas[1] + notas[2] + notas[3];
            media = soma/3;
            mediavar[i] = media;

            if (media >= 7) {
                System.out.println("a nota do " + i +" aluno é: " + media);
                System.out.println("Aprovado");
            } else {
                System.out.println("a nota do " + i +" aluno é: " + media);
                System.out.println("Reprovado");
            }
        }
        System.out.println("---------------------------------------------");
        double mediaGeralSoma= mediavar[1] + mediavar[2] + mediavar[3];
        double mediaGeral= mediaGeralSoma/3;
        System.out.println("A media geral da turma é: " + mediaGeral);





    }
}
