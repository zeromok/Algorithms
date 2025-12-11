import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] data;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int S = 0;
			int M = Integer.parseInt(br.readLine());

			for (int i = 0; i < M; i++) {
				String[] input = br.readLine().split(" ");
				String cmd = input[0];

				switch (cmd) {
					case "add":
						int add = Integer.parseInt(input[1]) - 1;
						S |= (1 << add);
						break;
					case "remove":
						int remove = Integer.parseInt(input[1]) - 1;
						S &= ~(1 << remove);
						break;
					case "check":
						int check = Integer.parseInt(input[1]) - 1;
						bw.append(String.valueOf((S & (1 << check)) != 0 ? 1 : 0)).append("\n");
						break;
					case "toggle":
						int toggle = Integer.parseInt(input[1]) - 1;
						S ^= (1 << toggle);
						break;
					case "all":
						S = (1 << 20) - 1;
						break;
					case "empty":
						S = 0;
						break;
				}
			}

			bw.flush();
		}
	}
}