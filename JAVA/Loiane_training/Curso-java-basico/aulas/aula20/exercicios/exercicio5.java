package exercicios;

import java.util.Scanner;

/*5. Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por mês, dia e hora
(só 8 horas por dia).*/
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] matrizA = new String[12][30][8]; //30 dias 24 horas 1 tarefa por hora
        int mes = 0;
        int dia = 0;
        int hora=0;
        int agenda = 0;
        String compromisso;
        String agendamento;
        String imprimir;
        boolean flag = true;



        //um compromisso por hora

        do {

            System.out.println("Informe o mês que deseja acessar 1-12: ");
            mes = scan.nextInt();

            System.out.println("Informe o dia que deseja acessar. 1-30: ");
            dia = scan.nextInt();

            System.out.println("Informe a hora que deseja acessar. de 8hs às 14 hs: ");
            hora = scan.nextInt();

            System.out.println("Digite 1 caso queira visualizar a agenda. 2 - Caso deseje incluir evento: ");
            agenda = scan.nextInt();

            if (agenda == 1) {
                if (matrizA[mes - 1][dia -1 ][hora-1] != null) {
                    System.out.println("Compromiso agendado: " + matrizA[mes - 1][dia -1 ][hora-1]);
                } else {
                    System.out.println("Não há compromisso agendado.");

                }

                System.out.println("Deseja adicionar? S-sim N-não");
                scan.nextLine();
                agendamento = scan.next();

                if (agendamento.equals("s")) {
                    System.out.println("Digite o compromisso: ");
                    scan.nextLine();
                    matrizA[mes - 1][dia -1 ][hora-1] = scan.nextLine();

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
                if (matrizA[mes - 1][dia -1 ][hora] != null) {
                    System.out.println("Já existe agenda nesse dia. Digite 1 se deseja visualizar, 2 - Se deseja substituir.");
                    agenda = scan.nextInt();

                    if (agenda == 1) {
                        System.out.println("Abrindo agenda...");
                    } else if (agenda == 2) {
                        System.out.println("Digite o compromisso a ser agendado no mês " + mes + " dia " + dia +  " às " + hora + " horas: ");
                        scan.nextLine(); //ler string depois de ler um int pode pegar espaço em branco, essa opção consome esse espaço em branco
                        matrizA[mes - 1][dia -1 ][hora] = scan.nextLine();
                    } else {
                        System.out.println("Escolha inválida.");
                        break;
                    }
                } else {
                    System.out.println("Digite o compromisso a ser agendado no mês " + mes + "  dia " + dia + " às " + hora + " horas: ");
                    scan.nextLine();
                    matrizA[mes - 1][dia -1 ][hora] = scan.nextLine();
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

        System.out.println("Deseja imprimir toda a agenda? S-sim N-Não");
        imprimir = scan.next();

        // i = mes
        // j = dia
        // k = hora + compromisso


        if(imprimir.equalsIgnoreCase("s")) {
            for (int i=0;i< matrizA.length;i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    for (int k = 0; k < matrizA[i][j].length; k++) {
                        for (int l = 0; l < matrizA[i][j].length; l++) {
                            if (matrizA[mes - 1][dia - 1][hora] != null) {
                                System.out.println("Dia: " + (i + 1) + " Hora: " + j + "hs Compromisso: " + matrizA[i][j][k]);
                            }
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
