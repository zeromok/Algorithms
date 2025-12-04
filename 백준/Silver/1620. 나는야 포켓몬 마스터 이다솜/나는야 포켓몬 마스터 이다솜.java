import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] nameArr = new String[N + 1];
		Map<String, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			nameArr[i] = input;
			indexMap.put(input, i);
		}

		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (Character.isDigit(input.charAt(0))) {
				bw.write(nameArr[Integer.parseInt(input) - 1] + "\n");
			} else {
				bw.write(indexMap.get(input) + 1 + "\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}