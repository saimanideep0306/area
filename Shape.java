package area;
import java.util.*;
public class Shape {
	public void area()
	{
		System.out.println("area");		
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter \n1 For Circle \n2 for Triangele ");
		int input=in.nextInt();
		if(input==1)
		{
		AreaCircle c=new AreaCircle();
		System.out.println(c.show(5));
		}
		else if(input==2)
		{
			AreaTriangle t=new AreaTriangle();
			System.out.println(t.show(5,6));
		
		}
		else
		{
			System.out.println("Wrong choose");
		}

	}

}
class AreaTriangle extends Shape
{
	int height,base;
	public int show(int h,int b)
	{
		this.height=h;
		this.base=b;
		return (1/(height*base));
	}
}

class AreaCircle extends Shape
{
	int radius;
	public double show(int r)
	{
		this.radius=r;
		return (2.17*(r*r));
	}
}