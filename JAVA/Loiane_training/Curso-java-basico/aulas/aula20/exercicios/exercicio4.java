package exercicios;

import java.util.Scanner;

/* Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado*/
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] matrizA = new String[30][24][1]; //30 dias 24 horas 1 tarefa por hora
        int dia=0;
        int parteData;
        int hora=0;
        String compromisso;
        String agendamento;
        String imprimir;
        boolean flag = true;

        int agenda;

        //um compromisso por hora

        do {

            System.out.println("Informe o dia que deseja acessar 1-30: ");
            dia = scan.nextInt();

            System.out.println("Informe a hora que deseja acessar. 0-23: ");
            hora = scan.nextInt();

            System.out.println("Digite 1 caso queira visualizar a agenda. 2 - Caso deseje incluir evento: ");
            agenda = scan.nextInt();

            if (agenda == 1) {
                if (matrizA[dia - 1][hora][0] != null) {
                    System.out.println("Compromiso agendado: " + matrizA[dia - 1][hora][0]);
                } else {
                    System.out.println("Não há compromisso agendado.");

                }

                System.out.println("Deseja adicionar? S-sim N-não");
                agendamento = scan.next();

                if (agendamento.equals("s")) {
                    System.out.println("Digite o compromisso: ");
                    matrizA[dia-1][hora][0] = scan.nextLine();

                    System.out.println("Deseja adicionar novo compromisso?  S-sim N-não: ");
                    agendamento = scan.next();

                    if (agendamento.equals("n")) {
                        break;
                    }

                } else {
                    break;
                }

            }

            if (agenda == 2) {
                if (matrizA[dia - 1][hora][0] != null) {
                    System.out.println("Já existe agenda nesse dia. Digite 1 se deseja visualizar, 2 - Se deseja substituir.");
                    agenda = scan.nextInt();

                    if (agenda == 1) {
                        System.out.println("Abrindo agenda...");
                    } else if (agenda == 2) {
                        System.out.println("Digite o compromisso a ser agendado no dia " + dia + " às " + hora + " horas: ");
                        scan.nextLine(); //ler string depois de ler um int pode pegar espaço em branco, essa opção consome esse espaço em branco
                        matrizA[dia-1][hora][0] = scan.nextLine();
                    } else {
                        System.out.println("Escolha inválida.");
                        break;
                    }
                } else {
                    System.out.println("Digite o compromisso a ser agendado no dia " + dia + " às " + hora + " horas: ");
                    scan.nextLine();
                    matrizA[dia-1][hora][0] = scan.nextLine();
                }
                System.out.println("Deseja adicionar novo compromisso?  S-sim N-não: ");
                agendamento = scan.next();

                if (agendamento.equals("n")) {
                    flag=false;
                }

                } else {
                    flag=true;
                }

            if (flag == false) {
                System.out.println("Deseja sair do programa? S-Sim N-Não");
                agendamento = scan.next();

                if (agendamento.equalsIgnoreCase("s")) {
                    break;
                } else if (agendamento.equalsIgnoreCase("n")) {
                    flag = true;
                } else {
                    System.out.println("Caracter inválido o programa será encerrado.");
                    break;
                }
            }

        }while (flag == true);

        // para finalizar perguntar se deseja imprimir os dias e horas com compromisso, se sim imprimir

        System.out.println("Deseja imprimir toda a agenda do mês? S-sim N-Não");
        imprimir = scan.next();

        // i = dia
        // j = hora
        // k = agenda

            if(imprimir.equalsIgnoreCase("s")) {
                for (int i=0;i< matrizA.length;i++) {
                    for(int j=0;j< matrizA[i].length;j++) {
                        for (int k=0;k< matrizA[i][j].length;k++) {
                            if (matrizA[i][j][k] != null) {
                                System.out.println("Dia: "+ (i+1) + " Hora: " + j + "hs Compromisso: " + matrizA[i][j][k]);
                            }
                        }
                    }
                }

            } else if (imprimir.equalsIgnoreCase("n")) {
                System.out.println("Programa encerrado");

            } else {
                System.out.println("Opção inválida");
            }


    }
}
