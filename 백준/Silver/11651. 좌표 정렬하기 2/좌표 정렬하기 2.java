import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	private static Coordinate[] temp;

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

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			coordinates[i] = new Coordinate(x, y);
		}

		temp = new Coordinate[N];
		mergeSort(coordinates, 0, coordinates.length - 1);
		temp = null;

		for (Coordinate coordinate : coordinates) {
			bw.write(coordinate + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static void mergeSort(Coordinate[] coordinates, int left, int right) {
		// 종료 조건
		if (left < right) {
			// 분할
			int mid = (left + right) / 2;

			// 재귀
			mergeSort(coordinates, left, mid);
			mergeSort(coordinates, mid + 1, right);

			// 병합
			merge(coordinates, left, mid, right);
		}
	}

	private static void merge(Coordinate[] coordinates, int left, int mid, int right) {
		System.arraycopy(coordinates, left, temp, left, right - left + 1);

		int i = left;
		int j = mid + 1;
		int k = left;

		// 병합
		while (i <= mid && j <= right) {
			if (temp[i].y < temp[j].y || (temp[i].y == temp[j].y && temp[i].x < temp[j].x)) {
				coordinates[k] = temp[i];
				i++;
			} else {
				coordinates[k] = temp[j];
				j++;
			}
			k++;
		}

		// 남은 원소 처리
		while (i <= mid) {
			coordinates[k] = temp[i];
			k++;
			i++;
		}
	}
}