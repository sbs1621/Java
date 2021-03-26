package example2;
import java.util.Scanner;
public class ex1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 원의 중심과 반지름 입력>>");
		int x1 = scanner.nextInt(); //첫번째 원의 x좌표값 입력
		int y1 = scanner.nextInt(); //첫번째 원의 y좌표값 입력
		int r1 = scanner.nextInt(); //첫번째 원의 반지름 입력
		System.out.println("두번째 원의 중심과 반지름 입력>>");
		int x2 = scanner.nextInt(); //두번째 원의 x좌표값 입력
		int y2 = scanner.nextInt(); //두번째 원의 y좌표값 입력
		int r2 = scanner.nextInt(); //두번째 원의 반지름 입력
		//두 원이 겹치기 위해서는 더 큰x좌표값 - 작은x좌표값이 반지름 보다 작아야하고
//큰y좌표값 - 작은y좌표값이 반지름 보다 작아야하기 때문에 해당 if문을 만들었습니다
		if(x1 >= x2 && y1 >= y2) //첫번째 원의 xy좌표값이 더 큰 경우
		{
			if((x1 - x2 <= r1 || x1-x2 <= r2)&&(y1 - y2 <= r1 || y1- y2 <= r2))
				System.out.println("두 원이 겹칩니다.");
			else
				System.out.println("두 원이 겹치지 않습니다.");
		}
		
		else if(x2 >= x1 && y1 >= y2) //두번째 원의 x좌표, y좌표는 첫번째 원이 더큰 경우
		{
			if((x2 - x1 <= r1 || x2-x1 <= r2)&&(y1 - y2 <= r1 || y1- y2 <= r2))
				System.out.println("두 원이 겹칩니다.");
			else
				System.out.println("두 원이 겹치지 않습니다.");
		}
		else if(x2 <= x1 && y1 <= y2) //두번째 원의 y좌표, x좌표는 첫번째 원이 더큰 경우 
		{
			if((x1 - x2 <= r1 || x1-x2 <= r2)&&(y2 - y1 <= r1 || y2- y1 <= r2))
				System.out.println("두 원이 겹칩니다.");
			else
				System.out.println("두 원이 겹치지 않습니다.");
		}
		else if(x2 >= x1 && y1 <= y2) //두번째 원의 xy좌표값이 더 큰 경우
		{
			if((x2 - x1 <= r1 || x2-x1 <= r2)&&(y2 - y1 <= r1 || y2- y1 <= r2))
				System.out.println("두 원이 겹칩니다.");
			else
				System.out.println("두 원이 겹치지 않습니다.");
		}
		scanner.close();
	}
}
