altura = int(input('Insira sua altura: '))
peso = float(input('Insira seu peso: '))

IMC = peso / ((altura/100)**2)

if IMC < 18.5:
    print('Magreza')
elif 24.9 >= IMC >= 18.5:
    print('Normal')
elif 29.9 >= IMC >= 25.0:
    print('Sobrepeso')
elif 39.9 >= IMC >= 30.0:
    print('Obesidade')
else:
    print('Obesidade grave')