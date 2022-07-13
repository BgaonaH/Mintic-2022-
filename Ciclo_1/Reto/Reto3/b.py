cadena = list(map(str,input().split(" ")))
#listaGrupos = [c for i,c in enumerate(cadena) if c not in cadena[:i]]
listaGrupos = [ [lst] if lst in cadena[-1] else lst for lst  in cadena  ]
#listaGrupos = [[(lst)] if lst in enumerate.cadena(lst) else lst for lst in cadena  ]
print(listaGrupos)
productos = ''.join([f'{lst[0]} ' for lst in listaGrupos])
cantidad = ''.join([f'{len(lst)} ' for lst in listaGrupos])
print(productos)
print(cantidad)

