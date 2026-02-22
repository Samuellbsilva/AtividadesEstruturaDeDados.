# 1
notas = [7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8]

soma = 0
for n in notas:
    soma += n
media = soma / 10
print(media)

cont = 0
for n in notas:
    if n > media:
        cont += 1
print(cont)

maiorNota = notas[0]
for n in notas:
    if n > maiorNota:
        maiorNota = n
print(maiorNota)

#2
valorSaque = int(input())

qtd50 = valorSaque // 50
resto = valorSaque % 50
qtd20 = resto // 20
resto = resto % 20
qtd10 = resto // 10

print(qtd50)
print(qtd20)
print(qtd10)

# 3
senhaUser = input()
especiais = "@#$%&*"
temEspecial = 0

if len(senhaUser) < 8:
    print("Invalida")
    print("Tamanho", len(senhaUser))
else:
    for c in senhaUser:
        if c in especiais:
            temEspecial = 1
    
    if temEspecial == 1:
        print("Valida")
    else:
        print("Invalida")
        print("Especial")

