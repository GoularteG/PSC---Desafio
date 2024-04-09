package ListaSeis;

import java.util.Scanner;

public class AtvPotencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int potencia;
        int numero;
        int resultado = 1;
        System.out.println("Escreva o 1 numero");
        numero= ler.nextInt();
        System.out.println("Escreva o 2 numero");
        potencia= ler.nextInt();
        for (int i = 0; i < potencia ; i++) {
            resultado *= numero;

        }
        System.out.println(resultado);
    }
}
