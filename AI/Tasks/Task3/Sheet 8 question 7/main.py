def reverse_string(copy_str):
    string_reversed = " "
    for i in copy_str:
        string_reversed = i + string_reversed
    return string_reversed


input_string = input("Enter string to be reversed : ")
print("Original string is : ", input_string)
print("Reversed string is : ", reverse_string(input_string))



