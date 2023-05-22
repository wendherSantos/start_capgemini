def exibir_cinema(cinema):
    for fila in cinema:
        print(' '.join(fila))
    print()

def reservar_cadeira(cinema, fila, numero):
    if cinema[fila][numero] == 'X':
        cinema[fila][numero] = 'O'
        print('Cadeira reservada com sucesso!')
    else:
        print('Desculpe, essa cadeira já está ocupada.')

cinema = [
    ['X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X'],
    ['X', 'X', 'X', 'X']
]

exibir_cinema(cinema)

while True:
    print('Opções:')
    print('1. Reservar uma cadeira')
    print('2. Sair do programa')

    opcao = input('Escolha uma opção: ')

    if opcao == '1':
        fila = int(input('Informe a fila desejada: ')) - 1
        numero = int(input('Informe o número da cadeira desejada: ')) - 1
        reservar_cadeira(cinema, fila, numero)
        exibir_cinema(cinema)
    elif opcao == '2':
        print('Obrigado por utilizar o programa. Até mais!')
        break
    else:
        print('Opção inválida. Por favor, escolha uma opção válida.')
