Arr1 = input('Enter elements of first array : ').split()
Arr2 = input('Enter elements of second array : ').split()
Repeated_array = list()
count = 0
for i in Arr1:
    count = 0
    for j in Arr2:
        if i == j:
            count+=1
    Repeated_array.append(count)
print('first array is ')
print('[',end='')
for i in Arr1:
    print(int(i),end=' ')
print(']')
print('Times each elements have repeated')
print(Repeated_array)
