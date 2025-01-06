import pandas
from pandas import ExcelWriter
from pandas import ExcelFile

data = {
    'firstname': ["Satvik","Avinash","lahri"],
    'lastname': ["shah","kati","rath"],
    'email': ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    'ph':["4537829158","5892184058","4528727830"]
}

dataframe = pandas.DataFrame(data)
writer = ExcelWriter("Student.xlsx")

dataframe.to_excel(writer,"Sheet1",index=False)
writer.close()