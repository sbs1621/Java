package simple;

import java.util.Scanner;
public class prt2_2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int n = scanner.nextInt();
		System.out.print(n + "원은 " + "$" + (double)n/1100 + "입니다.");

	}

}
