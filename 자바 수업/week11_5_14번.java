interface Shape{
	final double PI = 3.14;//타원과 원의 넓이에 사용될 PI
	void draw();//redraw에 사용됨
	double getArea();//넓이
	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();//다시 그림
	}
}
class Circle implements Shape{//Shape인터페이스를 상속받는 클래스Circle
	private int r;//반지름 r
	public Circle(int r) {
		this.r = r;}
	@Override
	public void draw() {
		 System.out.println(" 반지름이 "+ r+"인 원입니다.");	
	}
	@Override
	public double getArea() {
		return r*r*PI;//반지름이 r인 원의 넓이
	}
}
class Rect implements Shape{//Shape인터페이스를 상속받는 클래스Rect
	private int a,b;//사각형 높이와 너비
	public Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println(" "+a+"x"+b+"크기의 사각형 입니다.");
	}
	@Override
	public double getArea() {
		return a *b;//높이x너비 값을 가지는 사각형의 넓이
	}
}
class Oval implements Shape{//Shape인터페이스를 상속받는 클래스Oval
	private int a,b;//원을 내접하는 사각형의 높이와 너비
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println(" "+a+"x"+b+"에 내접하는 타원입니다.");	
	}

	@Override
	public double getArea() {
		return PI*a*b;//PIx높이x너비값을 가지는 타원의 넓이
	}
}
public class ex5_14 {
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		for(int i = 0; i < list.length;i++)
			list[i].redraw();//다시그린 것들을 출력
		for(int i = 0; i < list.length;i++)
			System.out.println("면적은 " + list[i].getArea());//해당 넓이값 출력
	}
}
