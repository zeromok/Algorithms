import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());

			if (a == 0)
				break;

			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			bw.write(isRightTriangle(a, b, c) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static String isRightTriangle(int a, int b, int c) {
		int[] sides = {a, b, c};
		Arrays.sort(sides);

		long side1Sq = (long)sides[0] * sides[0];
		long side2Sq = (long)sides[1] * sides[1];
		long hypotenuseSquared = (long)sides[2] * sides[2];

		return (side1Sq + side2Sq == hypotenuseSquared) ? "right" : "wrong";
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}