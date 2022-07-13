cadena1=input()
cadena2=input()
contadorc=0
for i in range(0,len(cadena1)):
  #print(i)
  if cadena1[i] in cadena2:
    #print(cadena1[i])
    letracad1=cadena1.count(cadena1[i])
    letracad2=cadena2.count(cadena1[i])
    print(letracad1,letracad2)
    if letracad1<=letracad2:
      contadorc+=1
#print(cadena1)
if contadorc==len(cadena1):
  print("la cadena 1 si esta incluida en la cadena 2")
else:
  print("La cadena 1 no esta incluida en la cadena 2")