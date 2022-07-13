import json
c = input("")
jugador= json.loads(c)

registrar = input("")
registro = registrar.split(" ")
letra = ""
contador = 0

for i in registro:
    if i in jugador:
        contador= contador+jugador[i]
    else:
        contador=contador
print(contador)

for j in registro:
    for h in jugador:
        if j==h:
            print(j,end=" ") 