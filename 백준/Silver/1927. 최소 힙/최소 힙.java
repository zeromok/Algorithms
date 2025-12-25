import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			PriorityQueue<Integer> minHeap = new PriorityQueue<>();

			int N = Integer.parseInt(br.readLine());
			while (N-- > 0) {
				int X = Integer.parseInt(br.readLine());
				if (X > 0) {
					minHeap.add(X);
					continue;
				}
				int result = minHeap.isEmpty() ? 0 : minHeap.poll();
				bw.write(result + "\n");
			}

			bw.flush();
		}
	}
}