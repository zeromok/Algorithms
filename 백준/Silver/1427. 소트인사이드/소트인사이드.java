import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		String N = br.readLine();
		int[] A = new int[N.length()];
		for ( int i = 0; i < N.length(); i++ ) {
			A[i] = Integer.parseInt( N.substring( i, i + 1 ) );
		}

		for ( int i = 0; i < N.length(); i++ ) {
			int maxIdx = i;

			for ( int j = i + 1; j < N.length(); j++ ) {
				if ( A[j] > A[maxIdx] ) {
					maxIdx = j;
				}
			}

			int temp = A[i];
			A[i] = A[maxIdx];
			A[maxIdx] = temp;
		}

		for(int i = 0; i < N.length(); i++) {
            bw.write(A[i] + "");
        }

		bw.flush();
		bw.close();
	}
} // end