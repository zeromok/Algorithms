import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int gcd = euclidean(a, b);
		int lcm = a * b / gcd;

		bw.write(gcd + "\n" + lcm);

		br.close();
		bw.flush();
		bw.close();
	}

	private static int euclidean(int a, int b) {
		if (b == 0) {
			return a;
		}
		return euclidean(b, a % b);
	}
}