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

		int N = Integer.parseInt(br.readLine());
		int[][] A = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			A[i][0] = start;
			A[i][1] = end;
		}

		Arrays.sort(A, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});

		int result = 0;
		int endTime = -1;
		for (int i = 0; i < N; i++) {
			if (A[i][0] >= endTime) { // 다음 회의 시작 시간 >= 이전 회의 종료 시간
				result++;
				endTime = A[i][1];
			}
		}

		bw.write(result + "\n");

		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

}