class Point{
	private int x ,y;
	public Point(int x, int y) {this.x =x; this.y = y;}
	//Point 생성자와 타입이 같은 ColorPoint의 생성자를 생성하기 위해 선언
	public int getX() {return x;}
	//toString에 반환값을 사용하기 위해 선언
	public int getY() {return y;}
	//toString에 반환값을 사용하기 위해 선언
	protected void move(int x, int y) {this.x =x; this.y = y;}
	//private한 x,y값을 다른 클래스에서도 사용할 수 있게 하기 위해 선언
}
class ColorPoint extends Point{//Point 클래스를 상속받는 ColorPoint클래스
	private String name;
	public ColorPoint() {this(0,0);this.name= "BLACK";}
	//기본값= 0,0점에 색은BLACK
	public ColorPoint(int x, int y) {super(x,y);}
	//super로 Point클래스의 x,y의 값을 가져옴 x,y객체 선언시 x,y값을 담기 위한생성자
	public void setXY(int x, int y) {move(x,y);}
	//x,y의 좌표를 저장하는 메소드
	public void setColor(String name) {this.name = name;}
	//Color를 재설정하는 메소드
	public String toString() {return name + "색의 (" + getX() + "," + getY() + ")의 점";}
	//인스턴스의 정보를 문자열의 형태로 반환하기 위한 메소드
}

public class example5_6 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();//기본값인0,0의 BLACK색상
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp = new ColorPoint(10,10); //10,10좌표로 시작
		cp.setXY(5, 5); //5,5로 변경
		cp.setColor("RED");//RED로 색상 변경
		System.out.println(cp.toString() + "입니다.");
		//결과 = RED색의 5,5좌표
	}
}
