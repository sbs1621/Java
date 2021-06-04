import java.util.*;//util디렉토리의 모든 클래스를 import(스캐너, 벡터)

abstract class Shape{//추상 클래스 Shape
	public Shape(){}	//생성자 생성
	public abstract void draw();// 출력을 위한 추상메소드
	
}
class Line extends Shape{//추상클래스Shape를 상속
	@Override
	public void draw() {//오버라이드 해서 추상메소드 구현
		System.out.println("Line");
	}
}
class Rect extends Shape{//추상클래스Shape를 상속
	@Override
	public void draw() {//오버라이드 해서 추상메소드 구현
		System.out.println("Rect");	
	}
}
class Circle extends Shape{//추상클래스Shape를 상속
	@Override
	public void draw() {//오버라이드 해서 추상메소드 구현
		System.out.println("Circle");		
	}
}

public class example7_10 {
	public static void main(String[] args) {
		Vector<Shape> v = new Vector<Shape>();//Shape객체를 요소로 다루는 벡터생성
		Scanner scanner = new Scanner(System.in);//스캐너
		int n = 0;
		System.out.println("그래픽 에디터beauty를 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료 (4)>>");
			n = scanner.nextInt();//정수로 삽입, 삭제, 보기, 종료 중 선택
			if(n == 1) {//벡터에 1개씩 추가
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				n = scanner.nextInt();
				if(n == 1) {
					v.add(new Line());//객체 삽입
				}
				else if(n == 2) {
					v.add(new Rect());//객체 삽입
				}
				else if(n == 3) {
					v.add(new Circle());//객체 삽입
				}
				else {
					System.out.println("처음부터 다시입력하세요");
				}
			}
			else if(n == 2) {//벡테에 있는 도형을 삭제
				System.out.print("삭제할 도형의 위치>>");
				n = scanner.nextInt();
				if(v.size() > n) {//벡터의 크기보다 입력받은 크기가 작을경우
					v.remove(n);//해당 공간에 있는 벡터 객체 삭제
				}
				else {//벡터의 크기보다 입력받은 값보다 클경우 삭제할수없음
					System.out.println("삭제할수 없습니다.");
				}
			}
			else if(n == 3) {//현재 벡터에 들어있는 객체들을 보여줌
				for(int i = 0; i < v.size(); i++) {
					v.get(i).draw();//i번째에 있는 객체를 얻어내 draw로 출력
				}
			}
			else if(n == 4) {//종료
				System.out.print("beauty를 종료합니다.");
				break;
			}
			else {//1~4에 해당하지 않는 값을 입력하여 처음부터 다시 시작
				System.out.println("다시입력하세요");
			}
			
		}
		scanner.close();
	}
}
