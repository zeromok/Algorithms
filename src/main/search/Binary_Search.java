package main.search;

/**
 * packageName :  src.main.search
 * fileName : Binary_Search
 * author : Daniel
 * date : 2024-01-24 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2024-01-24           Daniel               최초 생성
 */
public class Binary_Search {

	public static void main(String[] args) {

		int[] A = new int[101];
		for (int i = 1; i <= 100; i++) {
			A[i - 1] = i;
		}

		System.out.println(binary_search(A, 65));

	}

	/**
	 * 배열안에서 특정 값의 인덱스를 찾아 반환
	 *
	 * @param a 배열
	 * @param searchNum 찾고자 하는 값
	 * @return 배열 안 찾고자 하는 값의 인덱스를 반환한다.<br>
	 * -1 : 찾고자 하는 값이 배열안에 없습니다.<br>0 : 배열이 비어있습니다.
	 * */
	private static int binary_search(int[] a, int searchNum) {

		int start = 0;
		int end = a.length - 1;

		try {

			while (start <= end) {
				int mid = (start + end) / 2;
				// 찾고자 하는 값이 중간값과 같으면 종료
				if (a[mid] == searchNum)
					return mid;
				if (a[mid] > searchNum) { // 찾고자 하는 값이 중간값 보다 작으면
					end = mid - 1;
				} else if (a[mid] < searchNum) { // 찾고자 하는 값이 중간값 보다 크면
					start = mid + 1;
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		} catch (NullPointerException e) {
			return 0;
		}

		return searchNum;

	}

} // end class
