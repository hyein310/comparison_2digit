import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("2자리수 정수를 입력하시오.\n");
		Scanner scanner = new Scanner(System.in);
		
		int interger = scanner.nextInt();
		System.out.println(interger);
		
		if(interger > 10 && interger < 100) 
		{
			if (interger / 10 == interger % 10) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else if(interger / 10 != interger % 10) {
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
			}
		
		}
		else
		{
			System.out.println("2자리수 정수가 아닙니다.");
		}
		
		scanner.close();
	}
}
