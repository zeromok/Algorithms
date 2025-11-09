import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {


	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		String result = (A * B * C) + "";

		int[] valueArr = new int[10];
		for (int i = 0; i < result.length(); i++) {
			char c = result.charAt(i);
			valueArr[c - '0']++;
		}

		for (int i = 0; i < valueArr.length; i++) {
			bw.write(valueArr[i] + "\n");
		}

		br.close();bw.flush();bw.close();
	}


	public static void main(String[] args) throws Exception {
		solution();
	}
}