qtd_numeros = 2
numeros1 = []
numeros2 = []

resposta = 'SIM'
while resposta == 'SIM':
    for i in range(qtd_numeros):
        numeros1.append(int(input(f'1º - Número {i+1}: ')))
        numeros2.append(int(input(f'2º - Número {i+1}: ')))

    opcao = input('\n1 - Soma'
                '\n2 - Subtração'
                '\nDigite uma das opções acima:')

    if opcao == '1':
        adicao_numeros = []
        for num1, num2 in zip(numeros1, numeros2):
            adicao_numeros.append(int(num1 + num2))
        print(adicao_numeros)
    elif opcao == '2':
        subt_numeros = []
        for num1, num2 in zip(numeros1, numeros2):
            subt_numeros.append(int(num1 - num2))
        print(subt_numeros)
    else:
        print('Digite 1 ou 2!')
        break
    resposta=input("\nDigite SIM para repetir!: ").upper()