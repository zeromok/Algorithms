import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {
		/*
		* N의 값 입력 받기
		* 숫자 N개 입력 받아 String 으로 형변환
		* N개의 크기를 가진 char형 배열 선언
		* char형 배열에 String인 숫자 N개 형변환 해서 집어 넣기
		* char형 순회하며 int형변환 해 누적값 계산 후 출력
		* */
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		String strNum = sc.next();

		char[] chArr = new char[ num ];
		chArr = strNum.toCharArray();
		int sum = 0;
		for ( char ch : chArr ) {
			sum += ch - '0';
		}
		System.out.println( sum );
	}

} // end