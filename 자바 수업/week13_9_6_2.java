class Circle{
	private int x,y,radius;
	public Circle(int x,int y,int radius) {//생성자 생성
		this.x = x;this.y = y;this.radius = radius;
	}
	public String toString() {//객체를 문자열로 변환
		return "Circle(" + x + "," + y+")반지름" + radius;
	}
	
	public boolean equals(Object obj) {//두 객체를 비교하기 위해 선언
		Circle a = (Circle)obj;
		if(x==a.x && y==a.y)//(x,y)좌표가 같다면 true값을 return
			return true;
		else
			return false;
	}
}

public class example6_2 {
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a);//a는 a.toString()으로 자동변환
		System.out.println("원 b : " + b);//b는 b.toString()으로 자동변환
		if(a.equals(b))//a와b가 가리키는 (x,y)좌표의 값이 같으면 true
			System.out.println("같은원");
		else 
			System.out.println("서로 다른 원");
	}
}
