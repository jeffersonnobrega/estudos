using System;

class Program
{
    static void Main(string[] args)
    {
        // Lendo o saldo inicial da entrada
        int saldoTotal = int.Parse(Console.ReadLine());

        // Lendo o valor do saque da entrada
        int valorSaque = int.Parse(Console.ReadLine());

        // Verificando se o saque pode ser realizado
        if (valorSaque <= saldoTotal)
        {
            // Realiza o saque subtraindo o valor do saque do saldo total
            saldoTotal -= valorSaque;
            // Imprime a mensagem de sucesso com o novo saldo
            Console.WriteLine($"Saque realizado com sucesso! Novo saldo: {saldoTotal}");
        }
        else
        {
            // Imprime a mensagem de erro se o saldo for insuficiente
            Console.WriteLine("Saldo insuficiente. Saque nao realizado!");
        }
    }
}
