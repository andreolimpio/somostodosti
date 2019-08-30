algoritmo "exemplo_calculos_matematicos"
// Função : Calcular as 4 operações fundamentais da Matemática
// Autor  : André Olímpio
// Data   : 30/08/2019

// Seção de Declarações 
var
   n1, n2: inteiro
   soma, subtracao, multiplicacao: inteiro
   divisao: real
inicio
// Seção de Comandos
   // Entrada de dados
   escreva("Digite o primeiro número: ")
   leia(n1)
   escreva("Digite o segundo número: ")
   leia(n2)
   
   // Processamento de dados
   soma <- n1 + n2
   subtracao <- n1 - n2
   multiplicacao <- n1 * n2
   divisao <- n1 / n2

   // Saída de dados
   escreval
   escreval("---------------------------------------------")
   escreval("A soma de ",n1," e ",n2," é: ",soma)
   escreval("A subtração de ",n1," e ",n2," é: ",subtracao)
   escreval("A multiplicação de ",n1," e ",n2," é: ",multiplicacao)
   escreval("A divisão de ",n1," e ",n2," é: ",divisao)
   escreval("---------------------------------------------")
fimalgoritmo
