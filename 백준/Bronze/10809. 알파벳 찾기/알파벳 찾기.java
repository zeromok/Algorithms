import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	private static final int ALPHABET_SIZE = 26;
	private static final char LOWERCASE_A = 'a';

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] firstOccurrences = new int[ALPHABET_SIZE];
		Arrays.fill(firstOccurrences, -1);

		char[] inputChars = br.readLine().toCharArray();
		for (int position = 0; position < inputChars.length; position++) {
			int alphabetIndex = inputChars[position] - LOWERCASE_A;

			if (firstOccurrences[alphabetIndex] == -1) {
				firstOccurrences[alphabetIndex] = position;
			}
		}

		for (int firstIndex : firstOccurrences) {
			bw.write(firstIndex + " ");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}