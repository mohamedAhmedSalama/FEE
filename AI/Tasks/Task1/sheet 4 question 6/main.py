import math
A_Coefficient= 0
B_Coefficient=0
C_Coefficient=0
X1 = 0 + 0j
X2 = 0 + 0j
D = 0 + 0j
print('Enter the coefficients (a, b, c) of the quadratic equation aX^2 + bX + c = 0 : ')
A_Coefficient = int(input('Enter a coefficient : '))
B_Coefficient = int(input('Enter b coefficient : '))
C_Coefficient = int(input('Enter c coefficient : '))
print('The equation ',A_Coefficient,'x^2',' +',B_Coefficient,'X',' +',C_Coefficient,' =',0 ,' ,',end='  ')
if(A_Coefficient == B_Coefficient == C_Coefficient):
    print('Any x is a solution')
elif((A_Coefficient == B_Coefficient == 0 ) and (C_Coefficient != 0)):
    print(' has no No solution')
elif((A_Coefficient == 0 )and(B_Coefficient!=0)and(C_Coefficient!=0)):
    print('Only one solution =',(-C_Coefficient/B_Coefficient))
else:
    D = math.sqrt((B_Coefficient**2)-(4 * A_Coefficient * C_Coefficient))
    X1 = ( (-B_Coefficient + D)/(2 * A_Coefficient) )
    X2 = ((-B_Coefficient - D) / (2 * A_Coefficient))
    print('has 2 Solutions : ')
    print('X1 =',X1)
    print('X2 =',X2)

