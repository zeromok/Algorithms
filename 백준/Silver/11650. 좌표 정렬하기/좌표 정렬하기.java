import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static class Coordinate {
		int x;
		int y;

		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return x + " " + y;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Coordinate[] coordinates = new Coordinate[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			coordinates[i] = new Coordinate(x, y);
		}

		mergeSort(coordinates, 0, N - 1); // 292 ms

		for (int i = 0; i < N; i++) {
			bw.write(coordinates[i] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

    private static void mergeSort(Coordinate[] coordinates, int left, int right) {
		if (left < right) {
			// 1. 중간 인덱스 계산
			int mid = (left + right) / 2;

			// 2. 왼쪽 절반 재귀 호출
			mergeSort(coordinates, left, mid);

			// 3. 오른쪽 절반 재귀 호출
			mergeSort(coordinates, mid + 1, right);

			// 4. 정렬된 두 부분을 병합
			merge(coordinates, left, mid, right);
		}
	}

	private static void merge(Coordinate[] coordinates, int left, int mid, int right) {
		int n1 = mid - left + 1; // 왼쪽 배열 크기
		int n2 = right - mid; // 오른쪽 배열 크기

		// 임시 배열 생성
		Coordinate[] L = new Coordinate[n1];
		Coordinate[] R = new Coordinate[n2];

		// 데이터 복사
		for (int i = 0; i < n1; i++) {
			L[i] = coordinates[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = coordinates[mid + 1 + i];
		}

		int i = 0, j = 0;
		int k = left; // 병합된 배열을 넣을 시작 인덱스

		// L 과 R 을 비교하여 병합
		while (i < n1 && j < n2) {
			if (L[i].x < R[j].x || (L[i].x == R[j].x && L[i].y < R[j].y)) {
				coordinates[k] = L[i];
				i++;
			} else {
				coordinates[k] = R[j];
				j++;
			}
			k++;
		}

		// 남은 요소 처리
		while (i < n1) {
			coordinates[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			coordinates[k] = R[j];
			j++;
			k++;
		}
	}
}