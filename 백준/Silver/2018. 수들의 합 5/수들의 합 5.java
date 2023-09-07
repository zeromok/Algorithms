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

		// N 입력받기
		long num = Integer.parseInt( st.nextToken() );
		// 필요한 변수들 선언 및 초기화
		long count, startIdx, endIdx, sum;
		count = startIdx = endIdx = sum = 1;

		// end_index 가 끝 점 즉, N 일때 멈추는 반복문
		while ( endIdx != num ) {
			if ( sum == num ) { // sum == N
				endIdx++;
				sum += endIdx;
				count++;
			} else if ( sum > num ) { // sum > N
				sum -= startIdx;
				startIdx++;
			} else { // sum < N
				endIdx++;
				sum += endIdx;
			}
		}

		bw.write( count + "\n" );
		bw.flush();
	}

} // end