import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int L = Integer.parseInt(br.readLine());
		String input = br.readLine();

		char[] inputArr = input.toCharArray();
		int[] numArr = new int[L];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = inputArr[i] - 96;
		}

		long result = 0;
		for (int i = 0; i < numArr.length; i++) {
			result += (long)(numArr[i] * Math.pow(31, i));
		}
		bw.write(result + "");

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}