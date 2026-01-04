import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());
			int[] inputs = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				inputs[i] = Integer.parseInt(st.nextToken());
			}

			int[] sorted = Arrays.stream(inputs).distinct().sorted().toArray();

			Map<Integer, Integer> mapping = new HashMap<>();
			for (int i = 0; i < sorted.length; i++) {
				mapping.put(sorted[i], i);
			}

			for (int input : inputs) {
				bw.write(mapping.get(input) + " ");
			}

			bw.flush();
		}
	}
}