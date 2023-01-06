package mini_project;

import java.util.Scanner;

public class core {

	public static void main(String[] args) {
		Shapes Shape = new Shapes();
		Matrix Mat  = new Matrix();
		int Choice = 0 , Shape_Choice = 0 ,Matrix_choice = 0 , i = 0 , j = 0 ;
		int Cir_Radius = 0 , Cu_side = 0 , Rec_width = 0 , Rec_height = 0 , Sq_side = 0 ;
		int Tri_base = 0 , Tri_height = 0 , Rho_diagonal1 = 0 , Rho_diagonal2 = 0 ;
		int Matrix1_row = 0 ,  Matrix1_col = 0 ,  Matrix2_row = 0 ,  Matrix2_col = 0 , Matrix_Exit = 0;
		boolean Exit_Flag = true , Shape_Flag = true  ;
		while(Exit_Flag == true)
		{
			System.out.println("Chose 1 , 2 or 3");
			System.out.println("1- Get Area of any shapes");
			System.out.println("2- Do Operation on 2 matrices");
			System.out.println("3- Exit");
			System.out.print("Your Choice : ");
			Scanner input = new Scanner(System.in);
			Choice = input.nextInt();
			switch(Choice)
			{
				case 1 :    // for area of shape
					while(Shape_Flag == true)
					{
						System.out.println("\n\n");
						System.out.println("Chose a shape to calculate it`s Area :");
						System.out.println("1- Circle     -2- Cube     -3- Rectangle ");
						System.out.println("4- Square     -5-Triangle  -6- Rhombus");
						System.out.println("7- Exit");
						System.out.print("Your Choice : ");
						Shape_Choice = input.nextInt();
						System.out.println();
						System.out.println("------------------------------------------");
						System.out.println();
						switch(Shape_Choice)
						{
							case 1 :  // choosing circle
								
								System.out.println("Circle");
								System.out.print("Enter Circle Radius : ");
								Cir_Radius = input.nextInt();
								if(Cir_Radius > 0 ) // check for valid radius
								{
									Shape.SetCircle_Radius(Cir_Radius);
									Shape.GetCircle_Area();
									
								}
								else 
									System.out.println("Invalid Radius value !!!");
								
								break;
								
							case 2 : // choosing cube
								
								System.out.println("Cube");
								System.out.print("Enter Cube Side : ");
								Cu_side = input.nextInt();
								if(Cu_side > 0 ) // check for valid side
								{
									Shape.SetCube_Side(Cu_side);
									Shape.GetCube_Area();
								}
								else 
									System.out.println("Invalid Radius value !!!");
								
								break;
								
							case 3 : // choosing rectangle 
								System.out.println("Rectangle");
								System.out.print("Enter Rectangle width : ");
								Rec_width = input.nextInt();
								System.out.print("Enter Rectangle height : ");
								Rec_height = input.nextInt();
								if( (Rec_height > 0 ) && (Rec_width > 0) ) // check for valid dimension
								{
									Shape.SetRectangle_Dimensions(Rec_width, Rec_height);
									Shape.GetRectangle_Area();
								}
								else
									System.out.println("Invalid values !!!");
								
								break;
								
							case 4 : // choosing square
								System.out.println("Square");
								System.out.print("Enter square side : ");
								Sq_side = input.nextInt();
								if( Sq_side > 0) // check for valid side
								{
									Shape.SetSquare_Side(Sq_side);
									Shape.GetSquare_Area();
								}
								else
									System.out.println("Invalid side values !!!");
								
								break;
								     
							case 5 :  // choosing triangle
								System.out.println("Triangle");
								System.out.print("Enter triangle base : ");
								Tri_base = input.nextInt();
								System.out.print("Enter triangle height : ");
								Tri_height = input.nextInt();
								if( (Tri_base > 0 ) && (Tri_height > 0) ) // check for valid values
								{
									Shape.SetTriangle_Dimensions(Tri_base, Tri_height);
									Shape.GetTriangle_Area();
								}
								else
									System.out.println("Invalid values !!!");
									
								break;
								
							case 6 : // choosing Rhombus
								System.out.println("Rhombus");
								System.out.print("Enter Rhombus first diagonal : ");
								Rho_diagonal1 = input.nextInt();
								System.out.print("Enter Rhombus second diagonal : ");
								Rho_diagonal2 = input.nextInt();
								if( (Rho_diagonal1 > 0 ) && (Rho_diagonal2 > 0 ) ) // check for valid values
								{
									Shape.SetRhombus_Diagonals(Rho_diagonal1, Rho_diagonal2);
									Shape.GetRhombus_Area();
								}
								else
									System.out.println("Invalid values !!!");
								
								break;
							   
							case 7 :
								Shape_Flag = false ;
								System.out.println(" Ending this process, hope you enjoy it");
								
								break;
								
							default:
								System.out.println("Wrong Number , Try Again ! ");
								break;
						}
					}
					break;	
					
				case 2:
					while(true)
					{
						System.out.println(" ");
						System.out.println("if you want to end this , Enter 1 to exit");
						System.out.print("choice : ");
						Matrix_Exit = input.nextInt();
						System.out.println();
						System.out.println("------------------------------------------");
						System.out.println();
						if(Matrix_Exit == 1)
						{
							System.out.println(" Ending this process, hope you enjoy it");
							break;
						}
						System.out.println("\n\n");
						System.out.println("You have to enter 2 matrices to make operation on them ");
						System.out.print("Enter number of Rows for first matrix : ");
						Matrix1_row = input.nextInt();
						System.out.print("Enter number of Cols for first matrix : ");
						Matrix1_col = input.nextInt();
						System.out.print("Enter number of Rows for second matrix : ");
						Matrix2_row = input.nextInt();
						System.out.print("Enter number of Cols for second matrix : ");
						Matrix2_col = input.nextInt();
						if( (Matrix1_row > 0 ) && (Matrix1_col > 0 ) && (Matrix2_row > 0 ) && (Matrix2_col > 0 ) ) // checking for vallid values )
						{
							// creating 2 matrices 
							int [][]Matrix1 = new int [Matrix1_row][Matrix1_col];
							int [][]Matrix2 = new int [Matrix2_row][Matrix2_col];
							// getting elements of matrix1
							System.out.println("Enter "+(Matrix1_row * Matrix1_col)+" elements of the first Matrix : ");
							for(i = 0 ; i < Matrix1_row ; i++ )
							{
								for(j = 0 ; j < Matrix1_col ; j++)
								{
									Matrix1[i][j] = input.nextInt();
								}
							}
							// getting elements of matrix2
							System.out.println("Enter "+(Matrix2_row * Matrix2_col)+" elements of the second Matrix : ");
							for(i = 0 ; i < Matrix2_row ; i++ )
							{
								for(j = 0 ; j < Matrix2_col ; j++)
								{
									Matrix2[i][j] = input.nextInt();
								}
							}
							System.out.println("Enter number of operation to perform : ");
							System.out.print("1- Multiplication  2- Addition  -3- Substraction  -");
							System.out.print("your choice : ");
							Matrix_choice = input.nextInt();
							switch(Matrix_choice)
							{
								case 1 :
									if(Matrix1_col == Matrix2_row)
									{
										Mat.Mul_Matrix(Matrix1, Matrix2, Matrix1_row, Matrix1_col, Matrix2_col);
									}
									else
										System.out.println("Wrong values , matrix1 cols should equal to matrix2 rows");
									break;
								case 2 :
									if( (Matrix1_col == Matrix2_col) && (Matrix1_row == Matrix2_row) )
									{
										Mat.Add_Matrix(Matrix1, Matrix2, Matrix1_row, Matrix1_col);
									}
									else
										System.out.println("Wrong values , 2 matrices should have same number of rows and cols");
									break;
								case 3 :
									if( (Matrix1_col == Matrix2_col) && (Matrix1_row == Matrix2_row) )
									{
										Mat.Sub_Matrix(Matrix1, Matrix2, Matrix1_row, Matrix1_col);
									}
									else
										System.out.println("Wrong values , 2 matrices should have same number of rows and cols");
									break;
								default :
									System.out.println("Wrong Number !!!");
									break;
							}
						}
						else
							System.out.println("Invalid value !!");
					}
					break;
				case 3:  // Exit 
					Exit_Flag = false;
					System.out.println("Exiting ");
					System.out.println("Good bye ♥... see you soon  !");
					break;
					
				default:
					System.out.println("Wrong Number , Try Again ! ");
					break;
					
			}
		
			System.out.println("\n\n");
		}

	}

}  
