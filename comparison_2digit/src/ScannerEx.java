import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("2�ڸ��� ������ �Է��Ͻÿ�.\n");
		Scanner scanner = new Scanner(System.in);
		
		int interger = scanner.nextInt();
		System.out.println(interger);
		
		if(interger > 10 && interger < 100) 
		{
			if (interger / 10 == interger % 10) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}
			else if(interger / 10 != interger % 10) {
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
			}
		
		}
		else
		{
			System.out.println("2�ڸ��� ������ �ƴմϴ�.");
		}
		
		scanner.close();
	}
}
