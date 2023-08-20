import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );

		int arrCnt = Integer.parseInt(sc.next()); // N x N 개의 크기 입력 받기
		int queryCnt = Integer.parseInt(sc.next()); // 질의 개수 입력 받기

		// 원본 배열 선언
		int[][] originArr = new int[ arrCnt + 1 ][ arrCnt + 1 ];
		// 원본 배열 초기화
		for ( int i = 1; i <= arrCnt; i++ ) {
			for ( int j = 1; j <= arrCnt; j++ ) {
				originArr[ i ][ j ] = Integer.parseInt(sc.next());
			}
		}

		// 합 배열 선언
		int[][] sumArr = new int[arrCnt + 1][arrCnt + 1];
		// 합 배열 초기화
		for ( int i = 1; i <= arrCnt; i++ ) {
			for ( int j = 1; j <= arrCnt; j++ ) {
				sumArr[ i ][ j ] =
					sumArr[ i ][ j - 1 ] + sumArr[ i - 1 ][ j ] - sumArr[ i - 1 ][ j - 1 ] + originArr[ i ][ j ];
			}
		}

		// 질의 받은 후 결과 출력
		for ( int i = 0; i < queryCnt; i++ ) {
			int x1 = Integer.parseInt(sc.next());
			int y1 = Integer.parseInt(sc.next());
			int x2 = Integer.parseInt(sc.next());
			int y2 = Integer.parseInt(sc.next());

			System.out.println(sumArr[ x2 ][ y2 ] - sumArr[ x1 - 1 ][ y2 ] - sumArr[ x2 ][ y1 - 1 ] + sumArr[ x1 - 1 ][ y1 - 1 ]);
		}

	}

} // end