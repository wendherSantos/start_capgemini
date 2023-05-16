total_conta = 0
resposta = 'SIM'

while resposta == 'SIM':
    opcao_menu = input('\n[1] Troca de Óleo é 100 reais'
                   '\n[2] Balanceamento é 70 reais'
                   '\n[3] Sair'
                   '\nDigite uma das opções acima: ')
    if opcao_menu == '1':
          total_conta = total_conta + 100
    elif opcao_menu == '2':
         total_conta = total_conta + 70
    else:
         break
    resposta=input("\nDigite SIM para escolher um novo serviço: ").upper()
    
print(f'\nO total da conta ficou em {total_conta} reais.')