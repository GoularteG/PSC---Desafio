package Desafio;


import java.util.Scanner;

//Faça um algoritmo que armazena a quantidade de números definida pelo usuário em dois vetores
// de números positivos e maiores que zero. O primeiro vetor representa
// a base e o segundo vetor o expoente e calcula entre os 2 valores de mesmo índice
// de base e expoente a potência desses valores sem utilizar funções e sem utilizar sinal de multiplicação (*).
// Armazene o resultado em um terceiro vetor na posição de mesmo índice da base e do expoente.
public class Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //numero de operaçoes
        System.out.println("Quantidade de numeros para serem guardados:");
        int x = ler.nextInt();

        //vetores
        double[] base = new double[x];
        double[] expoente = new double[x];
        double[] resultado = new double[x];
        int i = 0;
        double r = 1;

        //preencher vetores
        while (i < x) {
            r = 1;
            System.out.println("Digite a base do " + (i + 1) + " numero");
            double b = ler.nextDouble();
            if (b > 0) {
                base[i] = b;
            } else {
                System.out.println("Numero invalido");
                break;
            }
            System.out.println("Digite o expoente do " + (i + 1) + " numero");
            double e = ler.nextDouble();
            if (e > 0) {
                expoente[i] = e;
            } else {
                System.out.println("Numero invalido");
                break;
            }

            //calculo
            for (int j = 0; j < e; j++) {
                r *= b;
            }
            System.out.println("Resultado potencia do " + (i + 1) + " numero: " + r);
            resultado[i] = r;
            i++;
        }
    }
}