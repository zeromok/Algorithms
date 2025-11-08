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
		int resultNum = (A + B) - C;
		bw.write(resultNum + "\n");

		String AtoStr = String.valueOf(A);
		String BtoStr = String.valueOf(B);
		int resultStr = Integer.parseInt(AtoStr + BtoStr) - C;
		bw.write(resultStr + "\n");


		br.close();bw.flush();bw.close();
	}


	public static void main(String[] args) throws Exception {
		solution();
	}
}