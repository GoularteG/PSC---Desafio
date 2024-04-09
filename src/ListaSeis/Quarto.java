package ListaSeis;

import java.util.Scanner;

//Faça um algoritmo que armazena em um vetor 1500 números inteiros
// e verifique quantos desses números são Ímpares
// (Um número é ÍMPAR quando dividido por 2 seu resto é igual a 1).
// Apresente o final dessa quantidade.
public class Quarto {
    public static void main(String[] args) {
        int numeros[] = new int[15000];
        int primos[]= new int[15000];
        int impares= 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " Numero: ");
            numeros[i] = ler.nextInt();
            if (numeros[i]%2 ==1){
                primos[impares]=numeros[i];
                impares++;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Tem " + impares + " Numeros impares");

    }
}
