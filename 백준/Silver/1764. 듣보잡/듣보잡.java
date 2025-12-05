import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> heard = new HashSet<>();
		for (int i = 0; i < N; i++) {
			heard.add(br.readLine());
		}

		Set<String> seen = new HashSet<>();
		for (int i = 0; i < M; i++) {
			seen.add(br.readLine());
		}
		heard.retainAll(seen);

		List<String> resultList = new ArrayList<>(heard);
		Collections.sort(resultList);

		bw.write(resultList.size() + "\n");
		for (String s : resultList) {
			bw.write(s + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}