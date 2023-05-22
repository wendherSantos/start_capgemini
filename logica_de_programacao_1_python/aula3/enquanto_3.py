qtd_entrevistados = 0
soma_idades = 0
mais_novo = 9999
mais_velho = 0
qtd_menores_idade = 0

resposta = 'SIM'
while resposta == 'SIM':
    idade_informada = int(input('-------------------------------\nFavor, informe a sua idade: '))
    if idade_informada >= mais_velho:
        mais_velho = idade_informada

    if idade_informada <= mais_novo:
        mais_novo = idade_informada

    if idade_informada < 18:
        qtd_menores_idade = qtd_menores_idade + 1

    qtd_entrevistados = qtd_entrevistados + 1
    soma_idades = soma_idades + idade_informada
    porcentagem_menor_idade = (qtd_menores_idade / qtd_entrevistados) * 100
    media_idade = soma_idades / qtd_entrevistados

    resposta=input("-------------------------------\nDigite SIM para continuar: ").upper()

print('-------------------------------\nResumo')
print(f'\nSoma das idades: {soma_idades}')
print(f'Quantidade de entrevistados: {qtd_entrevistados}')
print(f'Mais novo: {mais_novo}')
print(f'Mais velho: {mais_velho}')
print(f'Porcentagem menor idade: {porcentagem_menor_idade:.2f} %.')
print(f'Média de idade: {media_idade:.2f}')
