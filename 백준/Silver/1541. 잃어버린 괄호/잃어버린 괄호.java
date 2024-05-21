import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		String[] A = input.split("-");
		int result = sum(A[0]);

		for (int i = 1; i < A.length; i++) {
			result -= sum(A[i]);
		}

		bw.write(result + "\n");

		bw.flush();
		bw.close();
	}

	private static int sum(String data) {
		return Arrays.stream(data.split("[+]"))
			.mapToInt(Integer::parseInt)
			.sum();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

}