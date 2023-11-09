import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	private static int[] currArr;
	private static int[] checkArr;
	private static int checkNum;

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );

		int S = Integer.parseInt( st.nextToken() );
		int P = Integer.parseInt( st.nextToken() );
		int result = 0;

		st = new StringTokenizer( br.readLine() );
		char[] A = st.nextToken().toCharArray();

		currArr = new int[4];
		checkArr = new int[ 4 ];
		st = new StringTokenizer( br.readLine() );
		for ( int i = 0; i < 4; i++ ) {
			checkArr[ i ] = Integer.parseInt( st.nextToken() );
			if ( checkArr [i] == 0) checkNum++;
		}

		for ( int i = 0; i < P; i++ ) {
			add( A[ i ] );
		}

		if(checkNum == 4)
			result++;

		for ( int i = P; i < S; i++ ) {
			int j = i - P;
			add( A[ i ] );
			remove( A[ j ] );

			if(checkNum == 4) result++;
		}

		bw.write( String.valueOf( result ) );

		bw.flush();
		bw.close();
	}

	private static void remove( char c ) {
		switch(c) {
			case 'A':
				if(currArr[0] == checkArr[0]) checkNum--;
				currArr[0]--;
				break;
			case 'C':
				if(currArr[1] == checkArr[1]) checkNum--;
				currArr[1]--;
				break;
			case 'G':
				if(currArr[2] == checkArr[2]) checkNum--;
				currArr[2]--;
				break;
			case 'T':
				if(currArr[3] == checkArr[3]) checkNum--;
				currArr[3]--;
				break;
		}
	}

	private static void add( char c ) {
		switch (c) {
			case 'A':
				currArr[0]++;
				if(currArr[0] == checkArr[0]) checkNum++;
				break;
			case 'C':
				currArr[1]++;
				if(currArr[1] == checkArr[1]) checkNum++;
				break;
			case 'G':
				currArr[2]++;
				if(currArr[2] == checkArr[2]) checkNum++;
				break;
			case 'T':
				currArr[3]++;
				if(currArr[3] == checkArr[3]) checkNum++;
				break;
		}
	}

} // end