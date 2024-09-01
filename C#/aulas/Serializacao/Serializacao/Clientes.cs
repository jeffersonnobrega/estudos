using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Serializacao
{
    internal class Clientes
    {

        public Clientes(int id, string produto, decimal preco )
        {
            Id = id;
            Produto = produto;
            preco = Preco;
        }
        public int Id { get; set; }
        public string Produto { get; set; }
        public decimal Preco { get; set; }

    }
}
