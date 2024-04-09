package ListaSeis;
//Em uma eleição presidencial existem quatro candidatos.
//Ao iniciar o programa o presidente do TRE define quantas pessoas vão votar e o voto de cada pessoa deve ser armazenado em um vetor.
//         Os votos são informados
//        através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
//        - 1,2,3,4 = voto para os respectivos candidatos;
//        - 5 =  voto em branco;
//        - caso contrário o voto será nulo;
//        Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
//        - total de votos para cada candidato;
//        - total de votos nulos;
//        - total de votos em branco.

import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int candidatoUm =0 ,candidatoDois= 0,candidatoTres= 0,candidatoQuatro= 0, votosNulo=0,votosBranco=0;
        int pessoas;

        System.out.println("Digite quantas pessoa irão votar: ");
        pessoas = ler.nextInt();
        int votos[]= new int[pessoas];


        for (int i = 0; i < pessoas ; i++) {
            System.out.println("------------------------------------------");
            System.out.println("""
                    1- Candidato Um
                    2- Candidato Dois
                    3- Candidato Tres
                    4- Candidato Quatro
                    5- Voto em branco
                                    
                    """);
            int resposta = ler.nextInt();

            if (resposta == 1) {
                candidatoUm++;
            }else if (resposta == 2){
                candidatoDois++;
            }else if (resposta == 3){
                candidatoTres++;
            }else if (resposta==4){
               candidatoQuatro++;
            }else if (resposta == 5){
                votosBranco++;
            }else {
                votosNulo++;
            }
            votos[i]= resposta;
        }
        System.out.println("------------------------------------------");
        System.out.println("Resultados finais: ");
        System.out.println(candidatoUm+ " Voto(s) candidato um");
        System.out.println(candidatoDois+" Voto(s) candidato dois");
        System.out.println(candidatoTres +" Voto(s) candidato tres");
        System.out.println(candidatoQuatro+" Voto(s) candidato quatro");
        System.out.println(votosBranco+" Voto(s) em branco");
        System.out.println(votosNulo+ " Voto(s) nulos");



    }
}
