funcionarios = ['Ana', 'Marcos', 'Alice', 'Pedro', 'Sophia', 'Bruno', 'Melissa']
turno_dia = ['Ana', 'Marcos', 'Alice', 'Melissa']
turno_noite = ['Pedro', 'Sophia', 'Bruno']
tem_carro = ['Marcos', 'Alice', 'Bruno', 'Melissa']

set1 = set(turno_noite).intersection(tem_carro)
set2 = set(turno_dia).intersection(tem_carro)
set3 = set(funcionarios).difference(tem_carro)


print(f'Funcionários que tem carro e trabalham a noite: {set1}')
print(f'Funcionários que tem carro e trabalham de dia: {set2}')
print(f'Funcionários que não tem carro: {set3}')