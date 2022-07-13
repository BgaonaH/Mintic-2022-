#exp(n,x) = sum(x**i /factorial *= i )
def Maclaurin(n,x):
  i=0
  sumatoria = 1
  while i<=n:
    factorial=1
    j=0
    for j in range(1, n+1):
      factorial *= j
      sumatoria += x**j / factorial
    i+=1
    return sumatoria

num=int(input("introduzca una serie: "))
x1=int(input("introduzca un valor x para la serie"))
#x1 = int
suma = Maclaurin(num,x1)
print("funcion exponencial Maclaurin es:", suma)