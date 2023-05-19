# Variáveis Globais
gabarito = ['A', 'B', 'C', 'F', 'A', 'A', 'A', 'A', 'A', 'A']
alunos = []

# Classe Aluno
class Aluno:
    def __init__(self, nome):
        self.nome = nome
        self.respostas = []
    
    def cadastrar_resposta(self, resposta):
        self.respostas.append(resposta.upper())

    def corrigir_prova(self):
        pontuacao = sum(resposta_aluno == resposta_gabarito for resposta_aluno, resposta_gabarito in zip(self.respostas, gabarito))
        return pontuacao
    
    def exibir_pontuacao(self):
        pontuacao = self.corrigir_prova()
        print(f'\n=== PONTUAÇÃO ===')
        print(f'Aluno: {self.nome}')
        print(f'Pontuação: {pontuacao}/{len(gabarito)}')

# Função para cadastrar um novo aluno
def cadastrar_aluno():
    nome = input('Digite o nome do aluno: ')
    aluno = Aluno(nome)
    alunos.append(aluno)
    print(f'\nAluno {nome} cadastrado com sucesso!')

# Função para cadastrar as respostas de um aluno
def cadastrar_respostas_aluno(aluno):
    print(f'\nCadastrando respostas da prova para o aluno {aluno.nome}:')
    for i in range(1, 11):
        resposta = input(f'Digite a resposta da questão {i}: ')
        aluno.cadastrar_resposta(resposta)

# Menu principal
while True:
    print('\n=== MENU ===')
    print('1 - Cadastrar novo aluno')
    print('2 - Cadastrar respostas da prova')
    print('3 - Exibir pontuação dos alunos')
    print('0 - Sair')
    opcao = input('Digite a opção desejada: ')

    if opcao == '1':
        cadastrar_aluno()
    elif opcao == '2':
        if not alunos:
            print('\nNão há alunos cadastrados.')
        else:
            nome_aluno = input('Digite o nome do aluno: ')
            aluno_encontrado = next((aluno for aluno in alunos if aluno.nome == nome_aluno), None)
            if aluno_encontrado:
                cadastrar_respostas_aluno(aluno_encontrado)
            else:
                print(f'\nAluno {nome_aluno} não encontrado.')
    elif opcao == '3':
        if not alunos:
            print('\nNão há alunos cadastrados')
        else:
            for aluno in alunos:
                aluno.exibir_pontuacao()
    elif opcao == '0':
        print('\nSaindo do programa...')
        break
    else:
        print('\nOpção inválida. Digite novamente.')