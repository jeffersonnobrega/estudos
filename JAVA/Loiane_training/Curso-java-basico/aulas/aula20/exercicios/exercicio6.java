package exercicios;

import java.util.Random;
import java.util.Scanner;
/*Faça um programa para jogar o jogo da velha. O programa deve
permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai
alternadamente informando a posição onde deseja colocar a sua
peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
deve atualizar a situação do tabuleiro na tela.*/

/** LEVANTAMENTO DE REQUISITOS
 *
 * Preciso cruza 3 linhas com três colunas ok
 * Declarar um array char para armazenar X e O que marcarão o jogo ok
 * array tipo char por precisar armazenar apenas uma letra, poupando assim espaço na memória em comparação com String
 * Solicita a entrada do nome dos dois jogadores ok
 * Imprime na tela o jogo vazio com o mapa das posições. E convida o player1 a iniciar a jogada ok
 * O player indicará o espaço no array, exemplo Quadro 1 espaço 1 que será armazenado no array game [0][0] ok
 * abre-se um while de jogada do player1 que estará dentro do while gameOver ok
 * antes de armazenar o jogo deve fazer a verificação se o array já está preenchido, pois não é permitido sobrepor
 * Caso esteja preenchido deve pedir novamente a jogada do player1
 * Caso esteja  vazio armazena jogada
 * Verifica se houve ganhador, caso haja break no loop, preenche a variavel vencedor com o nome do player1, gameOver=false
 * Caso não haja ganhador encerra a jogada
 * imprime na tela o estado atual do jogo da velha e passa para o próximo player;
 *
 * Após isso entra no while do player 2 e faz as mesmas verificações e processos do player 1*/
