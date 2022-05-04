import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		int	num = scanner.nextInt();
		boolean isPrime = true;
		int	i = 2;

		if (num <= 1) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}

		for (; i * i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime + " " + (i - 1));
	}
}
