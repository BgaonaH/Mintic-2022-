import restaurante

p = ['carnes', 'carnes', 'lácteos', 'verduras', 'frutas', 'lácteos', 'carnes', 'verduras', 'verduras', 'carnes']
lista= [1,2,6,8]
p1 = 'carnes'
c = [3,5,7,10,15,16]
m = [4,10,5,8]
print(restaurante.tiposproducto(p))
print(restaurante.productosfaltantes(lista,p,p1))
print(restaurante.novendo(c,m))
print(restaurante.cambio(c,m))