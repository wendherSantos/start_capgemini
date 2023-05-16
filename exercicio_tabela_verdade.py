lado1 = float(input('Lado 1: '))
lado2 = float(input('Lado 2: '))
lado3 = float(input('Lado 3: '))

if (lado1 > lado2 + lado3) or (lado2 > lado1 + lado3) or (lado3 > lado2 + lado1):
    print('Não é triângulo!')
elif (lado1 == lado2) and (lado2 == lado3):
    print('Equilátero')
elif (lado1 == lado2) or (lado2 == lado3) or (lado1 == lado3):
    print('Isósceles')
else:
    print('Escaleno')