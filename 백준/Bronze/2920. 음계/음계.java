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

		int[] numbers = new int[8];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 8; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}

		String result = checker(numbers);
		bw.write(result);

		br.close();
		bw.flush();
		bw.close();
	}

	private static String checker(int[] arr) {
		int diffNum = arr[1] - arr[0];
		for (int i = 1; i < 7; i++) {
			if (arr[i] - arr[i - 1] != diffNum) {
				return "mixed";
			}
		}
		return diffNum == 1 ? "ascending" : "descending";
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}