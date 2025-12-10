import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static class Member {
		int age;
		String  name;

		public Member(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
	static Member[] temp;
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());
			Member[] members = new Member[N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
			}

			temp = new Member[N];
			recursive(members, 0, N - 1);

			for (Member member : members) {
				bw.write(member.age + " " + member.name + "\n");
			}

			bw.flush();
		}
	}

	private static void recursive(Member[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			recursive(arr, left, mid);
			recursive(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	private static void merge(Member[] arr, int left, int mid, int right) {
		System.arraycopy(arr, left, temp, left, (right - left) + 1);

		int i = left, j = mid + 1, k = left;

		while (i <= mid && j <= right) {
			if (temp[i].age <= temp[j].age) {
				arr[k++] = temp[i++];
			} else {
				arr[k++] = temp[j++];
			}
		}

		while (i <= mid) {
			arr[k++] = temp[i++];
		}
	}
}