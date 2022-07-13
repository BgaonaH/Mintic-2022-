def tiposproducto(productos):
    listaP=[]
    for i in productos:
        if i not in listaP:
            listaP.append(i)
    return listaP
def productosfaltantes(lpf,productos,producto):
    pF=[]
    for n in lpf:
        if productos[n] == producto:
            pF.append(n)
    return pF
def novendo(competencia,miRestaurante):
    nV=[]
    for l in competencia:
        if l not in miRestaurante:
            nV.append(l)
    return nV
def cambio(olimpicon,toPaqlleve):
    pO=[]
    pP=[]
    c= 0
    for r in olimpicon:
        if r not in toPaqlleve:
            pO.append(r)
    for s in toPaqlleve:
        if s not in olimpicon:
            pP.append(s)
    if len(pO) <= len(pP):
        c = len(pO)
    else:
        c = len(pP)
    return c


    