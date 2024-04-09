package ListaSeis;

import java.util.Scanner;

public class AtvPapel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] numero = new double[1000];
        double[] numeros = new double[1000];
        double soma = 0;

        for (int i = 0; i < numero.length; i++) {
            soma= 0;
            System.out.println("Digite o primeiro numero da "+ (i+1) + " Multiplicaçao");
            numero[i]= ler.nextDouble();
            System.out.println("Digite o segundo numero da "+ (i+1) + " Multiplicaçao");
            numeros[i]= ler.nextDouble();
            for (int j = 0; j < numeros[i]; j++) {
                soma += numero[i];

            }
            System.out.println(" A multiplicação é igual a: " + soma);

        }
    }
}
