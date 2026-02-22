'''
# 1
tempoSegundos = int(input())

horas = tempoSegundos // 3600
resto = tempoSegundos % 3600
minutos = resto // 60
segundosFinal = resto % 60

print(horas)
print(minutos)
print(segundosFinal)


'''
# 2
def VerificaDistino(listaNumeros):
    temRepetido = 0

    for numero in listaNumeros:
        quantidade = 0
        for busca in listaNumeros:
            if numero == busca:
                quantidade += 1
        
        if quantidade > 1:
            temRepetido = 1

    if temRepetido == 1:
        print("Repetido")
    else:
        print("Unico")

listaNumeros = [1, 2, 3, 4, 5, 6, 8]   
VerificaDistino(listaNumeros)