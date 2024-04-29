import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int start = 0;
			int end = arr.length - 1;
			int target = Integer.parseInt(st.nextToken());

			try {
				boolean trigger = false;

				while (start <= end) {
					int mid = (start + end) / 2;
					int midValue = arr[mid];

					if (midValue == target) {
						trigger = true;
						break;
					} else if (midValue > target) {
						end = mid - 1;
					} else if (midValue < target) {
						start = mid + 1;
					}
				}

				if (trigger) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

}
