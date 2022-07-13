import json
asar= input()
asardicionario =  json.loads(asar)  
puntaje = 0
jugador = (map(str,input().split(" ")))
letras =[]
for c in jugador:
    for j in asardicionario:
        if(c==j):
            puntaje+=asardicionario[j]
            letras.append(c)
            break      
print(puntaje)
print(letras)
print(*letras)
    



