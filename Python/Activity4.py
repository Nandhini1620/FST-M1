user1 = input("Enter the name for user1 ")
user2 = input("Enter the name for user2 ")

while True:

   user1_ans = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
   user2_ans = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

    
if user1_ans == user2_ans:
    print("its a tie")
elif user1_ans == 'rock':
    if user2_ans == 'scissors':
        print("rock wins")
    else:
        print("Paper wins")
elif user1_ans == 'scissors':
    if user2_ans == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user1_ans == 'paper':
    if user2_ans == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")

repeat = input("Do you want to play another round? Yes/No: ").lower()
    
   
if(repeat == "yes"):
    pass
 
elif(repeat == "no"):
    raise SystemExit
    
print("You entered an invalid option. Exiting now.")
raise SystemExit