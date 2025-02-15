def CalculaRendimento(alt, larg, rend):
    area = alt*larg
    latas = area/rend
    return latas


altura = float(input('Insira a altura da parede: '))
largura = float(input('Insira a largura da parede: '))
rendimento = float(input('Insira o rendimento da lata conforme consta na embalagem: '))

print(f'Você vai precisar de {CalculaRendimento(altura, largura, rendimento):.2f} latas')



