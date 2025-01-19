function calcular(operacao) {
    const n1 = document.getElementById('n1').value                 
    const n2 = document.getElementById('n2').value

    let resultado
    switch(operacao) {
        case '+' : resultado = somar(n1,n2); break;
        case '-' : resultado = subtrair(n1,n2); break;
        case '*' : resultado = multiplicar(n1,n2); break;
        case '/' : resultado = dividir(n1,n2); break;
        default:
            resultado: "Operação inválida";
    }

   

    document.getElementById('resultado').innerHTML = "O resultado é " + resultado

}

function somar(n1, n2) {
 
    return Number(n1) + Number(n2)

    //const resultado = document.getElementById('resultado')
    //resultado.innerHTML = "A Soma dos números é " + soma // innerhtml é para manipular html interno

    //forma mais simples de escrever o que está acima

  
}

function subtrair(n1, n2){
   
    return Number(n1) - Number(n2)
    
}

function multiplicar(n1,n2){
 
    return Number(n1) * Number(n2)

}

function dividir(n1,n2){
    if (Number(n2) === 0) {
        return "Não é possível dividir por zero";
    } else {
        return Number(n1)/Number(n2)
    }
}

// outra forma de escrevver função

const funcaodeExpressao = function (n1, n2) { // observa que a função não tem nome
    return n1 + n2
}

// arrow function

const somaArrow = (n1, n2) => {
    return n1 + n2
}

const somaArrowDois = (n1, n2) => (
    n1 + n2
) // com parenteses não repcisa do return

const somaArrowTres = (n1, n2) => n1 + n2
