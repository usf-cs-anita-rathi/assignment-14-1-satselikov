import java.util.Scanner;

public class Handshake {
	
	public static int handshake(int number) {
		if (number < 2)
			return number-1;
		else
			return handshake(number-1) + number-1;
	}
	public static void main(String[] args) {
		int numberpeople;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of hands:");
		numberpeople = scanner.nextInt();
		for (int i = 1; i <= numberpeople; i++)
			System.out.println("Handshake " +"#"+i+": " + handshake(i));
	}
}