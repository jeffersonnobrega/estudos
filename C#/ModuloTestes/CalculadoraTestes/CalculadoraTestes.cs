using Calculadora.Services;

namespace CalculadoraTestes;

public class CalculadoraTestes
{
    private CalculadoraImp _calc;
    public CalculadoraTestes()
    {
        _calc = new CalculadoraImp();
    }

    [Fact]
    public void DeveSomar5com10eRetorna15()
    {
        //Arrenge - Montar o cenário
        int num1 = 5;
        int num2 = 10;

        //Act - Ação
        int resultado = _calc.Somar(num1, num2);

        //Assert - Valida que retornou o esperado

        Assert.Equal(15, resultado);
    }

    [Fact]
    public void DeveRetornarVerdadeiroSeForPar()
    {
        //arrane

        int numero = 4;

        // act

        bool resultado = _calc.EhPar(numero);

        // assert

        Assert.True(resultado);
    }

    [Theory]
    [InlineData(2)]
    [InlineData(4)]
    [InlineData(6)]
    [InlineData(8)]
    [InlineData(10)]
    public void SeosNumerosForemParesTrue(int numero)
    {
        
        // When
        bool resultado = _calc.EhPar(numero)
    
        // Then
        Assert.True(resultado);
    }

    [Theory]
    [InlineData(new int[] {2, 4})]   
    [InlineData(new int[] {6, 8, 10})]  //poderia ser tudo em um unico array 
    public void SeosNumerosForemParesRetornaTrue(int[] numeros)
    {
        
        // act //assert
        Assert.All(numeros, x => Assert.True(_calc.EhPar(x))); // o x é a variavel que recebe o valor que o loop está percorrendo
    }
}