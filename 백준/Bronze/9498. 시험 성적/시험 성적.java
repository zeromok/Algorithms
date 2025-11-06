import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {


	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		if (90 <= N) {
			bw.write("A\n");
		} else if (80 <= N) {
			bw.write("B\n");
		} else if (70 <= N) {
			bw.write("C\n");
		} else if (60 <= N) {
			bw.write("D\n");
		} else {
			bw.write("F\n");
		}
		br.close();bw.flush(); bw.close();
	}


	public static void main(String[] args) throws Exception {
		solution();
	}
}