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
		System.out.println("(" + x +"," + y + ")" + radius);
	}
}
public class example4_5 {
	public static void main(String[] agrs)
	{
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.print("x,y,radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int r = scanner.nextInt();
			c[i] = new Circle(x,y,r);
		}
		for(int i = 0; i<c.length;i++)
			c[i].show();
		scanner.close();
	}
}
