using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace New_Talents
{
    public class Calculadora
    {
        private List<string> listaHistorico;
        private string data;

        public Calculadora(string data) 
        { 
            listaHistorico = new List<string>();
            this.data = data;
        }
        public int Somar (int val1, int val2)
        {
            int res = val1 + val2;
            listaHistorico.Insert(0, "Res: " + res + " - data: " + data);
            return res;
        }

        public int Subtrair(int val1, int val2)
        {
            int res = val1 - val2;
            listaHistorico.Insert(0, "Res: " + res + " - data: " + data);
            return res;
        }
        public int Multiplicar(int val1, int val2)
        {
            int res = val1 * val2;
            listaHistorico.Insert(0, "Res: " + res + " - data: " + data);
            return res;
        }
        public int Dividir(int val1, int val2)
        {
            int res = val1 / val2;
            listaHistorico.Insert(0, "Res: " + res + " - data: " + data);
            return res;
        }
        public List<string> Historico() {

            List<string> res; //vai ser feito dessa forma pq a regra de negocio diz que precisa so dos tres primeiros
            listaHistorico.RemoveRange(3,listaHistorico.Count - 3); //vou remover os exedentes dos tres
            //pq 3? 0,1,2 - excluir tudo depois desses, como não sei o tamanho da lista uso o count. Menos 3, pq a formula e 
            // quantos itens tem na lista menos a quantidade que quero deixar
            return listaHistorico; 
        }
    }
}
