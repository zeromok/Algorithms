import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[] members = new String[N];
		for (int i = 0; i < N; i++) {
			members[i] = br.readLine();
		}

		mergeSort(members, 0, members.length - 1);

		for (String member : members) {
			bw.write(member+ "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static void mergeSort(String[] members, int left, int right) {
		// 종료 조건
		if (left < right) {
			// 분할
			int mid = (left + right) / 2;

			// 재귀 호출
			mergeSort(members, left, mid);
			mergeSort(members, mid + 1, right);

			// 병합
			merge(members, left, mid, right);
		}
	}

	private static void merge(String[] members, int left, int mid, int right) {
		// 임시 배열 생성
		int n1 = mid - left + 1;
		int n2 = right - mid;
		String[] L = new String[n1];
		String[] R = new String[n2];

		// 데이터 복사
		for (int i = 0; i < n1; i++) {
			L[i] = members[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = members[mid + 1 + i];
		}

		// 병합
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			int l1 = Integer.parseInt(L[i].split(" ")[0]);
			int r1 = Integer.parseInt(R[j].split(" ")[0]);
			if (l1 <= r1) {
				members[k] = L[i];
				i++;
			} else {
				members[k] = R[j];
				j++;
			}
			k++;
		}

		// 남은 원소 복사
		while (i < n1) {
			members[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			members[k] = R[j];
			j++;
			k++;
		}
	}
}