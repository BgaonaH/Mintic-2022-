cadena = (map(str,input().split(" ")))
print(cadena)
listaGrupos = []
for c in cadena:
    if listaGrupos and c in listaGrupos[-1]:
        listaGrupos[-1].append(c)
    else:
        listaGrupos.append([c])
print (''.join([f'{lst[0]} ' for lst in listaGrupos])) #productos
print ( ''.join([f'{len(lst)} ' for lst in listaGrupos])) #cantidad
  