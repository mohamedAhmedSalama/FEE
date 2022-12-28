def recursion_sum(copy_number):
    if copy_number == 1:
        return 1
    return (copy_number**2)+recursion_sum(copy_number-1)


sum_test = 0
j = 1
Number = int(input("Enter an integer number N : "))
if Number > 0:
    print("Series is :")
    for i in range(0, Number, 1):
        print(j**2, end=" ")
        sum_test += j**2
        j += 1
        if j != (Number+1):
            print("+ ", end="")
    print()
    print("Recursion sum =", recursion_sum(Number))
    print("Test sum =", sum_test)
else:
    print("invalid number!!, try again with positive number ")
