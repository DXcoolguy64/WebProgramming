import java.util.Scanner;

public class SecurityMain {

	public static void main(String[] args) {

		Scanner oScan = new Scanner(System.in);
		SecureApp SecurityTest = new SecureApp();
		

		SecurityTest.SafeNotSafe(oScan.nextLine());
	}

}
