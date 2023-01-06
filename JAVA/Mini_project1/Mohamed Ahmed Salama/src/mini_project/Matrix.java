package mini_project;

public class Matrix {
		
	public void Add_Matrix(int Copy_Matrix1[][] , int Copy_Matrix2[][] , int Copy_Row , int Copy_Col)
	{
		int [][] Result_Matrix = new int [Copy_Row][Copy_Col];
		for(int i = 0 ; i < Copy_Row ; i++)
		{
			for(int j = 0 ; j < Copy_Col ; j++)
			{
				Result_Matrix[i][j] = (Copy_Matrix1[i][j] + Copy_Matrix2[i][j]);
			}
		}
		
		System.out.println(" The result of adding 2 matrices :");
		for(int i = 0 ; i < Copy_Row ; i++)
		{
			for(int j = 0 ; j < Copy_Col ; j++)
			{
				System.out.print(Result_Matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void Sub_Matrix(int Copy_Matrix1[][] , int Copy_Matrix2[][] , int Copy_Row , int Copy_Col)
	{
		int [][] Result_Matrix = new int [Copy_Row][Copy_Col];
		for(int i = 0 ; i < Copy_Row ; i++)
		{
			for(int j = 0 ; j < Copy_Col ; j++)
			{
				Result_Matrix[i][j] = (Copy_Matrix1[i][j] - Copy_Matrix2[i][j]);
			}
		}
		
		System.out.println(" The result of substracting 2 matrices :");
		for(int i = 0 ; i < Copy_Row ; i++)
		{
			for(int j = 0 ; j < Copy_Col ; j++)
			{
				System.out.print(Result_Matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void Mul_Matrix(int Copy_Matrix1[][] , int Copy_Matrix2[][] , int Copy_Row1 , int Copy_Col1 , int Copy_Col2)
	{
		int [][] Result_Matrix = new int [Copy_Row1][Copy_Col2];
		for(int i = 0 ; i < Copy_Row1 ; i++)
		{
			for(int j  =0 ; j < Copy_Col2 ; j++)
			{
				for(int k = 0 ; k < Copy_Col1 ; k++)
				{
					Result_Matrix[i][j] +=( Copy_Matrix1[i][k] * Copy_Matrix2[k][j] );
				}
			}
		}
		
		System.out.println(" The result of multiplication 2 matrices :");
		for(int i = 0 ; i < Copy_Row1 ; i++)
		{
			for(int j = 0 ; j < Copy_Col2 ; j++)
			{
				System.out.print(Result_Matrix[i][j] + " ");
			}
			System.out.println();
		}

	}      
	
	
}
 