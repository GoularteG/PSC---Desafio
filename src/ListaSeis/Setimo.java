package ListaSeis;


import java.util.Scanner;

//7.Escrever um algoritmo que armazena em vetores um conjunto de 50000 informações contendo,
// cada uma delas, a altura e o sexo de uma pessoa
// (código=1, masculino  e código=2, feminino), calcule e mostre o seguinte:
//- A maior e a menor altura da turma
//- A média da altura das mulheres
//- A média da altura da turma
public class Setimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] alturas = new double[4];
        int[] sexos = new int[4];
        double maior= 0.0;
        double menor= 100.0;
        double somaMulheres= 0.0, mediaMulheres, mulheres= 0.0;
        double somaTurma = 0.0, mediaTurma;

        for (int i = 0; i < alturas.length ; i++) {
            System.out.println("Digite a altura do "+ (i+1) + " aluno:");
            double altura = ler.nextDouble();
            alturas[i] = altura;
            somaTurma += altura;
            if (altura > maior){
                maior = altura;
            }if (altura<menor){
                menor=altura;
            }
            System.out.println("Digite o sexo do " + (i+1) + " aluno: ");
            System.out.println("""
                    1 - Feminino
                    2 - Masculino""");
            int sexo = ler.nextInt();
            sexos[i] = sexo;
           if (sexo == 1){
               somaMulheres+=altura;
               mulheres++;
           }
        }

        System.out.println("A maior altura: "+ maior + " e a menor altura: "+ menor);
        mediaMulheres= somaMulheres/mulheres;
        System.out.println("A media da altura das mulheres: "+ mediaMulheres);
        mediaTurma= somaTurma/ alturas.length;
        System.out.println("Media da turma: " + mediaTurma);


        }

    }
