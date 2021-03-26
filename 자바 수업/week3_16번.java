package example2;
import java.util.Scanner;
public class example3_16 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		String user = "";
		while(true)
		{
			System.out.print("가위 바위 보!>>");
			int n = (int)(Math.random()*3);
			user = scanner.next();
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다");
				scanner.close();
				break;
			}
				
			
					
			if(str[n].equals("가위"))
			{
				if(user.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				if(user.equals("바위"))
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				if(user.equals("보"))
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
			}
			else if(str[n].equals("바위"))
			{
				if(user.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
				if(user.equals("바위"))
					System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				if(user.equals("보"))
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 비겼습니다.");
			}
			else if(str[n].equals("보"))
			{
				if(user.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				if(user.equals("바위"))
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
				if(user.equals("보"))
					System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
			}
			
		}
		
		
			
		
		
	}

}
