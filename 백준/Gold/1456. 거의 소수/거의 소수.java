import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong((st.nextToken()));
		long B = Long.parseLong(st.nextToken());

		long[] arr = new long[10000001];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 2; i <= Math.sqrt(arr.length - 1); i++) {
			if (arr[i] == 0) {
				continue;
			}
			for (int k = i + i; k < arr.length; k += i) {
				arr[k] = 0;
			}
		}

		int count = 0;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) {
				long temp = arr[i];
				while ((double)arr[i] <= (double)B / (double)temp) {
					if ((double)arr[i] >= (double)A / (double)temp) {
						count++;
					}
					temp *= arr[i];
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end