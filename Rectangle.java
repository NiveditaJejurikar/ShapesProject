package nsj8;

import java.util.StringTokenizer;

public class Rectangle extends  ShapeData
{
	public float height;
	public float width;
	public float area;
	public float perimeter;

	public Rectangle(StringTokenizer st) 
	{
		height = Float.parseFloat(st.nextToken());
		width = Float.parseFloat(st.nextToken());
	}
	
	public Rectangle( float input1, float input2 )
	{
		height = input1;
		width = input2;	
	}
	//calculate area and perimeter by mutliplying height and width
	//and adding the values of all sides 
	@Override
	public double getArea() {
		area = height * width;
		return area;
	}

	@Override
	public double getPerimeter() {
		perimeter = (2* height) + (2* width);
		return perimeter;
	}
}
