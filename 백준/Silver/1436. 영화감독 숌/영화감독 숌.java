import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int currNum = 666;
		int count = 0;
		while (true) {
			if (targetNumCheck(currNum)) {
				count++;
				if (count == N) {
					break;
				}
			}
			currNum++;
		}
		bw.write(currNum + "");

		br.close();
		bw.flush();
		bw.close();
	}

	private static boolean targetNumCheck(int num) {
		int count = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 6) {
				count++;
				if (count >= 3) {
					return true;
				}
			} else {
				count = 0;
			}
			num /= 10;
		}
		return false;
	}
}