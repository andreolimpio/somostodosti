algoritmo "exemplo_estrutura_codicional"
// Função : Utilizando estrutura condicional (comando SE)
// Autor  : André Olímpio
// Data   : 30/08/2019
// Seção de Declarações 
var
    numero: inteiro
inicio
// Seção de Comandos 
   escreva("Digite um número inteiro: ")
   leia(numero)
   
   escreval
   se (numero mod 2 = 0) ou (numero > 0) entao
      escreva(numero, " é par ou positivo!!!")
   senao
      escreva(numero, " não atende as especificações!!!")
   fimse
fimalgoritmo
