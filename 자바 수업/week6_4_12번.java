import java.util.Scanner;
class concert{//이름이 들어갈 클래스를 만들어줍니다
	String name;
	public concert(String name)//좌석의 자리와 입력을 저장하기 위한 생성자를 만들어줍니다.
	{
		this.name = name;
	}
}
public class example4_12 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);//스캐너
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		concert S[] = new concert[10];//S,A,B좌석의 배열을 저장할 생성자를 불러옵니다.
		concert A[] = new concert[10];
		concert B[] = new concert[10];
		String na;
		int coin;//입력받은 이름과 배열의 이름을 비교하기위해 선언
		for(int i = 0; i < 10; i++)
		{
			S[i] = new concert("---");//모든 자리를 ---로 초기화 합니다.
			A[i] = new concert("---");
			B[i] = new concert("---");
		}
		while(true)
		{
			coin = 0;//반복문이 반복될때마다 비교를 하기 위해 0으로 초기화 시켜줍니다.
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
			int a = scanner.nextInt();//예약 조회 취소 종료를 결정하는 정수값을 입력합니다.
			if(a==1) {
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				int b = scanner.nextInt();//S,A,B좌석의 등급을 결정하는 정수값을 입력합니다.
				if(b==1) {
					System.out.print("S>>");
					for(int i = 0; i < 10; i++) {
						System.out.print(S[i].name + " ");//배열에 저장되어 있는 값들을 보여줍니다.
					}
					System.out.print("\n이름 >>");
					na = scanner.next();//예약할 사람의 이름을 입력합니다.
					System.out.print("번호 >>");
					int num = scanner.nextInt();//몇번째 자리에 들어갈지를 정하는 정수를 입력합니다.
					num--;//좌석은 1부터 시작하지만 배열의 자리는 0부터 시작하기때문에 -1을 해줍니다.
					if(num < 10)
						S[num] = new concert(na);//입력받은 이름을 저장할 생성자를 불러옵니다.		
					else System.out.println("없는 번호입니다");//입력받은 번호가 10보다 클경우 오류문을 출력합니다.
				}
				if(b == 2) {
					System.out.print("A>>");
					for(int i = 0; i < 10; i++) {
						System.out.print(A[i].name + " ");
					}
					System.out.print("\n이름 >>");
					na = scanner.next();
					System.out.print("번호 >>");
					int num = scanner.nextInt();
					num--;
					if(num < 10)
						A[num] = new concert(na);
					else System.out.println("없는 번호입니다");
					
					
				}
				if(b == 3) {
					System.out.print("B>>");
					for(int i = 0; i < 10; i++) {
						System.out.print(B[i].name + " ");
					}
					System.out.print("\n이름 >>");
					na = scanner.next();
					System.out.print("번호 >>");
					int num = scanner.nextInt();
					num--;
					if(num < 10)
						B[num] = new concert(na);	
					else System.out.println("없는 번호입니다");
				}
				
				if(b > 3)
					System.out.println("없는 좌석입니다");
				
			}
			if(a ==2) //조회를 할때는 모든 좌석을 보여줍니다.
			{
				System.out.print("S>>");
				for(int i = 0; i < 10; i++)
					System.out.print(S[i].name + " ");//입력받은 이름을 포함한 모든 좌석을 보여줍니다.
				System.out.print("\nA>>");
				for(int i = 0; i < 10; i++)
					System.out.print(A[i].name + " ");
				System.out.print("\nB>>");
				for(int i = 0; i < 10; i++)
					System.out.print(B[i].name + " ");
				System.out.println("\n<<<조회를 완료하였습니다>>>");
			}
			if(a == 3) //취소
			{
				System.out.print("좌석 S:1, A:2, B:3>>");
				int b = scanner.nextInt();//취소할 좌석의 등급을 결정하는 정수를 입력합니다.
				if(b == 1) {
					System.out.print("S>>");
					for(int i = 0; i < 10; i++)
						System.out.print(S[i].name + " ");
					System.out.print("\n이름>>");
					na = scanner.next();//배열 안에 들어있는 이름과 비교하기 위한 이름을 입력합니다.
					for(int i = 0; i < 10; i++)
					{
						if(S[i].name.equals(na)) {//해당 등급의 좌석의 배열안에 있는 이름과 입력받은 이름이 같은경우 ---로 초기화합니다.
							S[i].name = "---";
							coin = 1;//coin이 1이면 배열 안에 동일한 이름이 있고 취소 되었다는 뜻입니다.
						}
					}
					if(coin == 0)
						System.out.println("없는 이름입니다.");//coin이 0이므로 동일한 이름이 없습니다.
				}
				if(b == 2) {
					System.out.print("A>>");
					for(int i = 0; i < 10; i++)
						System.out.print(A[i].name + " ");
					System.out.print("\n이름>>");
					na = scanner.next();
					for(int i = 0; i < 10; i++)
					{
						if(A[i].name.equals(na)) {
							A[i].name = "---";
							coin = 1;
						}
					}
					if(coin == 0)
						System.out.println("없는 이름입니다.");
				}
				if(b == 3) {
					System.out.print("B>>");
					for(int i = 0; i < 10; i++)
						System.out.print(B[i].name + " ");
					System.out.print("\n이름>>");
					na = scanner.next();
					for(int i = 0; i < 10; i++)
					{
						if(B[i].name.equals(na)) {
							B[i].name = "---";
							coin = 1;
						}
					}
					if(coin == 0)
						System.out.println("없는 이름입니다.");
				}
			}
			if(a == 4) //종료합니다.
				break;
			if(a > 4)
				System.out.println("없는 번호입니다");
		}
		scanner.close();		
	}
}
