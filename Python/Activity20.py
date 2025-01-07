import pandas
 
dataframe = pandas.read_excel('Student.xlsx')
 
print(dataframe)
 

print("Number of rows and columns:", dataframe.shape)
 

print("Emails:")
print(dataframe['email'])
 

print("Sorted data:")
print(dataframe.sort_values('firstname'))