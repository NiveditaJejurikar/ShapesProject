package nsj8;

import java.util.StringTokenizer;

public class Triangle extends ShapeData 
{
	public float side1;
	public float side2;
	public float side3;
	public float areaVariable;
	public float area;
	public float perimeter;
	
	public Triangle(StringTokenizer st) {
		side1 = Float.parseFloat(st.nextToken());
		side2 = Float.parseFloat(st.nextToken());
		side3 = Float.parseFloat(st.nextToken());
	}
	
	public Triangle ( float input1, float input2, float input3 )
	{
		side1 = input1;
		side2 = input2;
		side3 = input3;
	}
	//use Heron's Formula to calculate area and 
	//sum all sides to calculate perimeter 
	@Override
	public double getArea() {
		areaVariable = ((side1 + side2 + side3)/2);
		area = (float) Math.sqrt(areaVariable * (areaVariable - side1) * (areaVariable - side2) * (areaVariable - side3));
		return area;
	}
	@Override
	public double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}

}
