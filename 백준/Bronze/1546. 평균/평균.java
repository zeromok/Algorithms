import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long N = Integer.parseInt(st.nextToken()); // 과목 수 입력 받기
		long[] numArr = new long[(int)N]; // 길이가 N인 배열 선언
		long M = 0;
		long total = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}

		for (long l : numArr) {
			if (M < l)
				M = l;
			total += l;
		}

		bw.write(total * 100.0 / M / N + "\n");
		bw.flush();
		bw.close();
	}
} // end