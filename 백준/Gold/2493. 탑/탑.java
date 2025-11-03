import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {


	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] answer = new int[N];
		
		Deque<int[]> stack = new ArrayDeque<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int currentHeight = Integer.parseInt(st.nextToken());
			int currentIndex = i + 1;


			while (!stack.isEmpty() && stack.peek()[1] <= currentHeight) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				answer[i] = 0;
			} else {
				answer[i] = stack.peek()[0];
			}

			stack.push(new int[]{currentIndex, currentHeight});
		}

		// 4. 최종 출력 (StringBuilder 사용으로 출력 속도 개선)
		StringBuilder sb = new StringBuilder();
		for (int result : answer) {
			sb.append(result).append(" ");
		}
		System.out.println(sb.toString().trim());
	}


	public static void main(String[] args) throws Exception {
		solution();
	}
}