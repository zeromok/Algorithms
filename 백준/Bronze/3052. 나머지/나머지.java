import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] resultArr = new int[42];
		int result = 0;
		for (int i = 0; i < 10; i++) {
			int input = Integer.parseInt(br.readLine());
			resultArr[input % 42]++;
		}
		for (int i : resultArr) {
			if (i != 0) {
				result++;
			}
		}
		bw.write(result + "");

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}