num_nomes = 4
nomes = []

for i in range(num_nomes):
    nomes.append(input(f'Digite o {i+1}º nome a ser cadastrado: '))

busca = input('\nDigite o nome que deseja pesquisar: ')

for i in nomes:
    if busca == i:
        print('\nNome encontrado na lista!', )
        break
else:
    print('\nNome não encontrado!')