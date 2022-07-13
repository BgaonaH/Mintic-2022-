def productosfaltantes(l1,x,faltantes):
  pos =[]
  for i in range(len(l1)):
    print(i)
    if x[i]==faltantes:
      pos.append(i)
  return pos
  
  '''it=pos
  for i in faltantes:
    for j in it:
      if (i==j):
        pos.append(i)
        return pos'''
  

lista= [1,2,6,8]
listaLarga= ["carnes", "carnes", "lácteos", "verduras", "frutas", "lácteos", "carnes", "verduras", "verduras", "carnes"]
producto= "carnes"
print(productosfaltantes(lista,listaLarga,producto))
