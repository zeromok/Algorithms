package src.main.sort;

import java.io.IOException;
import java.util.Arrays;

public class CountingSort {
	
	public static void main(String[] args) throws IOException {
		
		int[] A = new int[] {3, 1, 3, 5, 1, 6};
		
		// 누적합을 이용하는 방법
		
		long start = System.nanoTime();
		System.out.println(Arrays.toString(accSum(A)));
		long end = System.nanoTime();
		System.out.printf("누적 합 방법 수행 후 : %f 초", (end - start) / 1e9);
		
		// 기존 방법
		start = System.nanoTime();
		System.out.println("\n" + Arrays.toString(extracted(A)));
		end = System.nanoTime();
		System.out.printf("기존방법 수행 후 : %f 초", (end - start) / 1e9);
	}
	
	private static int[] accSum(int[] A) {
		int[] B = new int[A.length + 1];
		int[] C = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			B[A[i]]++;
		}
		
		for (int i = 1; i < B.length; i++) {
			B[i] = B[i] + B[i - 1];
		}
		
		for (int i = A.length - 1; i >= 0; i--) {
			// B[A[i]]--;
			C[--B[A[i]]] = A[i];
		}
		return C;
	}
	
	private static int[] extracted(int[] A) {
		int[] B = new int[A.length + 1];
		int[] C = new int[A.length];
		
		long start = System.nanoTime();
		for (int item : A) {
			B[item]++;
		}
		
		int idx = 0;
		for (int i = 0; i < B.length; i++) {
			while (B[i] != 0) {
				B[i]--;
				C[idx] = i;
				idx++;
			}
		}
		return C;
	}
	
} // end
