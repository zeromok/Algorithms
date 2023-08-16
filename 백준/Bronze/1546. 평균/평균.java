import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		/*
		* 변수 num 에 과목수 입력받기
		* String strNum에 공백 기준 과목별 점수 입력받기
		* num의 크기를 가진 int[] scores 할당
		* strNum을 공백기준 배열로 만든 후 int 형변환해서 scores 에 할당
		* scores를 순회하며 최댓값, 모든 점수 합계 구하기
		* 수식을 이용해 새로운 점수의 평균 반환
		* */
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		sc.nextLine();
		String strNum = sc.nextLine();

		int[] scores = new int[ num ];
		String[] temp = strNum.split( " " );
		for ( int i = 0; i < temp.length; i++ ) {
			scores[ i ] = Integer.parseInt( temp[ i ] );
		}
		long max=0;
		long total = 0;
		for ( int i = 0; i < scores.length; i++ ) {
			total += scores[ i ];
			if(scores[i] > max)
				max = scores[ i ];
		}
		System.out.println( total * 100.0 / max / num );
    }
}