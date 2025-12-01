import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int opinionNum = Integer.parseInt(br.readLine());
		int cutting = (int)Math.round(opinionNum * 0.15);

		double avg = 0;
		if (opinionNum > 0) {
			int[] levels = new int[opinionNum];
			for (int i = 0; i < levels.length; i++) {
				levels[i] = Integer.parseInt(br.readLine());
			}

			Arrays.sort(levels);

			for (int i = 0; i < cutting; i++) {
				levels[i] = 0;
			}
			for (int i = levels.length - 1; i >= levels.length - cutting; i--) {
				levels[i] = 0;
			}

			int sum = 0;
			for (int i = cutting; i < levels.length - cutting; i++) {
				sum += levels[i];
			}
			avg = (double)sum / (opinionNum - cutting * 2);
		}

		bw.write(Math.round(avg) + "");

		br.close();
		bw.flush();
		bw.close();
	}
}