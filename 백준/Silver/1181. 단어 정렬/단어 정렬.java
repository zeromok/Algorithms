import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[] words = new String[N];
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}

		mergeSort(words, 0, words.length - 1);

		// 중복 단어는 하나만 남기고 제거
        bw.write(words[0] + "\n");
		for (int i = 1; i < words.length; i++) {
			if (!words[i].equals(words[i - 1])) {
				bw.write(words[i] + "\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static void mergeSort(String[] words, int left, int right) {
		if (left < right) {
			// 1. 중간 인덱스 계산
			int mid = left + (right - left) / 2;

			// 2. 왼쪽 절반 재귀 호출
			mergeSort(words, left, mid);

			// 3. 오른쪽 절반 재귀 호출
			mergeSort(words, mid + 1, right);

			// 4. 정렬된 두 부분을 병합
			merge(words, left, mid, right);
		}
	}

	private static void merge(String[] words, int left, int mid, int right) {
		int n1 = mid - left + 1; // 왼쪽 배열 크기
		int n2 = right - mid; // 오른쪽 배열 크기

		// 임시 배열 생성
		String[] L = new String[n1];
		String[] R = new String[n2];

		// 데이터 복사
		for (int i = 0; i < n1; i++) {
			L[i] = words[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = words[mid + 1 + i];
		}

		int i = 0, j = 0;
		int k = left; // 병합된 배열을 넣을 시작 인덱스

		// L 과 R 을 비교하여 병합
		while (i < n1 && j < n2) {
			if (L[i].length() > R[j].length() || L[i].length() == R[j].length() && L[i].compareTo(R[j]) > 0) {
				words[k] = R[j];
				j++;
			} else {
				words[k] = L[i];
				i++;
			}
			k++;
		}

		// 남은 요소 처리
		while (i < n1) {
			words[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			words[k] = R[j];
			j++;
			k++;
		}
	}
}