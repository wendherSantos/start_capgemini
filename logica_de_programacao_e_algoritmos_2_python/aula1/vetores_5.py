qtd_numeros = 5
numeros = []

for i in range(qtd_numeros):
    numeros.append(int(input(f'Número {i+1}: ')))

num_ordenados = sorted(numeros)

print(numeros)
print(num_ordenados)
