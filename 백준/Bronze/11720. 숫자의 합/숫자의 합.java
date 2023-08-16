import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		String strNum = sc.next();

		char[] chArr = new char[ num ];
		chArr = strNum.toCharArray();
		int sum = 0;
		for ( char ch : chArr ) {
			sum += ch - '0';
		}
		System.out.println( sum );
	}

} // end