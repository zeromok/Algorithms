import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				int status = 0;
				String input = br.readLine();
				for (int j = 0; j < input.length(); j++) {
					char c = input.charAt(j);
					if (status < 0)
						break;
					if (c == '(') {
						status++;
					} else {
						status--;
					}
				}
				if (status == 0) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			}
			bw.flush();
		}
	}
}