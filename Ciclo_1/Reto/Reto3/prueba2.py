cadena = list(map(str,input("valores").split(" ")))
cadena2 = ''.join(cadena)
#print(cadena)
listaGrupos = []
for c in cadena2:
    if listaGrupos and c in listaGrupos[-1]:
        listaGrupos[-1].append(c)
    else:
        listaGrupos.append([c])
#print(listaGrupos)
productos = ''.join([f'{lst[0]} ' for lst in listaGrupos])
cantidad = ''.join([f'{len(lst)} ' for lst in listaGrupos])

print(productos)
print(cantidad)
