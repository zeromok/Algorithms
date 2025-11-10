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

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st2.nextToken());
		int P = Integer.parseInt(st2.nextToken());

		int tShirtBundles = 0;
		for (int i = 0; i < 6; i++) {
			int orderNum = Integer.parseInt(st.nextToken());
			if (orderNum > 0) {
				tShirtBundles += (orderNum + T - 1) / T;
			}
		}

		int penBundles = N / P;
		int penPieces = N % P;

		bw.write(tShirtBundles + "\n");
		bw.write(penBundles + " " + penPieces);

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}