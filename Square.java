package nsj8;

import java.util.*;

public class Square extends  ShapeData
{	
	public float area = 0;
	public float perimeter = 0;
	public float side_size;

	public Square(StringTokenizer st) 
	{	
		side_size = Float.parseFloat(st.nextToken());	
	}
	
	public Square( float shapeType )
	{
		side_size = shapeType;
	}
	//multiply sides by each other and multiply 
	//side by 4 to get perimeter 
	@Override
	public double getArea() {
		area = side_size * side_size;
		return area;
	}

	@Override
	public double getPerimeter() {
		perimeter = side_size * 4;
		return perimeter;
	}
	
}
