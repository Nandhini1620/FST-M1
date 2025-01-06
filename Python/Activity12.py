def calculate_num(num):
   
    
    if num:
        return num + calculate_num(num-1)
        return sum
    else:
        return 0

num = calculate_num(10)

print(num)