public class exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        //declaração de variáveis

        String[][] game = new String[3][3];
        String[][] gameAuxiliar = new String[3][3];
        boolean gameOver = true;
        String player1, player2;
        String nomeUm;
        String nomeDois = " ";
        int sorteado;
        int count = 0;

        // pegando o nome dos player
        System.out.print("Entre com o nome do player: ");
        nomeUm = scan.next();

        System.out.print("Entre com o nome de outro player: ");
        nomeDois = scan.next();

        //preenchendo os vetores com o endereços deles para imprimir para o usuário
        // assim o usuário pode visualizar e escolher o endereço onde  deseja jogar
        for (int i = 0; i < gameAuxiliar.length; i++) {
            for (int j = 0; j < gameAuxiliar[i].length; j++) {
                gameAuxiliar[i][j] = "i" + i + " j" + j + ""; // assim fica o endereço i[0] j[0], i[0] j[1] e etc
            }
        }

        // imprimir o jogo da velha povoado com os endereços para servir de mapa aos jogadores

        for (int i = 0; i < gameAuxiliar.length; i++) {
            for (int j = 0; j < gameAuxiliar[i].length; j++) {
                System.out.print("|" + gameAuxiliar[i][j] + "|");
            }
            System.out.println("");
            //System.out.println("_________________________ ");
        }

        // sortear qual player iniciará o jogo

        int min = 1; // valor mínimo do intervalo
        int max = 2; // valor máximo do intervalo

        // Sortear um número entre min e max (incluindo ambos)
        sorteado = aleatorio.nextInt(max - min + 1) + min;
        if (sorteado == 1) {
            player1 = nomeUm;
            player2 = nomeDois;
        } else {
            player1 = nomeDois;
            player2 = nomeUm;
        }

        System.out.println("A BATALHA SERÁ ENTRE " + player1 + " x " + player2);

        // Agora o player 1 escolhe X ou O
        String simbolo;
        String simboloPlayer1 = "";
        String simboloPlayer2 = "";
        // o loop garante que ele usar X ou O
        do {
            System.out.println("Player " + player1 + " pode iniciar o escolhendo X ou O para te representar ");
            simbolo = scan.next();

            if (simbolo.equals("X")) {
                simboloPlayer1 = simbolo;
                simboloPlayer2 = "O";
            } else if (simbolo.equals("O")) {
                simboloPlayer1 = simbolo;
                simboloPlayer2 = "X";
            } else {
                System.out.println("Caracter Inválido. Digite X ou O (maísculos)");
            }
        } while ((!simbolo.equals("X")) && (!simbolo.equals("O")));

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                game[i][j] = i + "-" + j;
            }
        }
        int linha;
        int coluna;
        boolean flag = true;
        String vencedor = "";


        while (gameOver == true) {
            linha = 0;
            coluna = 0;

            while (flag == true) {
                System.out.println("Jogada do Player 1"); //player 1
                System.out.println("De acordo com o mapa digite a posição da sua jogada ");
                System.out.println(player1 + " digite a linha: ");
                linha = scan.nextInt();
                System.out.println(player1 + " digite a coluna: ");
                coluna = scan.nextInt();

                // povoar o array
                if (game[linha][coluna].equals("X") || game[linha][coluna].equals("O")) {
                    System.out.println("Posição já preenchida. Analise novamente o mapa:");

                    for (int i = 0; i < gameAuxiliar.length; i++) {
                        for (int j = 0; j < gameAuxiliar[i].length; j++) {
                            if (game[linha][coluna].equals("X") || game[linha][coluna].equals("O")) {
                                gameAuxiliar[i][j] = game[linha][coluna];
                            }
                            gameAuxiliar[i][j] = "i" + i + " j" + j + ""; // assim fica o endereço i[0] j[0], i[0] j[1] e etc

                        }
                    }

                    // imprime o mapa

                    for (int i = 0; i < game.length; i++) {
                        for (int j = 0; j < game[i].length; j++) {
                            System.out.print("|" + game[i][j] + "|");
                        }
                        System.out.println("");
                        //System.out.println("_________________________ ");
                    }
                } else {
                    game[linha][coluna] = simboloPlayer1;

                    break;

                }

            }
            // faz a verificação se houve ganhador

            //POSIÇÃO XIS

            if (game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
                gameOver = false;
                vencedor = player1;
                flag = false;
                break;
            } else if (game[0][2] == game[1][1] && game[0][2] == game[2][0]){
                gameOver = false;
                vencedor = player1;
                flag = false;
                break;
            }

            // HORIZONTAL
            for (int i = 0; i < game.length; i++) {
                if (game[i][0] == game[i][1] && game[i][0] == game[i][2]) {
                    gameOver = false;
                    vencedor = player1;
                    flag = false;
                    break;
                }
            }

            // VERTICAL

            for (int i = 0; i < game.length; i++) {
                if (game[0][i] == game[1][i] && game[0][i] == game[2][i]) {
                    gameOver = false;
                    vencedor = player1;
                    flag = false;
                    break;
                }
            }

            // jogada do player 2


            while (flag == true) {
                System.out.println(player2 + " de acordo com o mapa digite a posição da sua jogada ");
                System.out.println(player2 + " digite a linha: ");
                linha = scan.nextInt();
                System.out.println(player2 + " digite a coluna: ");
                coluna = scan.nextInt();

                // povoar o array
                if (game[linha][coluna].equals("X") || game[linha][coluna].equals("O")) {
                    System.out.println("Posição já preenchida. Analise novamente o mapa:");

                    // imprime o mapa
                    for (int i = 0; i < gameAuxiliar.length; i++) {
                        for (int j = 0; j < gameAuxiliar[i].length; j++) {
                            if (game[linha][coluna].equals("X") || game[linha][coluna].equals("O")) {
                                gameAuxiliar[i][j] = game[linha][coluna];
                            }
                            gameAuxiliar[i][j] = "i" + i + " j" + j + ""; // assim fica o endereço i[0] j[0], i[0] j[1] e etc

                        }
                    }

                    // imprime o mapa

                    for (int i = 0; i < game.length; i++) {
                        for (int j = 0; j < game[i].length; j++) {
                            System.out.print("|" + game[i][j] + "|");
                        }
                        System.out.println("");
                    }

                } else {
                    game[linha][coluna] = simboloPlayer2;
                    break;

                }

            }

            // verifica se houve ganhador

            //POSIÇÃO X

            if (game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
                gameOver = false;
                vencedor = player2;
                flag = false;
                break;
            } else if (game[0][2] == game[1][1] && game[0][2] == game[2][0]){
                gameOver = false;
                vencedor = player2;
                flag = false;
                break;
            }

            //HORIZONTAL
            for (int i = 0; i < game.length; i++) {
                if (game[i][0] == game[i][1] && game[i][0] == game[i][2]) {
                    gameOver = false;
                    vencedor = player2;
                    flag = false;
                    break;
                }
            }

            //VERTICAL

            for (int i = 0; i < game.length; i++) {
                if (game[0][i] == game[1][i] && game[0][i] == game[2][i]) {
                    gameOver = false;
                    vencedor = player2;
                    flag = false;
                    break;
                }
            }

            // XIS





        }

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
               if (game[i][j].equals("X") || game[i][j].equals("O")) {

               } else {
                   game[i][j] = " ";

               }
            }


        }
        System.out.println("PARABÉNS " + vencedor + " VOCÊ VENCEU O JOGO:");
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print("|" + game[i][j] + "|");
            }
            System.out.println("");

        }
    }

}
