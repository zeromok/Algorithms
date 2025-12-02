import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] sizes = new int[6];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < sizes.length; i++) {
			sizes[i] = Integer.parseInt(st1.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st2.nextToken());
		int P = Integer.parseInt(st2.nextToken());

		int totalTShirtBundles = calTShirtBundles(sizes, T);
		int penBundleCount = N / P;
		int penIndividualCount = N % P;

		bw.write(totalTShirtBundles + "\n");
		bw.write(penBundleCount + " " + penIndividualCount);

		br.close();
		bw.flush();
		bw.close();
	}

	private static int calTShirtBundles(int[] sizes, int bundleSize) {
		int total = 0;
		for (int size : sizes) {
			total += (size + bundleSize - 1) / bundleSize;
		}
		return total;
	}
}