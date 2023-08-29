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

		// N 입력 받기
		int num = Integer.parseInt( st.nextToken() );
		// M 입력 받기
		int mod = Integer.parseInt( st.nextToken() );

		// 합 배열 선언
		long[] sumArr = new long[num];
		// 같은 나머지 그룹화를 위한 배열 선언
		long[] modArr = new long[mod];
		// result 선언
		long result = 0;

		// 합 배열 초기화
		st = new StringTokenizer( br.readLine() );
		sumArr[ 0 ] = Integer.parseInt( st.nextToken() );
		for ( int i = 1; i < num; i++ ) {
			sumArr[ i ] = sumArr[ i - 1 ] + Integer.parseInt( st.nextToken() );
		}

		// 합 배열의 모든 원소에 %M 연산
		for ( int i = 0; i < num; i++ ) {
			int temp = ( int )(sumArr[i] % mod);
			// 0~i 까지의 합이 0일 때
			if ( temp == 0  )
				result++;
			modArr[ temp ]++; // 나머지가 같을 때
		}

		for ( int i = 0; i < mod; i++ ) {
			// 나머지가 같은 원소 중 2개를 뽑는 경우의 수
			result += modArr[ i ] * ( modArr[ i ] - 1 ) / 2;
		}
		bw.write( result + "\n" );
		bw.flush();
	}

} // end