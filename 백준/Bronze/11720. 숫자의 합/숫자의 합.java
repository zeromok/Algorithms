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
		StringTokenizer st = new StringTokenizer( br.readLine() );

		// N 입력받기
		String N = st.nextToken();

		// N개의 숫자 입력 받아(numList) char[] 로 초기화(numArr)
		st = new StringTokenizer( br.readLine() );
		String numList = st.nextToken();
		char[] numArr = numList.toCharArray();

		long sum = 0; // 결과값이 담길 변수 선언 및 초기화

		// 위 char[] 순회하며 정수타입으로 바꾸어 sum에 더하기
		for ( char ch : numArr ) sum += ch - '0';

		bw.write( sum + "\n" );
		bw.flush();
	}
} // end