import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 5; i <= N; i *= 5) {
			count += N / i;
		}

		bw.write(count + "");

		br.close();
		bw.flush();
		bw.close();
	}
}