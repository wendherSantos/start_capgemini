# Classe
class Registro:
    def __init__(self, nome: str, rg: str, idade: int):
        self.nome = nome
        self.rg = rg
        self.idade = idade

clientes = [] # Lista para armazenar os clientes

# Função para cadastrar um novo cliente
def cadastrar_cliente():
    nome = input('Digite o seu nome: ')
    rg = input('Digite o seu RG: ')
    idade = input('Digite a sua idade: ')

    cliente = Registro(nome, rg, idade)
    clientes.append(cliente)
    print('Cliente cadastrado com sucesso!')

# Função para pesquisar um cliente pelo nome
def pesquisar_cliente():
    nome = input('Digite o nome do cliente: ')
    for cliente in clientes:
        if cliente.nome == nome:
            print('\nDados do cliente:')
            print(f'Nome: {cliente.nome}')
            print(f'RG: {cliente.rg}')
            print(f'Idade: {cliente.idade}')
            return
    print('Cliente não encontrado.')

# Menu
while True:
    print('\n=== MENU ===')
    print('1 - Cadastrar cliente')
    print('2 - Pesquisar cliente')
    print('3 - Sair')
    opcao = input('Digite a opção desejada: ')

    if opcao == '1':
        cadastrar_cliente()
    elif opcao == '2':
        pesquisar_cliente()
    elif opcao == '3':
        print('Saindo do programa...')
        break
    else:
        print('Opção inválida. Digite novamente.')