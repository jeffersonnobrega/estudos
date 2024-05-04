namespace MeuSuperBanco
{
   public  class Conta{
        public string Dono (Get, Set);
        public string NumConta(Set);
        public float Saldo
        {
            get{
                decimal saldo = 0;
                foreach (var item in todasTransacoes)
                {
                    saldo =+ intem.Valor;
                }
                return saldo;
            }
        }
        public static int numconta = 1002763413;

        private List<Transacao> todasTransacoes new List<Transacao>();
        public Conta(string Nome, float Valor )
        {
            this.Dono = Nome;
            this.Saldo = Valor;

            numconta++;

            this.NumConta = numconta.ToString();
        }

        public void Depositar() {

        }

        public void Sacar() {

        }
    }
}