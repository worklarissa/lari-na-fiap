# exercício 19-Tipos de Dados e Variáveis
valor_inicial = float (input ("Qual o valor do depósito Inicial?"))
juros_anual = float (input ("Qual a taxa de juros anual?"))
tempo = float (input ("Quanto tempo o montante ficará depositado?"))

formula_juroscompostos = valor_inicial * ( 1 + (juros_anual / 100) /12  ) ** ( 12 * tempo)
(print (formula_juroscompostos))