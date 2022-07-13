bandera=False
valor=False
valor1=False
while (bandera and valor and valor1)==False:
  #print("Numeros errados, el numero 1 debe ser menor al numero 2")
  num1=input("Ingrese el numero 1")
  num2=input("ingrese el numero 2")
  valor=num1.isnumeric()
  valor1=num2.isnumeric()
  if (valor and valor1)==True:
    num1=int(num1)
    num2=int(num2)
    if num1>num2:
      print("Numeros errados, el numero 1 debe ser menor al numero 2")
    else:
      bandera=True
  else:
    print("Ingrese valores numericos")
#if num1%2!=0:
  #num1+=1
while num1<=num2:
  if num1%2==0:
    print(num1)
  #num1+=2 
  num1=num1+1






numero = int(input("Introduzca un numero "))
#if numero > 97 and numero < 127:
if  97<=int(numero)<=127:
    print (chr(numero))
else: 
    print ("No es una vocal")