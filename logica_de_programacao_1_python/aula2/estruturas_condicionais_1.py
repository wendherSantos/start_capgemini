nome = input('Digite o seu nome: ')
nota1 = float(input('Nota 1: '))
nota2 = float(input('Nota 2: '))
nota3 = float(input('Nota 3: '))
media = (nota1 + nota2 + nota3) / 3

print(media)

if media >=7:
    print(f'O aluno {nome} passou de ano, pois a sua média foi {media}.')
else: 
    print(f'O aluno {nome} está de recuperação, pois a sua média foi {media}.')
