import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static class Body {
		int weight;
		int height;

		public Body(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Body[] bodyList = new Body[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bodyList[i] = new Body(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		int score = 1;
		for (int i = 0; i < N; i++) {
			Body currBody = bodyList[i];
			for (int j = 0; j < N; j++) {
				if (currBody.weight < bodyList[j].weight && currBody.height < bodyList[j].height) {
					score++;
				}
			}
			if (i != N - 1) {
				bw.write(score + " ");
			} else {
				bw.write(score + "");
			}
			score = 1;
		}

		br.close();
		bw.flush();
		bw.close();
	}
}