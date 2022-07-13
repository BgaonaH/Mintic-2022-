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
    if jugador1[i] == tombola[i]:
        puntos1 = 1
        #lanzamiento1 = "C"
        
    if jugador2[i] == tombola[i]:
        puntos2 = 1
        #lanzamiento1 = "E"
        
   
    
    #puntajeAcumuladoJugador1 =puntajeAcumuladoJugador1+puntos1
    #puntajeAcumuladoJugador2+=puntos2
#rint(lanzamiento1)
    """if puntajeAcumuladoJugador1>puntajeAcumuladoJugador2:
        print("C")
    elif puntajeAcumuladoJugador1<puntajeAcumuladoJugador2:
        print("E")
    elif puntajeAcumuladoJugador1==puntajeAcumuladoJugador2:
        print("T")"""
    #lanzamiento+=lanzamiento1
    #print(jugador1[i],jugador2[i],tombola[i])
    #print(puntos1,puntos2)
    #print(puntajeAcumuladoJugador1,puntajeAcumuladoJugador2
    



    #print(puntos1,puntos2)
    
#print(lanzamiento)



