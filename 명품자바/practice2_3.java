package simple;
import java.util.Scanner;
public class prt2_3 {
public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요(10만원 이내)>>");
		int n = scanner.nextInt();
		int a[] = new int[5];
		String[] m = {"1원","10원","100원","1000원","100000원"};
		
		for(int i = 0; i < 5;i++)
		{
			a[i] = n % 10;
			n/=10;
			
		}
		for(int i = 0; i < 5; i ++)
		{
			System.out.println(m[i] + a[i] + "개");
		}
	
	}
}
