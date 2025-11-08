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
		int result = 1;
		while (st.hasMoreTokens()) {
			st.nextToken();
			result++;
		}
		bw.write(result - 1 + "");


		br.close();bw.flush();bw.close();
	}


	public static void main(String[] args) throws Exception {
		solution();
	}
}