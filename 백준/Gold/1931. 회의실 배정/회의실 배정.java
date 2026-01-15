import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class Meeting {
		int startTime;
		int endTime;

		public Meeting(int startTime, int endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}
	}

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());
			Meeting[] meetings = new Meeting[N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				meetings[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}

			Arrays.sort(meetings, (o1, o2) -> {
				if (o1.endTime == o2.endTime) {
					return o1.startTime - o2.startTime;
				}
				return o1.endTime - o2.endTime;
			});

			int maxMeetCnt = 0;
			int prevMeetEndTime = 0;
			for (Meeting meeting : meetings) {
				if (prevMeetEndTime <= meeting.startTime) {
					maxMeetCnt++;
					prevMeetEndTime = meeting.endTime;
				}
			}

			bw.write(maxMeetCnt + "");
			bw.flush();
		}
	}
}