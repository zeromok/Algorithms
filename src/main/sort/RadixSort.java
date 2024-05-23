package src.main.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * PackageName :  src.test
 * FileName : RadixSort
 * Author : Daniel
 * Date : 2024-01-17
 * Description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2024-01-17           Daniel               최초 생성
 */
public class RadixSort {

	public static void main(String[] args) {

		int[] A = new int[] {155, 262, 36, 598, 433, 153};

		System.out.println("정렬 전 데이터 : " + Arrays.toString(A));
		radixSort(A);
		System.out.println("정렬 후 데이터 : " + Arrays.toString(A));

	}

	private static void radixSort(int[] a) {

		Queue<Integer>[] bucket = new LinkedList[10]; // 10진수 기준
		for (int i = 0; i < 10; i++) {
			bucket[i] = new LinkedList<>();
		}

		int maxNum = getMaxNum(a); // 최대 자릿수 몇자리인지?
		int digitNum = 0;
		int arrIdx = 0;

		for (int i = 0; i < maxNum; i++) {

			for (int j = 0; j < a.length; j++) {
				digitNum = getDigit(a[j], i); // 각 요소의 1, 10, 100 자리 수 반환
				bucket[digitNum].add(a[j]);
			}

			for (int j = 0; j < bucket.length; j++) {

				// bucket 을 순회하면서 차례대로 배열 초기화
				while (!bucket[j].isEmpty()) {
					a[arrIdx++] = bucket[j].remove();
				}
			}

			arrIdx = 0;
		}

	}

	// 데이터의 1, 10, 100, ... 의 자리에 있는 수 반환
	private static int getDigit(int num, int index) {
		return (int)(Math.floor(Math.abs(num) / Math.pow(10, index)) % 10);
	}

	// 데이터들 중 가장 큰 자릿수 반환
	private static int getMaxNum(int[] a) {

		int maxNum = 0;

		for (int j : a) {
			int size = (int)(Math.log10(j) + 1);
			if (maxNum < size) {
				maxNum = size;
			}
		}

		return maxNum;
	}
}
