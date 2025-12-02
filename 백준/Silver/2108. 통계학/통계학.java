import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] numbers = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			numbers[i] = num;
			sum += num;
		}

		int avg = (sum >= 0)
			? (sum + N / 2) / N
			: (sum - N / 2) / N;
		bw.write(avg + "\n");

		Arrays.sort(numbers);
		bw.write(numbers[numbers.length / 2] + "\n");

		Map<Integer, Integer> freqMap = new HashMap<>();
		int maxFreq = 0;
		for (int number : numbers) {
			int freq = freqMap.getOrDefault(number, 0) + 1;
			freqMap.put(number, freq);
			maxFreq = Math.max(maxFreq, freq);
		}

		List<Integer> modes = new ArrayList<>();
		for (int key : freqMap.keySet()) {
			if (freqMap.get(key) == maxFreq) {
				modes.add(key);
			}
		}
		modes.sort(Integer::compareTo);
		int mode = (modes.size() > 1) ? modes.get(1) : modes.get(0);
		bw.write(mode + "\n");

		bw.write((numbers[N - 1] - numbers[0]) + "");

		br.close();
		bw.flush();
		bw.close();
	}
}