import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<Integer> set = new HashSet<>();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int output = fulfillment(st, set);
			if (output != -1) {
				bw.write(output + "\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static int fulfillment(StringTokenizer st, Set<Integer> set) {
		String command = st.nextToken();
		int result = -1;
		switch (command) {
			case "add":
				set.add(Integer.parseInt(st.nextToken()));
				break;
			case "remove":
				set.remove(Integer.parseInt(st.nextToken()));
				break;
			case "check":
				result = set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0;
				break;
			case "toggle": {
				int e = Integer.parseInt(st.nextToken());
				if (set.contains(e)) {
					set.remove(e);
				} else {
					set.add(e);
				}
			}
			break;
			case "all": {
				set.clear();
				for (int i = 1; i < 21; i++) {
					set.add(i);
				}
			}
			break;
			case "empty":
				set.clear();
				break;
		}
		return result;
	}
}