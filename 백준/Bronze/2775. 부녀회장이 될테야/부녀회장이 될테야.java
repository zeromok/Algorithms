import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static final int MAX_FLOOR = 14;
	private static final int MAX_ROOM = 14;
	private static final int[][] APT = new int[MAX_FLOOR + 1][MAX_ROOM + 1];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 1; i < APT.length; i++) {
			APT[0][i] = i;
			APT[i][1] = 1;
		}

		for (int floor = 1; floor <= MAX_FLOOR; floor++) {
			for (int room = 2; room <= MAX_ROOM; room++) {
				APT[floor][room] = APT[floor][room - 1] + APT[floor - 1][room];
			}
		}


		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());

			bw.write(APT[floor][room] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}