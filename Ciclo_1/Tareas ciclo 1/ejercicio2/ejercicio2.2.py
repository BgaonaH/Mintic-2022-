cadena = input(("Escriba una sola letra del abecedario: " ))
#tamano : len(cadena)

if len(cadena) == 1 and ord(cadena) % 2 == 0 :
    print (ord(cadena),  "Es par" )
elif len(cadena) == 1 and ord(cadena) % 2 != 0 :
    print (ord(cadena),  "Es impar")
else: 
    print ("Escriba una sola letra del abecedario") 