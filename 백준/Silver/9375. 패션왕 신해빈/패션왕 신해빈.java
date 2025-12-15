import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				int typeNum = Integer.parseInt(br.readLine());
				int result = 1;
				Map<String, Integer> clothing = new HashMap<>();
				for (int j = 0; j < typeNum; j++) {
					String[] testCase = br.readLine().split(" ");
					clothing.put(testCase[1], clothing.getOrDefault(testCase[1], 0) + 1);
				}
				for (String s : clothing.keySet()) {
					result *= clothing.get(s) + 1;
				}
				bw.write(result - 1 + "\n");
			}
			bw.flush();
		}
	}
}