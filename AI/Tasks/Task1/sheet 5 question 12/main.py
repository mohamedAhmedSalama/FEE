Sum = 0
X = int(input('Please Enter integer number : '))
if X > 1 :
    #answer of point A
    for i in range(1,X+1,1):
        Sum+=i
    print('the sum of',X, 'consecutive integers =',Sum)

    print('\n\n')
    # answer of point B
    for i in range(1,X+1,1):
        Sum=0
        for j in range(1,i+1,1):
            Sum+=j
        print(Sum)

    print('\n\n')
    # answer of point C
    for i in range(1,X+1,1):
        Sum=0
        for j in range(1,i+1,1):
            Sum+=j
        if Sum%5==0 :
            print('the sum of consecutive integers of',i,'that is divisible by 5 =',Sum)
else:
    print('Enter number bigger than 1')




