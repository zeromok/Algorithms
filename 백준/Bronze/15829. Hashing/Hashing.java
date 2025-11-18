import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int L = Integer.parseInt(br.readLine());
		String input = br.readLine();

		long result = 0;
		long pow = 1;
		for (int i = 0; i < L; i++) {
			result += (input.charAt(i) - 96) * pow;
			pow = (pow * 31) % 1234567891;
		}

		bw.write(result % 1234567891 + "");

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}