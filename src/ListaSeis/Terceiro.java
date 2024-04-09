package ListaSeis;

import java.util.Scanner;

//3.Faça um algoritmo que armazena em um vetor 15000 números inteiros
// e verifique quantos desses números são Pares e armazena
// em outro vetor apenas esses Pares
// (Um número é PAR quando dividido por 2 seu resto é igual a zero).
public class Terceiro {
    public static void main(String[] args) {
        int numeros[] = new int[15000];
        int primos[]= new int[15000];
        int pares= 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " Numero: ");
            numeros[i] = ler.nextInt();
            if (numeros[i]%2 ==0){
                primos[pares]=numeros[i];
                pares++;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Tem " + pares + " Numeros pares");

    }
}
