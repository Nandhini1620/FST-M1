first_list=[1,2,3,4,5]
second_list=[6,7,8,9]

thrid_list=[]

for num in first_list:
    if num%2==0:
        thrid_list.append(num)
for num in second_list:
    if num%2==0:
        thrid_list.append(num)

for num in second_list:
    if num/2==0:
        thrid_list.append(num)
for num in second_list:
    if num%2==0:
        thrid_list.append(num)

print(thrid_list)