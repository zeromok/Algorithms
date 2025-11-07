import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < 9; i++) {
			int number = Integer.parseInt(br.readLine());
			if (max < number) {
				max = number;
				maxIdx = i + 1;
			}
		}

		bw.write(max + "\n");
		bw.write(maxIdx + "\n");
		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}