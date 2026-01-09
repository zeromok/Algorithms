import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			char[] S = br.readLine().toCharArray();

			int count = 0;
			int patternCnt = 0;
			for (int i = 0; i < M - 2; i++) {
				if (S[i] == 'I' && S[i + 1] == 'O' && S[i + 2] == 'I') {
					patternCnt++;

					if (patternCnt >= N) {
						count++;
					}

					i++;
				} else {
					patternCnt = 0;
				}
			}

			bw.write(count + "");

			bw.flush();
		}
	}
}