import java.util.Scanner; //입력받기 위함 inport문
public class First_Java {
	public static void main(String[] args)
	{
		System.out.print("10~99 사이의 정수 입력");
		Scanner scanner = new Scanner(System.in); //정수입력
		int N = scanner.nextInt(); //변수N에 Scanner를 이용한 정수를 입력받고
		
		if(N >= 10 && N <= 99)  //10 ~ 99 사이의 값인경우를 가정함
		{
		if(N / 10 == N % 10) //몫과 나머지가 같으면 10의자리수와 1의자리 수가 같다
		{
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다."); //10의자리수와 1의자리수가 같은경우 출력
		}
		else 
		{
			System.out.print("10의 자리와 1의 자리가 다릅니다."); //10의 자리수와 1의자리수가 같지 않을 경우 출력
		}
		}
		else
		{
			System.out.print("10에서 99사이의 수를 입력해주세요"); //10~99사이의 수를 입력하지 않았을 경우 출력
		}
	}
}
