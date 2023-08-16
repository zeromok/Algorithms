import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		// 변수 num에 과목 수 입력받기
		int num = sc.nextInt();
		// 길이가 num인 1차원 배열 scores 배열 선언
		int[] scores = new int[num];

		for(int i=0; i<num; i++) {
			scores[i] = sc.nextInt(); // scores[i]에 각 점수 저장 하기
		}

		long m = 0;
		long total = 0;
		for ( int i = 0; i < scores.length; i++ ) {
			total += scores[i]; // 총점
			if(scores[i] > m) m = scores[i]; // 최고점
		}
		System.out.println( total * 100.0 / m / num );
	}

} // end