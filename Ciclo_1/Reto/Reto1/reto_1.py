juan = int(input())
mateo = (juan * 2) + 4 
andres = (juan+mateo) // 5 
premio = juan + mateo + andres 
serie = ""
if andres <= 20:
    serie = "uno"
    print (juan, mateo, andres, serie)
elif andres >= 21 and andres <= 30: 
    serie = "dos"
    print (juan, mateo, andres, serie)
elif andres > 30 and andres <= 50 :
    serie = "tres"
    print (juan, mateo, andres, serie)
elif andres > 50 :
    serie = "cuatro"
    print (juan, mateo, andres, serie)
else:
    print ("ingrese un Valor numerico")
    


