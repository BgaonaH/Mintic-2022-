jugador1 = input(("introduzca las pelotas del jugador 1 "))
jugador2 = input(("introduzca las pelotas del jugador 2 "))
tombola = input(("introduzca las pelotas  de la maquina "))
puntajejugador1 = 0
puntajejugador2 = 0
puntajeAcumuladoJugador1 = 0
puntajeAcumuladoJugador2 = 0
lanzamiento = ""
lanzamiento1= ""
puntos1= 0
puntos2= 0

for i in range(3):
    if jugador1[i] == tombola[i] != jugador2[i]:
        puntos1= 1 
    if jugador2[i] == tombola[i] != jugador1[i]:
        puntos2 = 1
    if jugador1[i] == tombola[i] == jugador2[i]:
        puntos1 = 1
        puntos2 = 1
    if puntos1 > puntos2:
        print("C")
    if puntos2 > puntos1:
        print("E")
    if puntos1 == puntos2:
        print("T") 
    #print(puntos1,puntos2)
