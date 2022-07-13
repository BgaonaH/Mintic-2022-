def vueltasBillete(bill,pan,bolsaDeLeche,huevos):
    x = (bill-((pan*300)+(bolsaDeLeche*3300)+(huevos*350)))
    if x < 0:
        print ("Debes:",x*-1)
    else:
        print ("Su vuelta es:",x)


billete = int(input("Ingrese el billete "))
panes = int(input("ingrese los panes "))
leche = int(input("ingrese lasbolsa de leche "))
huevos = int(input("ingrese los huevos "))
vueltasBillete(billete,panes,leche,huevos)
