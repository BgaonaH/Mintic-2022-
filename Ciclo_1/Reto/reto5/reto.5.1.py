tiposproductos= input()
#tiposproductos= ['carnes', 'carnes', 'lácteos', 'verduras', 'frutas', 'lácteos', 'carnes', 'verduras', 'verduras', 'carnes']
producto = 'carnes'
listaP= []
listadeProductosfaltantes=[1,2,6,8]
productosFaltantes =[]
competencia = [3,5,7,10,15,16]
miRestaurante= [4,10,5,8]
novendo=[]
olimpicon=[3,5,7,10,15,16]
tomePaquequelleve=[4,10,5,8]
for i in tiposproductos:
    if i not in listaP:
        listaP.append(i)

for n in listadeProductosfaltantes:
    if tiposproductos[n] == producto:
        productosFaltantes.append(n)

for l in competencia:
    if l not in miRestaurante:
        novendo.append(l)

"""for p in olimpicon:
    if p not in tomePaquequelleve:"""
        

print(listaP)  
print(productosFaltantes)
print(novendo)