import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] inputArr = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(st2.nextToken());
		}
		int[] sortedArr = Arrays.stream(inputArr).sorted().toArray();

		int resultSum = 0;
		for (int i = 0; i < sortedArr.length - 2; i++) {
			for (int j = i + 1; j < sortedArr.length - 1; j++) {
				for (int k = j + 1; k < sortedArr.length; k++) {
					int sum = sortedArr[i] + sortedArr[j] + sortedArr[k];
					if (sum > resultSum && sum <= M) {
						resultSum = sum;
					}
				}
			}
		}

		bw.write(resultSum + "");

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}