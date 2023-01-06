package mini_project;

public class Shapes {
	private int Circle_Radius;
	private int Cube_Side;
	private int Rectangle_Width;
	private int Rectangle_Height;
	private int Square_Side;
	private int Triangle_Base;
	private int Triangle_Height;
	private int Rhombus_Diagonal1;
	private int Rhombus_Diagonal2;
	
	private float Circle_Area;
	private int  Cube_Area;
	private int  Rectangle_Area;
	private int  Square_Area;
	private float Triangle_Area;
	private float Rhombus_Area;
	
	// for Circle  
	public void SetCircle_Radius(int Copy_Radius)
	{
		Circle_Radius=Copy_Radius;
	}
	
	public void GetCircle_Area()
	{
		Circle_Area = ((float)Circle_Radius * (float)Circle_Radius * (float)3.14);
		System.out.println("Circle Area = "+Circle_Area);
	}
	
	//for Cube
	public void SetCube_Side(int Copy_Side)
	{
		Cube_Side = Copy_Side ;
	}
	public void GetCube_Area()
	{
		Cube_Area = Cube_Side * Cube_Side * 6;
		System.out.println("Cube Area = "+Cube_Area);
	}
	
	
	// for Rectangle  
	public void SetRectangle_Dimensions(int Copy_Width , int Copy_Height)
	{
		Rectangle_Width  = Copy_Width ;
		Rectangle_Height = Copy_Height ;
	}
	public void GetRectangle_Area()
	{
		Rectangle_Area = Rectangle_Width * Rectangle_Height ;
		System.out.println("Rectangle Area = "+Rectangle_Area);
	}
	
	// for Square
	public void SetSquare_Side(int Copy_Side)
	{
		Square_Side = Copy_Side ;
	}
	public void GetSquare_Area()
	{
		Square_Area = Square_Side * Square_Side ;
		System.out.println("Square Area = "+Square_Area);
	}
	
	// for Triangle
	public void SetTriangle_Dimensions(int Copy_Base , int Copy_Height)
	{
		Triangle_Base   = Copy_Base ;
		Triangle_Height = Copy_Height;
	}
	public void GetTriangle_Area()
	{
		Triangle_Area = ( (float)0.5 * (float)Triangle_Base * (float)Triangle_Height );
		System.out.println("Triangle Area = "+Triangle_Area);
	}
	
	// Rhombus Area	
	public void SetRhombus_Diagonals( int Copy_Diagonal1 , int Copy_Diagonal2)
	{
		Rhombus_Diagonal1 = Copy_Diagonal1 ;
		Rhombus_Diagonal2 = Copy_Diagonal2 ;
	}
	public void GetRhombus_Area()
	{
		Rhombus_Area = ( (float)0.5 * (float)Rhombus_Diagonal1 * (float)Rhombus_Diagonal2 ) ;
		System.out.println("Rhombus Area = "+Rhombus_Area);
	}    
}
