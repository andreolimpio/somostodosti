algoritmo "exemplo_estrutura_repeticao_repita"
// Fun��o : Utilizando conceito de estrutura de repeti��o (comando REPITA)
// Autor  : Andr� Ol�mpio
// Data   : 30/08/2019
// Se��o de Declara��es 
var
   nome: caractere
   contador: inteiro
inicio
// Se��o de Comandos 
   escreva("Digite um nome: ")
   leia(nome)
   contador <- 1
   repita
         escreval(contador,"-",nome)
         contador <- contador + 1
   ate (contador > 10)
fimalgoritmo
