using System;
usin System.Collection.Generic;
using System.Text;

namespace MeuSuperBanco
{
    public class Transacao
    {
        public decimal Valor { get; set, }
        public DateTime Data { get; set}
        public string Obs { get; set}

        public Transacao(decimal valor, DateTime data, string obs)
        {
            this.Valor = valor;
            this.Data = data;
            this.Obs = obs;
        }
    }
}