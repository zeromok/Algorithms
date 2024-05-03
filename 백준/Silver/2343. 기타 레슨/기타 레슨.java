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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int start, end = 0;
		start = Arrays.stream(arr).max().getAsInt();
		end = Arrays.stream(arr).sum();

		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			int sum = 0;
			int count = 0;

			for (int i = 0; i < N; i++) {
				if (sum + arr[i] > mid) {
					count++;
					sum = 0;
				}
				sum += arr[i];
			}

			if (sum != 0)
				count++;

			if (count > M) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		bw.write(start + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

}
