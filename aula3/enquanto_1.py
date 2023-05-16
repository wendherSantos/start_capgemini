altura_marcelo = 1.20
altura_joao = 1.05
crescimento_anual_marcelo = 0.05
crescimento_anual_joao = 0.07
idade = 8

while altura_marcelo >= altura_joao:
    altura_marcelo = altura_marcelo + crescimento_anual_marcelo
    altura_joao = altura_joao + crescimento_anual_joao
    idade = idade + 1

print(f'Idade {idade}')
print(f'Altura do João {altura_joao:.2f}')
print(f'Altura do Marcelo {altura_marcelo:.2f}')