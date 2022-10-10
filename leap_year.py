year = int(input("Enter year: "))

if year % 4 == 0:
    result = str(year) + " is a leap year."
else:
    result = str(year) + " is not a leap year."

print(result)
