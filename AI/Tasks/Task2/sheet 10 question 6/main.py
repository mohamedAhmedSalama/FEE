Student_GPA = 0.0
Sum_Point = 0
Grade_map = {'A': 4, 'B': 3, 'C': 2.7, 'D': 2, 'F': 0}
number = float(input("Enter your point  : "))
for i in Grade_map:
    if number >= Grade_map[i]:
        print("Your GPA is", i)
        break
stu_data = input('Enter students data : ')
Student_data = stu_data.split(',')
for i in range(len(Student_data)):
    Student_data[i] = Student_data[i].split()
k = i
print("Students Grades : \n")
print("\t\t chemistry \t Physics \t  Math \t\t  Art")
for i in range(0, k+1, 1):
    print(Student_data[i][0], end="\t\t")
    for j in range(1, 5, 1):
        print(Student_data[i][j], end="\t\t\t")
    print()
for i in range(0, k+1, 1):
    for j in range(1, 5, 1):
        if Student_data[i][j] == 'A':
            Sum_Point += Grade_map['A']
        elif Student_data[i][j] == 'B':
            Sum_Point += Grade_map['B']
        elif Student_data[i][j] == 'C':
            Sum_Point += Grade_map['C']
        elif Student_data[i][j] == 'D':
            Sum_Point += Grade_map['D']
        elif Student_data[i][j] == 'F':
            Sum_Point += Grade_map['F']
    Student_GPA = Sum_Point/4
    print(Student_data[i][0],"has GPA =",Student_GPA)
    Sum_Point = 0












