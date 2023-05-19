def calcular_media(lista):
    soma = sum(lista)
    media = soma / len(lista)
    return media

numeros = []
qtde_numeros = int(input("Digite a quantidade de números: "))

for i in range(qtde_numeros):
    num = int(input(f"Digite o {i+1}º número: "))
    numeros.append(num)

media = calcular_media(numeros)
print("A média dos números é:", media)