algoritmo "exemplo_estrutura_repeticao_repita"
// Função : Utilizando conceito de estrutura de repetição (comando REPITA)
// Autor  : André Olímpio
// Data   : 30/08/2019
// Seção de Declarações 
var
   nome: caractere
   contador: inteiro
inicio
// Seção de Comandos 
   escreva("Digite um nome: ")
   leia(nome)
   contador <- 1
   repita
         escreval(contador,"-",nome)
         contador <- contador + 1
   ate (contador > 10)
fimalgoritmo
