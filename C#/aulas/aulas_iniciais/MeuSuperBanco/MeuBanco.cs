using System;
namespace MeuSuperBanco {
    public class MeuBanco
    {
        static void Main(string[] args) {

            MeuSuperBanco.MeuBanco conta1 = new MeuBanco(Jefferson, 10000);

            Console.WriteLine("$ O Senhor {conta1.Dono} abriu a conta com o saldo de {conta1.Saldo}");
            


        }
    }
}