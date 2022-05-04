import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		int weekNum = 1;
		long allGrades = 0;

		for (; weekNum <= 18 && !inputStr.equals("42"); weekNum++) {
			if (!inputStr.equals("Week " + weekNum)) {
				System.err.println("IllegalArgument");
				System.exit(-1);
			}

			allGrades = boxingAllGrades(getMinGrade(scanner), allGrades, weekNum);
			inputStr = scanner.nextLine();
		}

		for (int i = 1; i < weekNum; i++) {
			System.out.print("Week ");
			System.out.print(i);
			System.out.print(" ");
			for (int j = 0; j < unboxingAllGrades(i, allGrades); j++) {
				System.out.print("=");
			}
			System.out.println(">");
		}
	}

	private static int getMinGrade(Scanner scanner) {
		int min = 9;
		int next;

		for (int i = 0; i < 5; i++) {
			next = scanner.nextInt();
			min = (next < min) ? next : min; 
		}
		scanner.nextLine();
		return (min);
	}

	private static long boxingAllGrades(int minGrade, long allGrades, int week) {
		long res;
		long powTen = 1;

		for (int i = 1; i < week; i++) {
			powTen *= 10;
		}
		res = allGrades + (minGrade * powTen);
		return (res);
	}

	private static int unboxingAllGrades(int index, long allGrades) {
		int res;

		for (int i = 1; i < index; i++) {
			allGrades /= 10;
		}
		res = (int)(allGrades % 10);
		return (res);
	}
}
