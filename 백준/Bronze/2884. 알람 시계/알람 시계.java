import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Main {


	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String HH = st.nextToken();
		String MM = st.nextToken();
		LocalTime targetTime = LocalTime.of(Integer.parseInt(HH), Integer.parseInt(MM)).minusMinutes(45);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m");
		String formatTime = formatter.format(targetTime);
		bw.write(formatTime + "\n");

		br.close();bw.flush();bw.close();
	}


	public static void main(String[] args) throws Exception {
		solution();
	}
}