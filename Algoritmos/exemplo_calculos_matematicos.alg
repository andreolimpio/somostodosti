algoritmo "exemplo_calculos_matematicos"
// Fun��o : Calcular as 4 opera��es fundamentais da Matem�tica
// Autor  : Andr� Ol�mpio
// Data   : 30/08/2019

// Se��o de Declara��es 
var
   n1, n2: inteiro
   soma, subtracao, multiplicacao: inteiro
   divisao: real
inicio
// Se��o de Comandos
   // Entrada de dados
   escreva("Digite o primeiro n�mero: ")
   leia(n1)
   escreva("Digite o segundo n�mero: ")
   leia(n2)
   
   // Processamento de dados
   soma <- n1 + n2
   subtracao <- n1 - n2
   multiplicacao <- n1 * n2
   divisao <- n1 / n2

   // Sa�da de dados
   escreval
   escreval("---------------------------------------------")
   escreval("A soma de ",n1," e ",n2," �: ",soma)
   escreval("A subtra��o de ",n1," e ",n2," �: ",subtracao)
   escreval("A multiplica��o de ",n1," e ",n2," �: ",multiplicacao)
   escreval("A divis�o de ",n1," e ",n2," �: ",divisao)
   escreval("---------------------------------------------")
fimalgoritmo
