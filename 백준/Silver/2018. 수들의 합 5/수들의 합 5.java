import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st = new StringTokenizer( br.readLine( ) );

		long num = Integer.parseInt( st.nextToken() );
		long count, startIdx, endIdx, sum;
		count = startIdx = endIdx = sum = 1;

		while ( endIdx != num ) {
			if ( sum == num ) {
				count++;
				endIdx++;
				sum += endIdx;
			} else if ( sum > num ) {
				sum -= startIdx;
				startIdx++;
			} else {
				endIdx++;
				sum += endIdx;
			}
		}

		bw.write( count + "\n" );
		bw.flush();
	}

} // end