import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int stickNum = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < stickNum; i++) {
			int heigh = Integer.parseInt(br.readLine());

			while (!stack.empty() && stack.peek() <= heigh) {
				stack.pop();
			}

			stack.push(heigh);
		}

		bw.write(stack.size() + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end