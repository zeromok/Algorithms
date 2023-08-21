import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main( String[] args ) {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st = new StringTokenizer( br.readLine( ) );

		//  N개의 수의 갯수(numNo)와 질의 갯수(queryNo) 입력 받기
		int numNo = Integer.parseInt( st.nextToken( ) );
		int queryNo = Integer.parseInt( st.nextToken( ) );

		st = new StringTokenizer( br.readLine( ) );
		int[] sumArr = new int[ numNo + 1 ];
		// N개의 수 입력 받음과 동시에 합배열 초기화
		// 합 배열 공식 : S[i] = S[i-1] + Origin[i]
		for ( int i = 0; i < numNo; i++ ) {
			sumArr[ i + 1 ] = sumArr[ i ] + Integer.parseInt( st.nextToken( ) );
		}

		// 구간합 공식(S[end] - S[start -1)을 이용해 결과값 출력
		for ( int i = 0; i < queryNo; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			int start = Integer.parseInt( st.nextToken( ) );
			int end = Integer.parseInt( st.nextToken( ) );

			bw.write( ( sumArr[ end ] - sumArr[ start - 1 ] ) + "\n" );
		}
		bw.flush( );
		bw.close( );
	}

} // end