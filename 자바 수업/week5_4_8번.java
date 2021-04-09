import java.util.Scanner;
class PhoneBook{
	String na,ph;
	PhoneBook(String na1, String ph1) {
		this.na = na1;//입력된 이름을 저장 받을 문자열
		this.ph = ph1;//입력된 전화번호를 저장받을 문자열
	}
}
public class example4_8 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = scanner.nextInt();//인원수 설정
		PhoneBook[] PhoneBook = new PhoneBook[n];//인원수 만큼의 배열을 받는 클래스 호출
		String name[] = new String[n];//이름을 받을 배열n개
		String pn [] = new String[n];//전화번호를 받을 배열n개
		String name2 = "";//비교할 이름 문자열
		for(int i = 0; i < n; i++){
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			name[i] = scanner.next();
			pn[i] = scanner.next();
			PhoneBook[i] = new PhoneBook(name[i], pn[i]);//입력한 이름과 전화번호를 클래스에 저장
		}
		System.out.println("저장 되었습니다...");
		while(true){
			int cnt = 0;
			System.out.print("검색할 이름 >>");
			name2 = scanner.next();
			if(name2.equals("그만"))//무한루프 탈출
				break;
			for(int i = 0; i < n;i++){
				if(name2.equals(PhoneBook[i].na))//입력한 이름과 클래스에 저장되어있는 이름이 같은경우
				{
					System.out.println(PhoneBook[i].na + "의 번호는 "+PhoneBook[i].ph + " 입니다.");
					cnt = 1;//클래스에 저장되어 있으면 cnt를 1로 만듦
					break;
				}
			}
			if(cnt != 1)//cnt가 1이 아닌 경우는 클래스에 저장되어 있는 이름과 비교할 이름이 같지 않다는 것
				System.out.println(name2 + " 이 없습니다.");
		}
		scanner.close();	
	}
}
