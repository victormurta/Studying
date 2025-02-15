while 1 != 0:
    try:
        temperatura = int(input('Insira a temperatura da carne em Cº: '))
        break
    except:
        print('Insira uma temperatura válida em Cº')

if temperatura < 48:
    print('Necessita de mais tempo no fogo')
elif temperatura in range(48, 53):
    print('A carne está selada')
elif temperatura in  range(54, 59):
    print('A carne está Ao ponto para mal passada')
elif temperatura in range(60, 64):
    print('A carne está ao ponto')
elif temperatura in range(65, 70):
    print('Ao ponto para bem passada')
elif temperatura >= 71:
    print('Bem passada')
