Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/04/2023
tipo

cadastroCliente = registro

	nome : caractere
	rg: caractere
	idade: inteiro

fimregistro

Var
// Se��o de Declara��es das vari�veis
cliente : vetor[1..5] de cadastroCliente
opcao : caractere
i: inteiro
rgPesquisa: caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...

repita
	Escreval("1 - Cadastrar")
	Escreval("2 - Pesquisar")
	Escreval("3 - Sair")
	leia(opcao)



	se opcao = "1" entao
		para i de 1 ate 3 faca
			se clientes[i].nome = "" entao
			  Escreval("Nome: ")
			  leia(clientes[i].nome)
			  Escreval("RG: ")
			  leia(clientes[i].rg)
			  Escreval("Idade: ")
			  leia(clientes[i].idade)
			interrompa
			fimse
		fimpara
	 senao
	 se opcao = "2" entao
		Escreval("Digite o RG")
		leia(rgPesquisa)
		 para i de 1 ate 3 faca
			se clientes[i].rg = rgPesquisa entao
			  Escreval(clientes[i].nome," encontrado.")
			  interrompa
			fimse
	 	 fimpara

	 fimse
	 fimse
	 
ate opcao = "3"

Fimalgoritmo