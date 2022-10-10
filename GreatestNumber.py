num_1 = int(input("Enter your first number: "))
num_2 = int(input("Enter your second number: "))
num_3 = int(input("Enter your third number: "))

if (num_1 > num_2) and (num_1 > num_3):
    result = str(num_1) + " is the greatest number."
elif (num_2 > num_1) and (num_2 > num_3):
    result = str(num_2) + " is the greatest number."
else:
    result = str(num_3) + " is the greatest number."

print(result)
