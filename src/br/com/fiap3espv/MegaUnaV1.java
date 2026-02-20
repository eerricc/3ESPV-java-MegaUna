package br.com.fiap3espv;

import java.util.Scanner;

public class MegaUnaV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEscolhido;
        int numSorteado = (int) (Math.random() * 100 + 1);
        String resposta = "SIM";
        int tentativas = 5;
        String jogador;

        System.out.println("Bem vindo ao Mega Una 1!");

        System.out.println("Qual é o seu nome? ");
        jogador = sc.next();
        sc.nextLine();

        System.out.println("Olá, " + jogador + ", nesse jogo, um número será sorteado. Você é capaz de descobrir?");

        do {
            tentativas--;

            System.out.println("Digite um número entre 1 e 100: ");
            numEscolhido = sc.nextInt();
            if(numEscolhido == numSorteado) {
                System.out.println("Parabéns," + jogador + ", você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + jogador + "! Não foi dessa vez.");
            }

            if(tentativas > 0) {
                System.out.println("Gostaria de continuar tentando? (sim / não)");
                resposta = sc.next();
            }
        } while(resposta.equalsIgnoreCase("sim") && tentativas > 0);

        System.out.println("Fim de jogo!");
    }
}