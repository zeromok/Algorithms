import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );

		int numCnt = Integer.parseInt(sc.next()); // 숫자의 개수 입력 받기
		int queryCnt = Integer.parseInt(sc.next()); // 질의 개수 입력 받기

		// 합 배열 선언
		int[] sumArr = new int[ numCnt + 1 ];
		// 합 배열 초기화
		for ( int i = 1; i <= numCnt; i++ ) {
			sumArr[ i ] = sumArr[ i - 1 ] + Integer.parseInt(sc.next());
		}

		// 구간 합 공식
		for ( int q = 0; q < queryCnt; q++ ) {
			int i = Integer.parseInt(sc.next());
			int j = Integer.parseInt(sc.next());
			System.out.println( sumArr[ j ] - sumArr[ i - 1 ] );
		}
	}

} // end