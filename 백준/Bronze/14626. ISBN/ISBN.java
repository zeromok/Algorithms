import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ISBN = br.readLine();
		int totalSum = 0;
		int defacedCharIdx = 0;
		for (int i = 0; i < ISBN.length(); i++) {
			char ch = ISBN.charAt(i);
			if (ch != '*') {
				totalSum += i % 2 == 0 ? ch - '0' : (ch - '0') * 3;
			} else {
				defacedCharIdx = i;
			}
		}

		int defacedNum = 0;
		while (true) {
			if (defacedCharIdx % 2 == 0) {
				if ((totalSum + defacedNum) % 10 == 0) {
					bw.write(defacedNum + "");
					break;
				}
			} else {
				if ((totalSum + defacedNum * 3) % 10 == 0) {
					bw.write(defacedNum + "");
					break;
				}
			}
			defacedNum++;
		}

		br.close();
		bw.flush();
		bw.close();
	}
}