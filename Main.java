import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A = ");
		String originalString = scanner.nextLine();
		System.out.println("B = ");
		String stringToCheck = scanner.nextLine();
		scanner.close();

		AnagramTestCoordinator anagramTestCoordinator = new AnagramTestCoordinator();
		System.out.println("Answer " + (anagramTestCoordinator.isAnagram(originalString, stringToCheck)));
	}
}