import random

num = int(input('O computador pensou em um numero entre 0 e 5, você é capaz de advinhar? '))
sorteio = random.randint(0, 5)

if num == sorteio:
    print('Parabens, o numero pensando pelo computador foi {}, o mesmo do seu!!!'.format(sorteio))
else:
    print('Que pena, você nao acertou!!')