package 알고리즘이론.union_find;

public class Union_Find_Main {

	private static final int N = 100;
	// Find 연산을 10만 번 반복하여 V01/V02의 O(N*M) 복잡도를 증가시킵니다.
	private static final int FIND_REPETITIONS = 100_000;

	public static void main(String[] args) {
		System.out.println("--- Union-Find 성능 비교 (N = " + N + " | Find 반복: " + FIND_REPETITIONS + ") ---");
		performanceTest("V01", new Union_Find_V01(N));
		performanceTest("V02", new Union_Find_V02(N));
		performanceTest("V03", new Union_Find_V03(N));

	}

	private static void performanceTest(String version, Object ufInstance) {
		final int WARMUP = 5;
		final int TRIALS = 5;

		// 1) 사슬 구축: 0 -> 1 -> 2 -> ... -> N-1 (루트는 N-1, 최심부는 0)
		if (ufInstance instanceof Union_Find_V01) {
			for (int i = 1; i < N; i++) {
				((Union_Find_V01)ufInstance).union(i, i - 1);
			}
		} else if (ufInstance instanceof Union_Find_V02) {
			for (int i = 1; i < N; i++) {
				((Union_Find_V02)ufInstance).union(i, i - 1);
			}
		} else {
			for (int i = 1; i < N; i++) {
				((Union_Find_V03)ufInstance).union(i, i - 1);
			}
		}

		// 2) 최악 케이스 단발(첫 호출) 측정: find(0)
		long t0 = System.nanoTime();
		int first = (ufInstance instanceof Union_Find_V01) ? ((Union_Find_V01)ufInstance).find(0)
			: (ufInstance instanceof Union_Find_V02) ? ((Union_Find_V02)ufInstance).find(0)
			: ((Union_Find_V03)ufInstance).find(0);
		long firstCost = System.nanoTime() - t0;

		// 3) 평탄화 이후 반복 측정: 동일 find(0) 반복
		for (int w = 0; w < WARMUP; w++) {
			if (ufInstance instanceof Union_Find_V01)
				((Union_Find_V01)ufInstance).find(0);
			else if (ufInstance instanceof Union_Find_V02)
				((Union_Find_V02)ufInstance).find(0);
			else
				((Union_Find_V03)ufInstance).find(0);
		}

		long best = Long.MAX_VALUE, sum = 0;
		int guard = first;
		for (int t = 0; t < TRIALS; t++) {
			long start = System.nanoTime();
			for (int i = 0; i < FIND_REPETITIONS; i++) {
				guard ^= (ufInstance instanceof Union_Find_V01) ? ((Union_Find_V01)ufInstance).find(0)
					: (ufInstance instanceof Union_Find_V02) ? ((Union_Find_V02)ufInstance).find(0)
					: ((Union_Find_V03)ufInstance).find(0);
			}
			long dur = System.nanoTime() - start;
			best = Math.min(best, dur);
			sum += dur;
		}

		System.out.printf("[%s]\n", version);
		System.out.println("  첫 호출(ns): " + firstCost + " | 루트: " + first);
		System.out.println("  반복 측정 평균(ns): " + (sum / TRIALS) + " | 최선(ns): " + best);
		System.out.println("  XOR 가드: " + guard + "\n");
	}
}
