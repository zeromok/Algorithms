import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());

			while (T-- > 0) {
				String p = br.readLine();
				int n = Integer.parseInt(br.readLine());
				Deque<Integer> deque = parseArrToDeque(n, br.readLine());

				bw.write(solve(p, deque));
			}
			bw.flush();
		}
	}

	private static String solve(String p, Deque<Integer> deque) {
		boolean isReversed = false;

		for (char cmd : p.toCharArray()) {
			if (cmd == 'R') {
				isReversed = !isReversed;
			} else {
				if (deque.isEmpty()) {
					return "error\n";
				}
				if (isReversed) {
					deque.pollLast();
				} else {
					deque.pollFirst();
				}
			}
		}

		return makeOutputString(deque, isReversed);
	}

	private static String makeOutputString(Deque<Integer> deque, boolean isReversed) {

		StringBuilder sb = new StringBuilder("[");
		while (!deque.isEmpty()) {
			// 뒤집힌 상태면 뒤에서부터, 아니면 앞에서부터 하나씩 꺼내어 붙임
			sb.append(isReversed ? deque.pollLast() : deque.pollFirst());
			if (!deque.isEmpty()) {
				sb.append(",");
			}
		}
		sb.append("]\n");

		return sb.toString();
	}

	private static Deque<Integer> parseArrToDeque(int n, String arrStr) {
		Deque<Integer> deque = new ArrayDeque<>();
		if (n > 0) {
			String numbers = arrStr.substring(1, arrStr.length() - 1);
			StringTokenizer st = new StringTokenizer(numbers, ",");
			while (st.hasMoreTokens()) {
				deque.addLast(Integer.parseInt(st.nextToken()));
			}
		}
		return deque;
	}
}