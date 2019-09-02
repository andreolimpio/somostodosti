algoritmo "exemplo_estrutura_multipla_escolha"
// Função :  Utilizando estrutura de múltipla escolha (comando escolha)
// Autor  :  André Olímpio
// Data   :  30/08/2019

// Seção de Declarações 
var
   n1, n2: inteiro
   soma, subtracao, multiplicacao: inteiro
   divisao: real
   opcao: caractere
inicio
// Seção de Comandos 
   escreva("Digite o primeiro número: ")
   leia(n1)
   escreva("Digite o segundo número: ")
   leia(n2)
   
   escreval("Escolha uma das opções")
   escreval("1 - SOMA")
   escreval("2 - SUBTRAÇÃO")
   escreval("3 - MUTIPLICAÇÃO")
   escreval("4 - DIVISÃO")
   leia(opcao)
   
   escolha opcao
      caso "1"
           soma <- n1 + n2
           escreval("A soma é: ", soma)
      caso "2"
           subtracao <- n1 - n2
           escreval("A subtração é: ", subtracao)
      caso "3"
           multiplicacao <- n1 * n2
           escreval("A multiplicação é: ", multiplicacao)
      caso "4"
           divisao <- n1 / n2
           escreval("A divisão é: ", divisao)
      outrocaso
           escreval("Opção inválida!!!!")
   fimescolha
fimalgoritmo
