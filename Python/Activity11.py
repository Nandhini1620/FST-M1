fruits={
    "banana" : 10,
    "apple"  : 90,
    "grapes" : 30,
    "orange" : 70
}

frts = input("Enter a the fruit name: ")

if frts in fruits:
        print("Yes it is present")
else:
        print("No it is not present")