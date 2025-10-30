import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> stack = new ArrayDeque<>(n);

		for (int i = 0; i < n; i++) {
			processCommand(br.readLine(), stack, sb);
		}

		System.out.print(sb);
	}

	private static void processCommand(String command, Deque<Integer> stack, StringBuilder sb) {
		char cmd = command.charAt(0);

		switch (cmd) {
			case 'p':
				if (command.charAt(1) == 'u') {
					int num = 0;
					for (int i = 5; i < command.length(); i++) {
						num = num * 10 + (command.charAt(i) - '0');
					}
					stack.push(num);
				} else {
					sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
				}
				break;
			case 's':
				sb.append(stack.size()).append('\n');
				break;
			case 'e':
				sb.append(stack.isEmpty() ? 1 : 0).append('\n');
				break;
			case 't':
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
				break;
		}
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end