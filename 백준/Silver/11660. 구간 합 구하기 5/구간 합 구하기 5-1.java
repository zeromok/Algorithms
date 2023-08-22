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

		int arrCnt = Integer.parseInt( st.nextToken( ) );
		int queryCnt = Integer.parseInt( st.nextToken( ) );

		// 입력받은 값을 이용해 원본 배열 선언 및 초기화
		int[][] originArr = new int[ arrCnt + 1 ][ arrCnt + 1 ];
		for ( int i = 1; i <= arrCnt; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			for ( int j = 1; j <= arrCnt; j++ ) {
				originArr[ i ][ j ] = Integer.parseInt( st.nextToken( ) );
			}
		}

		// 원본배열을 이용해 합배열 선언 및 초기화
		// S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + Origin[i][j]
		int[][] sumArr = new int[ arrCnt + 1 ][ arrCnt + 1 ];
		for ( int i = 1; i <= arrCnt; i++ ) {
			for ( int j = 1; j <= arrCnt; j++ ) {
				sumArr[ i ][ j ] =
					sumArr[ i ][ j - 1 ] + sumArr[ i - 1 ][ j ] - sumArr[ i - 1 ][ j - 1 ] + originArr[ i ][ j ];
			}
		}

		// 입력받은 구간의 합 구하기
		for ( int i = 0; i < queryCnt; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			int x1 = Integer.parseInt( st.nextToken( ) );
			int y1 = Integer.parseInt( st.nextToken( ) );
			int x2 = Integer.parseInt( st.nextToken( ) );
			int y2 = Integer.parseInt( st.nextToken( ) );

			bw.write(
				sumArr[ x2 ][ y2 ] - sumArr[ x1 - 1 ][ y2 ] - sumArr[ x2 ][ y1 - 1 ] + sumArr[ x1 - 1 ][ y1 - 1 ] +
				"\n" );
		}

		bw.flush( );
		bw.close( );
	}
}
