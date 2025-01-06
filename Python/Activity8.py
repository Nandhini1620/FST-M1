numbers = input("Enter a sequence of comma separated values: ").split(", ")
print(numbers)

first_num = numbers[0]
last_num = numbers[-1]

if (first_num == last_num):
    print(True)
else:
    print(False)

