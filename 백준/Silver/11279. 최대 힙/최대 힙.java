import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	static final int POP_CMD = 0;
	static final int EMPTY_HEAP_VALUE = 0;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

			while (T-- > 0) {
				int input = Integer.parseInt(br.readLine());
				if (input == POP_CMD) {
					bw.write(getMaxValue(maxHeap) + "\n");
				} else {
					maxHeap.offer(input);
				}
			}

			bw.flush();
		}
	}

	private static int getMaxValue(PriorityQueue<Integer> queue) {
		return queue.isEmpty() ? EMPTY_HEAP_VALUE : queue.poll();
	}
}