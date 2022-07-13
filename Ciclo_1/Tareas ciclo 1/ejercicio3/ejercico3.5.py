

Bandera=True
t=0
while Bandera:
    t+=1
    Po_A= 25000000
    Po_B= 18900000
    A_po= int(Po_A*((1.02)**t))
    B_po= int(Po_B*((1.03)**t))
    if A_po<B_po:
        print("la población del país A:", "{:,.2f}".format(A_po), "es menor que la población del país B:", "{:,.2f}".format(B_po))
        print("para el año de:", (2022+t))
        Bandera=False
    
    
