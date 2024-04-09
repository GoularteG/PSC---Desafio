package ListaSeis;

import java.util.Scanner;

//Escrever um algoritmo que leia 2000 valores para uma variável n e
// para cada um deles, calcule a multiplicação.
// Armazene cada resultado em um vetor. Mostre a tabuada na forma:
//1 x n = n
public class Sexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        int tabuada[]= new int[2500];
        System.out.println("Digite um valor: ");
        valor = ler.nextInt();

        for (int i = 0; i < tabuada.length ; i++) {
            tabuada[i]= valor * (i+1);
        }
        for (int i = 0; i < tabuada.length; i++) {
            System.out.println((i+1) + " X "+ valor + " = "+ tabuada[i]);
        }

    }
}
