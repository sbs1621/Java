package example2;

class Ractangle{
	public int x,y,w,h;
	public Ractangle(int a, int b, int c, int d) {
		
		x= a;y=b;w=c;h=d;//함수가 호출 되었을때 값을 저장 할수 있게 하는 변수
	}
	public void show() {
		System.out.println("(" + x+ ","+y+")에서 크기가 " + w + "x" + h + "인 사격형");
	}
	public int square() {
		
		return w * h;
	}
	public boolean contains(Ractangle r) {
		
		if(x < r.x && y<r.y && w>r.w && h>r.h&&x + w > r.x + r.w && y + h > r.y + r.h) //사각형 내 사각형이 있는지 판단하는 if문
			return true;//사각형 내 사각형이 있으면 True
		else
			return false;
		
	}
}



public class exapmle4_4 {
	public static void main(String[] agrs) {
		
		Ractangle r = new Ractangle(2,2,8,7);//r에 Ractangle 함수 호출
		Ractangle s = new Ractangle(5,5,6,6);//s에 Ractangle 함수 호출
		Ractangle t = new Ractangle(1,1,10,10);//t에 Ractangle 함수 호출
		
		r.show();//show 함수 호출
		System.out.println("s의 면적은 " + s.square());//square 함수 호출
		if(t.contains(r)) System.out.println("t는 r을 포함합니다");//t사각형 내 r사각형이 있으면 출력
		if(t.contains(s)) System.out.println("t는 s를 포함합니다");//t사각형 내 s사각형이 있으면 출력
		
	}

}
