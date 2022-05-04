import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int num = 0;

		while (num != 42) {
			num = scanner.nextInt();
			if (isPrimeNumber(sumOfDig(num)))
				count++;
		}
		System.out.println("Count of coffee-request - " + count);
	}

	private static int sumOfDig (int num) {
		int sum = 0;

		for (; num > 0; num /= 10) {
			sum += num % 10;
		}
		return sum;
	}

	private static boolean isPrimeNumber (int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
