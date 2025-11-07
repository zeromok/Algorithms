import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine();
		int i = Integer.parseInt(br.readLine());

		char c = S.charAt(i - 1);

		bw.write(c);
		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}