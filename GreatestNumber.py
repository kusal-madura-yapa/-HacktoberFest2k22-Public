number_1 = int(input("Enter your first number: "))
number_2 = int(input("Enter your second number: "))
number_3 = int(input("Enter your third number: "))

if (number_1 > number_2) and (number_1 > number_3):
    result = str(number_1) + " is the greatest number."
elif (number_2 > number_1) and (number_2 > number_3):
    result = str(number_2) + " is the greatest number."
else:
    result = str(number_3) + " is the greatest number."

print(result)
