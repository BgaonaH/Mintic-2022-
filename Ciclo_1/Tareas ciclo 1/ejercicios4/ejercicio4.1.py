import pandas as pd 
df = pd.read_csv ('Tatreas ciclo 1\ejercicios4\paises.csv')
print(df['Pais'])
df.index= df["Pais"]
df.drop(["Pais"],axis=1, inplace=True)
p=input()
result=df.loc[p,"Exportacion"]
print(result)