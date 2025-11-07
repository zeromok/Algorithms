import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int i;
		for (i = 1; i <= N; i++) {
			for (int j = 0; j < N; j++) {
				if (j < N - i) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}