numero_alunos = 5
nomes = []
notas = []
media = 0

for i in range(numero_alunos):
    nomes.append(input(f'Informe o nome do aluno {i+1}: '))
    notas.append(float(input(f'Informe a nota de {nomes[i]}: ')))
    media = media + notas [i]

media = media / numero_alunos
print(f'A média da turma é {media:.2f}.')

for i in range(numero_alunos):
    if notas[i] > media:
        print(f'Parabéns {nomes[i]}!')
