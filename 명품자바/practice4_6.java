import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show()
	{
		System.out.println("가장 큰 원은(" + x +"," + y + ")" + radius);
	}
	public int getradius()
	{
		return radius;
  }
}
public class example4_5 {
	public static void main(String[] agrs)
	{
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		int rad[] = new int[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.print("x,y,radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int r = scanner.nextInt();
			c[i] = new Circle(x,y,r);
			rad[i] = r;
		}
		int ra = 0;
		for(int i = 0; i < 3; i++)
		{
			if(ra < rad[i])
				ra = rad[i];
		}
		for(int i = 0; i< 3; i++)
		{
			if(ra == c[i].getradius())
				c[i].show();
		}
		scanner.close();
	}
}
