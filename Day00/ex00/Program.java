public class Program {
	public static void main (String[] args) {
		int	num = 222222;

		int sumOfDig = num % 10;

		num /= 10;
		sumOfDig += num % 10;
		num /= 10;
		sumOfDig += num % 10;
		num /= 10;
		sumOfDig += num % 10;
		num /= 10;
		sumOfDig += num % 10;
		num /= 10;
		sumOfDig += num % 10;
		
		System.out.println(sumOfDig);
	}
}
