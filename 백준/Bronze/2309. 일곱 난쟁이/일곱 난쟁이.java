import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	private static final int DWARF_COUNT = 9;
	private static final int TARGET_SUM = 100;

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] heights = new int[DWARF_COUNT];
		int totalSum = 0;
		for (int i = 0; i < DWARF_COUNT; i++) {
			heights[i] = Integer.parseInt(br.readLine());
			totalSum += heights[i];
		}

		int fakeSum = totalSum - TARGET_SUM;
		findAndMarkFakes(heights, fakeSum);

		Arrays.sort(heights);
		for (int i = 2; i < DWARF_COUNT; i++) {
			bw.write(heights[i] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static void findAndMarkFakes(int[] heights, int fakeSum) {
		for (int i = 0; i < DWARF_COUNT - 1; i++) {
			for (int j = i + 1; j < DWARF_COUNT; j++) {
				if (heights[i] + heights[j] == fakeSum) {
					heights[i] = 0;
					heights[j] = 0;
					return;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}