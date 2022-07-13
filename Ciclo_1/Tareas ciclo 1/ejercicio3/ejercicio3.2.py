
def areaLateralCarrito(r,r2,b,a):
    areaCirculo1 = r*3.314
    areaCirculo2 = r2*3.314
    areaRectangulo=  b*a

    print ("El area del carrito es:",areaCirculo1+areaCirculo2+areaRectangulo)

radio = int(input(("introduzca el radio de la primera rueda ")))
radio2 = int(input(("introduzca el radio de la segunda rueda ")))
base = int(input(("introduzca el largo del carrito ")))
altura = int(input(("introduzca la altura del carrito  ")))



areaLateralCarrito(radio,radio2,base,altura)