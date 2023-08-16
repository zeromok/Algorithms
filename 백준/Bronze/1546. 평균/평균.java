import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
        int[] scores = new int[num];
        for(int i=0; i<num; i++) {
            scores[i] = sc.nextInt();
        }
        
		long m = 0;
		long total = 0;
		for ( int i = 0; i < scores.length; i++ ) {
			total += scores[i];
			if(scores[i] > m) m = scores[i];
		}
		System.out.println( total * 100.0 / m / num );
	}

} // end