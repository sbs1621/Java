package example2;
import java.util.Scanner;

public class ex2 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("소문자 알파뱃 하나를 입력하시오>>"); 
		char s = scanner.next().charAt(0); //char 문으로 스캐너를 받기 위해 작성합니다 
		int a = 'a'; //밑에 for문에서 출력을 위해 a의 아스키 코드값을 변수로 선언
		for(int i = 0; i <= (int)s - 96; i++) //알파뱃 소문자를 입력받기 때문에 아스키 코드값-96을 적어줍니다
			{
			for(int j = 0; j < (int)s - 96 - i;j++) //점차 감소하여 출력해야 하기 때문에 –i를 하였습니다
			{
				System.out.print((char)(a + j)); //아스키코드 값으로 되어있기 때문에 문자로 바꾸기 위해char로 a+ j를 묶었습니다
			}
			System.out.println("");//줄바꿈을 위해 출력	
			}
	
	}
}
