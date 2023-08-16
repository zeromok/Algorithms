import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		sc.nextLine();
		String strNum = sc.nextLine();

		int[] scores = new int[ num ];
		String[] temp = strNum.split( " " );
		for ( int i = 0; i < temp.length; i++ ) {
			scores[ i ] = Integer.parseInt( temp[ i ] );
		}
		long max=0;
		long total = 0;
		for ( int i = 0; i < scores.length; i++ ) {
			total += scores[ i ];
			if(scores[i] > max)
				max = scores[ i ];
		}
		System.out.println( total * 100.0 / max / num );
    }
}