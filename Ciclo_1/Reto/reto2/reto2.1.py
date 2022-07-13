jugador1 = input()
jugador2 = input()
tombola = input()
x = 0
y = 0
l = 0
xt = 0
yt = 0 
pt = ""
for i in tombola:
    n = 0
    if i in jugador1:
        x = 1
    else:
        x=0
    if i in jugador2:
        y = 1
    else:
        y=0
    l+=1
    xt+=x
    yt+=y 

    if xt > yt:
        p ="C"
    if yt > xt:
        p = "E"
    if xt == yt:
        p = "T" 
    pt+=p
    #print(x,y,i,l,xt,yt,p,pt)
print(pt)
    