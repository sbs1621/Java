package example2;

public class Add {
public static void main(String[] args) {
		
		
		int sum = 0;
		
		for(int i = 0; i < args.length;i++)
		{
			try {
				sum += Integer.parseInt(args[i]);//정수로 변환
				}
			catch(NumberFormatException e)//정수로 변환 할 수 없는 것들을 예외처리
			{
				continue;
			}
			
		}
		System.out.println(sum);
}
}
