altura = float(input('Informe a sua altura: '))
peso = float(input('Informe o seu peso: '))
imc = peso / altura ** 2

if imc < 19:
    print('Abaixo do peso.')
elif imc <24:
    print('Peso ideal.')
else:
    print('Acima do Peso.')