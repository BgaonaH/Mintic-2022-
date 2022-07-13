"""with open('archivos\prueba2.txt','w') as archivo:
    datos="esta es una prueba de escitura\n"
    archivo.write(datos)

with open('archivos\prueba.txt','r') as leer:
    lectura=leer.read()
    print(lectura)

with open('archivos\prueba.txt','r',encoding="utf-8" ) as leer2:
    lectura2=leer2.read()
    print(lectura2)

with open('archivos\prueba.txt','r',encoding="utf-8" ) as leer3:
    lectura3=leer3.read(6)
    print(lectura3)
    
with open('archivos\prueba.txt','r',encoding="utf-8" ) as leer4:
    linea1=leer4.readline()
    linea2=leer4.readline()
    print(linea1, end=" ")
    print(linea2, end=" ")

with open('archivos/prueba.txt','r',encoding="utf-8") as leer4:
  linea1=leer4.readline()
  linea2=leer4.readline()
print(linea1, end="")
print(linea2, end="")

with open('archivos/prueba.txt',"a+",encoding="utf-8") as escritura1:
  escritura1.write("\nEsta es una nueva linea del archivo")
with open('archivos/prueba.txt','r',encoding="utf-8") as leer7:
  datos=leer7.read()
print(datos)"""

with open('archivos/prueba3.txt','r', encoding="utf-8") as archivolista:
  lista1=archivolista.readlines()
lista1.insert(1,"Esta es una nueva linea de prueba\n")
with open('archivos/prueba3.txt','w',encoding="utf-8") as escritural:
  contenido="".join(lista1) #serializacion o preparacion
  escritural.write(contenido)
with open('archivos/prueba3.txt','r', encoding="utf-8") as archivolista1:
  print(archivolista1.read())