number_1 = int(input("Enter your first number: "))
number_2 = int(input("Enter your second number: "))

print("Before swapping number1 = " +
      str(number_1) + ", number2 = " + str(number_2))

temp = number_1
number_1 = number_2
number_2 = temp

print("After swapping number1 = " +
      str(number_1) + ", number2 = " + str(number_2))
