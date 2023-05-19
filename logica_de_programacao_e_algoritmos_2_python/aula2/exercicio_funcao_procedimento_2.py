# Lista para armazenar os clientes
clientes = []

# Função para cadastrar um novo cliente
def cadastrar_cliente():
    nome = input('Digite o nome do cliente: ')
    novo_cliente = {"nome": nome}
    clientes.append(novo_cliente)
    print('Cliente cadastrado com sucesso!')

# Função para excluir um cliente pelo nome
def excluir_cliente():
    nome = input('Digite o nome do cliente a ser excluído: ')
    encontrado = False
    for cliente in clientes:
        if cliente['nome'] == nome:
            clientes.remove(cliente)
            encontrado = True
            print(f'O cliente {nome} foi excluído com sucesso.')
            break
    if not encontrado:
        print(f'O cliente {nome} não foi encontrado.')

# Procedimento para exibir todos os clientes cadastrados
def exibir_clientes():
    if len(clientes) == 0:
        print('Não há clientes cadastrados.')
    else:
        print('Clientes cadastrados:')
        for cliente in clientes:
            print(f'Nome: {cliente["nome"]}')

# Menu principal
while True:
    print('\n=== CADASTRO DE CLIENTES ===')
    print('1 - Cadastrar novo cliente')
    print('2 - Exibir clientes cadastrados')
    print('3 - Excluir cliente')
    print('0 - Sair')
    opcao = input('Digite a opção desejada: ')

    if opcao == '1':
        cadastrar_cliente()
    elif opcao == '2':
        exibir_clientes()
    elif opcao == '3':
        excluir_cliente()
    elif opcao == '0':
        print('Saindo do programa...')
        break
    else:
        print('Opção inválida. Digite novamente.')
