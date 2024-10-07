using System;
using System.Collections.Generic;
using Calculadora.Services;

namespace CalculadoraTestes
{
    
    public class ValidacoesStringTestes{
        
        private ValidacoesString _validacoes;

        public ValidacoesStringTestes(){
            _validacoes = new ValidacoesString();
        }
        [Fact]
        public void Contar3CaracteresEmOlaRetornar3(){
            //Arrange
            string texto = "Ola";
            //Act
            int resultado = _validacoes.ContarCaracteres(texto);
            //Assert
            Assert.Equal(3, resultado);

        }

    }
}