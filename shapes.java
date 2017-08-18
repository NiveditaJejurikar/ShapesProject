//Nivu Jejurikar
//Advanced Programming
//Barret Koster
//this program determines the total area and perimeter
//of all shapes in a file called "shapes.txt"

package nsj8;

import java.util.*;
import java.io.*;

public class shapes 
{
	private BufferedReader br;
	shapes sd;
	ArrayList<ShapeData> shape_data;
	
	public static void main(String[] args)
	{
		shapes s = new shapes();	
	}
	
	//initialize an arraylist of type ShapeData, which
	//is an abstract class. read the contents of the shapes
	//file and call the dealWithLine function, which populates
	//the arraylist with circle, rectangle, square, or triangle
	//objects. then call the reportArea function which iterates
	//through the arrayList, calling the methods from the abstract
	//class, which get overriden by each shape class
	public shapes()
	{
		
		shape_data = new ArrayList<ShapeData>();
		try
		{
			FileReader fr = new FileReader("/Users/niveditajejurikar/Desktop/shapes.txt");
			BufferedReader br = new BufferedReader( fr );
			
			String line = null;
			while ((line = br.readLine()) != null)
			{
				dealWithLine( line );
			}
			br.close();
			fr.close();
		}
		catch( IOException e )
		{
			System.out.println("file thing: "+e);
		}

		reportArea();
	}
	
	public void dealWithLine( String line)
	{
		try 
		{
			StringTokenizer st = new StringTokenizer(line);
			String[] cmd = line.split(" ");
			String token1 = null;
			String token2 = null;
			
			//add shape objects to the arraylist depending on the 
			//input of line 
			if (cmd[0].equalsIgnoreCase("square")) 
			{
				ShapeData SquareInstance = new Square(Float.valueOf(cmd[1]));
				
				shape_data.add(SquareInstance);
				
			}
			else if (cmd[0].equalsIgnoreCase("circle"))
			{
				ShapeData CircleInstance = new Circle(Float.valueOf(cmd[1]));
				
				shape_data.add(CircleInstance);
			}
			else if (cmd[0].equalsIgnoreCase("rectangle"))
			{
				ShapeData RectangleInstance = new Rectangle(Float.valueOf(cmd[1]),Float.valueOf(cmd[2]));
				
				shape_data.add(RectangleInstance);
			}
			else if (cmd[0].equalsIgnoreCase("triangle"))
			{
				ShapeData TriangleInstance = new Triangle(Float.valueOf(cmd[1]),Float.valueOf(cmd[2]),Float.valueOf(cmd[3]));
				
				shape_data.add(TriangleInstance);
				
			}
			else 
			{
				System.out.println("not a valid shape");
			}	
		}
		catch (Exception e)
		{
			System.out.println("error in this line");
		}
	}
	
	public void reportArea()
	{
		float TotalArea = 0;
		float TotalPerimeter = 0;
		double area = 0;
		double perimeter = 0;
		for(int i = 0; i < shape_data.size(); i++){
			area = shape_data.get(i).getArea();
			perimeter = shape_data.get(i).getPerimeter();
			TotalArea += area;
			TotalPerimeter += perimeter;
		}
		//output the total area and perimeter of all shapes 
		System.out.println("Total area of all shapes is " + TotalArea);
		System.out.println("Total perimeter of all shapes is " + TotalPerimeter);

	}
}
