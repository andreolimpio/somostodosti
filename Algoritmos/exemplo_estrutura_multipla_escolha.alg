algoritmo "exemplo_estrutura_multipla_escolha"
// Fun��o :  Utilizando estrutura de m�ltipla escolha (comando escolha)
// Autor  :  Andr� Ol�mpio
// Data   :  30/08/2019

// Se��o de Declara��es 
var
   n1, n2: inteiro
   soma, subtracao, multiplicacao: inteiro
   divisao: real
   opcao: caractere
inicio
// Se��o de Comandos 
   escreva("Digite o primeiro n�mero: ")
   leia(n1)
   escreva("Digite o segundo n�mero: ")
   leia(n2)
   
   escreval("Escolha uma das op��es")
   escreval("1 - SOMA")
   escreval("2 - SUBTRA��O")
   escreval("3 - MUTIPLICA��O")
   escreval("4 - DIVIS�O")
   leia(opcao)
   
   escolha opcao
      caso "1"
           soma <- n1 + n2
           escreval("A soma �: ", soma)
      caso "2"
           subtracao <- n1 - n2
           escreval("A subtra��o �: ", subtracao)
      caso "3"
           multiplicacao <- n1 * n2
           escreval("A multiplica��o �: ", multiplicacao)
      caso "4"
           divisao <- n1 / n2
           escreval("A divis�o �: ", divisao)
      outrocaso
           escreval("Op��o inv�lida!!!!")
   fimescolha
fimalgoritmo
