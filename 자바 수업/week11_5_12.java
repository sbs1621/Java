import java.util.Scanner;

abstract class Shape{//추상클래스 Shape
   private Shape next;
   public Shape() {next=null;}
   public void setNext(Shape obj) {next=obj;}//링크연결 삽입할때 사용
   public Shape getNext() {return next;}//삭제할때 사용
   public abstract String draw();//추상메소드 출력할때 사용
}

class Line extends Shape{//Shape를 상속받는 class 
	@Override
	public String draw() {
		return "Line";
	}
}

class Rect extends Shape{//Shape를 상속받는 class 
	@Override
	public String draw() {
		return "Rect";
	}
}

class Circle extends Shape{//Shape를 상속받는 class 
	@Override
	public String draw() {
		return "Circle";
	}
}
class run{//그래픽에디터를 실행하여 삽입,삭제,출력하기 위해 사용
	Shape head;//head와 tail로 처음과 시작에 해당되는 문자열을 지정하기위해 선언
	Shape tail;
	int count=0;
	
	//삽입
	public void insert(Shape beauty, int num) {
		switch(num) {
		case 1: //Line삽입
			beauty = new Line();
			break;
		case 2://Rect삽입
			beauty = new Rect();
			break;
		case 3://Circle삽입
			beauty = new Circle();
			break;
		}
		if(head==null) {
			head=beauty;
			tail=beauty;
		}
		else {
			tail.setNext(beauty);//삽입이 이루어지고
			tail=beauty;//마지막 순번으로 삽입됨
		}
		count++;
	}
	
	//삭제
	public void delete(int num) {//num에 해당되는 순서의 문자열을 삭제
		Shape temp=head;
		Shape x=null;
		
		for(int i=0; i<num-1; i++) {
			if(i==num-2)	x=temp;	//x는 삭제 전 노드
			temp=temp.getNext();	//temp는 삭제할 노드		
		}
		
		if(num==1) {	//제일 처음 노드 삭제
			if(head==tail)	head=tail=null;
			else	head=head.getNext();
		}
		
		
		else if(temp==null) {//삭제할 위치에 있지 않은경우
			System.out.println("삭제할 수 없습니다.");
		}
		
		else if(temp==tail) {	//마지막 노드 삭제
			tail=x;
			x.setNext(null);
		}
		
		else {	//중간 노드 삭제
			x.setNext(temp.getNext());
		}
	}
	
	//출력
	public void show() {
		Shape temp=head;
		if(temp==null) {//삽입되어 있는 값이 없는경우 출력
			System.out.println("출력할 도형이 없습니다.");
		}
		else {
			while(true) {//삽입된 값 출력하고
				System.out.println(temp.draw());
				if(temp==tail)	break;//처음과 끝이 같을경우 반복문 해제
				temp=temp.getNext();}//temp를 하나씩 미룸->언젠가는 tail과 같아짐
		}
	}
	
}

public class GraphicEditor {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Shape beauty = null;
		run test=new run();
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		boolean TF=true;
		
		while(TF) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int user=scanner.nextInt();
			
			switch(user) {
			case 1:	//삽입
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				int input=scanner.nextInt();
				test.insert(beauty, input);
				break;
				
			case 2:	//삭제
				System.out.print("삭제할 도형의 위치>> ");
				int x=scanner.nextInt();
				test.delete(x);
				break;
				
			case 3:	//모두 보기
				test.show();
				break;
				
			case 4:	//종료
				System.out.println("beauty를 종료합니다.");
				TF=false;
				break;
			}
		}
		scanner.close();
	}

}

