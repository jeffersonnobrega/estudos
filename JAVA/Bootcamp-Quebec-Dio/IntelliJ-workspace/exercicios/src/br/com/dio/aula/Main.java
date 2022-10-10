package br.com.dio.aula;

public class Main {

    public static void main(String[] args) {
        //calculadora

        System.out.println("Exercício calculadora");

        calculadora.soma(3, 6);
        calculadora.subtracao(9, 13);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

    }




