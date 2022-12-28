Grade_value = 0
Count_invalid = 0
Count_valid = 0
Sum_grade = 0
Average_grade = 0.0
Max_grade = 0
Max_GradePosition = 0
Min_GradePosition = 0
Min_grade = 100


values = input('Enter students grades : ').split()
Students_grades = list()
Copy_list = list()
Corresponding_list = list()
# answer of question A
for i in values:
    Grade_value = int(i)
    Copy_list.append(Grade_value)
    if( (Grade_value >= 0) and ( Grade_value <= 100) ):
        Corresponding_list.append(1)   #  valid grade put 1
        print(Grade_value, "is valid grade ! ")
        Students_grades.append(Grade_value)
        if(Grade_value > Max_grade):
            Max_grade = Grade_value
            Max_GradePosition = Count_valid
        elif(Grade_value < Min_grade):
            Min_grade = Grade_value
            Min_GradePosition = Count_valid
        Count_valid+=1
        Sum_grade +=Grade_value
    else:
        Corresponding_list.append(0) # invalid grade put 0
        Count_invalid +=1
        print(Grade_value,"is invalid grade ! ")

# answer of question B
for i in Copy_list:
    print(i, end=' ')
print(' ')
for i in Corresponding_list:
    print(i,end=' ')
print()

# answer of question C
Average_grade = (Sum_grade/Count_valid)
print('the average grade = ',Average_grade)

# answer of question D
print('The highest grade is : ',Max_grade,' and is`s location is : ',Max_GradePosition)
print('The lowest grade is : ',Min_grade,' and is`s location is : ',Min_GradePosition)

# answer of question E
print('Students grade that is larger than average and it`s location ')
for i in range(0,len(Students_grades),1):
    if(Students_grades[i] > Average_grade ):
        print('Student grade : ',Students_grades[i],' , location : ',i)
