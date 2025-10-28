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

		int stickNum = Integer.parseInt(st.nextToken());
		int[] sticks = new int[stickNum];

		for (int i = 0; i < stickNum; i++) {
			sticks[i] = Integer.parseInt(br.readLine());
		}

		int result = 0;
		int maxHeight = 0;

		for (int i = stickNum - 1; i >= 0; i--) {
			if (sticks[i] > maxHeight) {
				result++;
				maxHeight = sticks[i];
			}
		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end