import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			Deque<Doc> deque = new ArrayDeque<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());

			Doc target = null;
			for (int j = 0; j < N; j++) {
				String curr = st.nextToken();
				if (j == M) {
					target = new Doc(Integer.parseInt(curr), j);
				}
				deque.offer(new Doc(Integer.parseInt(curr), j));
			}

			int count = 0;
			while (!deque.isEmpty()) {
				Doc currDoc = deque.poll();
				if (queueCheck(deque, currDoc)) {
					deque.offer(currDoc);
				} else {
					count++;
					if (currDoc.originIdx == target.originIdx) {
						break;
					}
				}
			}
			bw.write(count + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static boolean queueCheck(Deque<Doc> deque, Doc doc) {
		for (Doc d : deque) {
			if (d.priority > doc.priority)
				return true;
		}
		return false;
	}

	static class Doc {
		int priority;
		int originIdx;

		public Doc(int priority, int originIdx) {
			this.priority = priority;
			this.originIdx = originIdx;
		}
	}

}