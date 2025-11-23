import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int nextNum = 0;

		String one = br.readLine();
		if (isNum(one)) {
			nextNum = Integer.parseInt(one) + 3;
		}

		String two = br.readLine();
		if (isNum(two)) {
			nextNum = Integer.parseInt(two) + 2;
		}

		String three = br.readLine();
		if (isNum(three)) {
			nextNum = Integer.parseInt(three) + 1;
		}

		if (nextNum % 3 == 0 && nextNum % 5 == 0) {
			bw.write("FizzBuzz");
		} else if (nextNum % 3 == 0) {
			bw.write("Fizz");
		} else if (nextNum % 5 == 0) {
			bw.write("Buzz");
		} else {
			bw.write(nextNum + "");
		}

		br.close();
		bw.flush();
		bw.close();
	}


	private static boolean isNum(String str) {
		return str.charAt(0) != 'F' && str.charAt(0) != 'B';
	}
}