import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());

			PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
			while (N-- > 0) {
				int cmd = Integer.parseInt(br.readLine());
				if (cmd == 0) {
					int output = queue.isEmpty() ? 0 : queue.poll();
					bw.write(output + "\n");
				} else {
					queue.add(cmd);
				}
			}
			bw.flush();
		}
	}
}