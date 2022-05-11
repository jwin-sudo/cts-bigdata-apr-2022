import pandas as pd
 
data = pd.read_csv("employees.csv")

data.sort_values(["Salary"], axis=0, ascending=[False], inplace=True)

data.to_csv('employees-sorted.csv')

print(data)
