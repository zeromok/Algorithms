import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = br.readLine();
			if (input.equals(".")) break;

			Deque<Character> deque = new ArrayDeque<>();
			boolean balance = true;

			for (int i = 0; i < input.length(); i++) {
				char charAt = input.charAt(i);
				if (charAt == '(' || charAt == '[') {
					deque.push(charAt);
				} else if (charAt == ')') {
					if (deque.isEmpty() || deque.pop() != '(') {
						balance = false;
						break;
					}
				} else if (charAt == ']') {
					if (deque.isEmpty() || deque.pop() != '[') {
						balance = false;
						break;
					}
				}
			}

			if (balance && deque.isEmpty()) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}