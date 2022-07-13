puntoAR2 = float(input(("Introduzca el punto A de R2 ")))
puntoBR2 =  float(input(("Introduzca el punto B de R2 ")))
puntoAcirculo = float(input("Introduzca el punto A del circulo "))
puntoBcirculo = float(input("Introduzca el punto B del circulo "))
radio = float(input(("introduzca el radio ")))

puntoAndetroOfuera = ((puntoAR2-puntoAcirculo)**2 + (puntoBR2-puntoBcirculo)**2)**0.5
print (puntoAndetroOfuera, radio)
if float(puntoAndetroOfuera) <= radio:
    print ("El punto esta adentro")
else:
    print ("esta afuera")
