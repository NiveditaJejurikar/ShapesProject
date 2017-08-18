package nsj8;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Circle extends ShapeData
{
	public float radius;
	public float area = 0;
	public float perimeter = 0;
	double piVar=3.14;
	
	public Circle(StringTokenizer st) 
	{
		radius = Float.parseFloat(st.nextToken());
	}
	
	public Circle( float input1 )
	{
		radius = input1;
	}
	
	//calculate area and perimeter using the java PI value 
	@Override
	public double getArea() {
		piVar = Math.PI;
		area = (float) (piVar * (radius * radius));
		return area;
	}

	@Override
	public double getPerimeter() {
		piVar = Math.PI;
		perimeter = (float) ((radius * 2) * piVar);
		return perimeter;
	}
}
