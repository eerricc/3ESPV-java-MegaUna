package br.com.fiap3espv;

import java.util.Scanner;

public class MegaUnaV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        apresentarSaudacao();
        String gamer = coletarNome(scan);
        apresentarDesafio(gamer);
        jogar(gamer, scan);
        finalizarJogo();
    }

    public static void apresentarSaudacao() {
        System.out.println("Bem vindo ao Mega Una 2!");
    }

    public static String coletarNome(Scanner sc) {
        System.out.println("Qual é o seu nome?");
        String jogador = sc.next();
        sc.nextLine();
        return jogador;
    }

    public static void apresentarDesafio(String jogador) {
        System.out.println("Olá, " + jogador + ", nesse jogo, um número será sorteado. Você é capaz de descobrir?");
    }

    public static void jogar(String jogador, Scanner sc) {
        int tentativas = 5;
        int numEscolhido;
        int numSorteado = 49;
        String resposta = "SIM";
        do {
            tentativas--;

            System.out.println("Digite um número entre 1 e 100: ");
            numEscolhido = sc.nextInt();
            if(numEscolhido == numSorteado) {
                System.out.println("Parabéns, " + jogador + ", você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + jogador + "! Não foi dessa vez.");
            }

            if(tentativas > 0) {
                System.out.println("Gostaria de continuar tentando? (sim / não)");
                resposta = sc.next();
            }
        } while(resposta.equalsIgnoreCase("sim") && tentativas > 0);
    }

    public static void finalizarJogo() {
        System.out.println("Fim de jogo!");
    }
}