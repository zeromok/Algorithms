import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
        
		StringTokenizer st = new StringTokenizer( br.readLine() );
		for ( int i = 0; i < N; i++ ) {
			A[i] = Integer.parseInt( st.nextToken() );
		}

		// 삽입 정렬
		for ( int i = 1; i < N; i++ ) {
			int temp = A[i];
			int firstIdx = i - 1;
			while ( firstIdx >= 0 && A[firstIdx] > temp ) {
				A[firstIdx + 1] = A[firstIdx];
				firstIdx--;
			}
			A[firstIdx + 1] = temp;
		};

		int[] S = new int[N];
		S[0] = A[0];
		for ( int i = 1; i < N; i++ ) {
			S[i] = S[i - 1] + A[i];
		}
        
		bw.write( Arrays.stream( S ).sum() + "" );

		bw.flush();
		bw.close();
	}
} // end