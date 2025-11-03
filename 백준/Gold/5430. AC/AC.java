import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String result = processTestCase(br);
			sb.append(result).append('\n');
		}

		System.out.print(sb);
		br.close();
	}

	private static String processTestCase(BufferedReader br) throws IOException {
		String p = br.readLine();
		int n = Integer.parseInt(br.readLine());
		String arrStr = br.readLine();

		Deque<Integer> deque = parseArrayToDeque(n, arrStr);

		boolean isReversed = false;
		boolean isError = false;

		for (char cmd : p.toCharArray()) {
			if (cmd == 'R') {
				isReversed = !isReversed;
			} else if (cmd == 'D') {
				if (deque.isEmpty()) {
					isError = true;
					break;
				}
				executeDiscard(deque, isReversed);
			}
		}

		if (isError) {
			return "error";
		} else {
			return formatResult(deque, isReversed);
		}
	}

	private static void executeDiscard(Deque<Integer> deque, boolean isReversed) {
		if (isReversed) {
			deque.pollLast();
		} else {
			deque.pollFirst();
		}
	}

	private static Deque<Integer> parseArrayToDeque(int n, String arrStr) {
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

	private static String formatResult(Deque<Integer> deque, boolean isReversed) {
		StringBuilder result = new StringBuilder("[");

		if (!deque.isEmpty()) {
			Iterator<Integer> it;
			// Reverse 상태에 따라 반복자 선택
			if (isReversed) {
				it = deque.descendingIterator();
			} else {
				it = deque.iterator();
			}

			while (it.hasNext()) {
				result.append(it.next());
				if (it.hasNext()) {
					result.append(',');
				}
			}
		}

		result.append(']');
		return result.toString();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}