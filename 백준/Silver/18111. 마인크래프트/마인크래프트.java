import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final int MAX_HEIGHT = 256;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int inventory = Integer.parseInt(st.nextToken());

			int[][] grid = new int[N][M];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					grid[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int minTime = Integer.MAX_VALUE;
			int maxHeight = 0;
			for (int targetHeight = 0; targetHeight <= MAX_HEIGHT; targetHeight++) {
				BlockCount blockCount = calculateBlockCount(grid, N, M, targetHeight);

				if (!canBuild(inventory, blockCount)) {
					continue;
				}

				int time = blockCount.calculateTime();
				if (time < minTime || (time == minTime && targetHeight > maxHeight)) {
					minTime = time;
					maxHeight = targetHeight;
				}
			}

			bw.write(minTime + " " + maxHeight);
			bw.flush();
		}
	}

	private static BlockCount calculateBlockCount(int[][] grid, int N, int M, int targetHeight) {
		int needBlock = 0;
		int removeBlock = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int diff = grid[i][j] - targetHeight;
				if (diff > 0) {
					removeBlock += diff;
				} else if (diff < 0) {
					needBlock += -diff;
				}
			}
		}

		return new BlockCount(needBlock, removeBlock);
	}

	private static boolean canBuild(int inventory, BlockCount blockCount) {
		return inventory + blockCount.removeBlock >= blockCount.needBlock;
	}

	private static class BlockCount {
		final int needBlock;
		final int removeBlock;

		BlockCount(int needBlock, int removeBlock) {
			this.needBlock = needBlock;
			this.removeBlock = removeBlock;
		}

		int calculateTime() {
			return removeBlock * 2 + needBlock;
		}
	}
}