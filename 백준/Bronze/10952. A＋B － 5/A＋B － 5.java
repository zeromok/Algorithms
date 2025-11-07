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

		String input = "";
		while ((input = br.readLine()) != null && !input.isEmpty()) {
			StringTokenizer st = new StringTokenizer(input);
			String A = st.nextToken();
			String B = st.nextToken();
			if (A.equals("0") && B.equals("0")) {
				break;
			}
			int parsedA = Integer.parseInt(A);
			int parsedB = Integer.parseInt(B);
			bw.write(parsedA + parsedB + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}