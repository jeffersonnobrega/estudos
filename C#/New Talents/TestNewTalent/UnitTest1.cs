
using New_Talents;
using System.Reflection.Metadata.Ecma335;

namespace TestNewTalent

{
    public class UnitTest1
    {
        public Calculadora construirClasse()
        {
            string data = "02/02/2020";
            Calculadora calc = new Calculadora("02/02/2020");
            return calc;

        }

        [Theory]
        [InlineData(1, 2, 3)]
        [InlineData(4, 2, 6)]
        public void Soma (int val1, int val2, int resultado)
        {
            Calculadora calc = construirClasse();

            int resultadoSoma = calc.Somar(val1, val2);

            Assert.Equal(resultado, resultadoSoma);
        }

        [Theory]
        [InlineData(2, 1, 1)]
        [InlineData(4, 2, 2)]
        public void Subtracao(int val1, int val2, int resultado)
        {
            Calculadora calc = construirClasse();

            int resultadoSoma = calc.Subtrair (val1, val2);

            Assert.Equal(resultado, resultadoSoma);
        }

        [Theory]
        [InlineData(2, 1, 2)]
        [InlineData(4, 2, 8)]
        public void Mutiplicacao(int val1, int val2, int resultado)
        {
            Calculadora calc = construirClasse();

            int resultadoSoma = calc.Multiplicar (val1, val2);

            Assert.Equal(resultado, resultadoSoma);
        }

        [Theory]
        [InlineData(8, 2, 4)]
        [InlineData(4, 2, 2)]
        public void Divisao(int val1, int val2, int resultado)
        {
            Calculadora calc = construirClasse();

            int resultadoSoma = calc.Dividir (val1, val2);

            Assert.Equal(resultado, resultadoSoma);
        }

        [Fact]
        public void TestarDivisaoPorZero()
        {
            Calculadora calc = construirClasse();

            Assert.Throws<DivideByZeroException>(() => calc.Dividir(3, 0));

            //aqui ele vai validar exceção. Se retornar a exceção é sucesso
        }

        [Fact]
        public void TestarHistorico()
        {
            Calculadora calc = construirClasse();

            calc.Somar(1, 2);
            calc.Somar(1, 5);
            calc.Somar(1, 6);
            calc.Somar(1, 8); // esses calc é pra criar um histórico

            var lista = calc.Historico();

            Assert.NotEmpty(lista); //vai verificar se a lista não está vazia
            Assert.Equal(3, lista.Count); //a regra de negocio diz que tem que retornar os tres primeiros

        }
    }
}