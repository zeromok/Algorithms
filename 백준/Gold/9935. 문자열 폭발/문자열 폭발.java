import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String bomb = br.readLine();

		String result = removeExplosiveString(input, bomb);
		System.out.println(result.isEmpty() ? "FRULA" : result);
	}

	private static String removeExplosiveString(String input, String bomb) {
		StringBuilder sb = new StringBuilder();
		int bombLen = bomb.length();

		for (char c : input.toCharArray()) {
			sb.append(c);

			if (canExplode(sb, bomb, bombLen)) {
				explode(sb, bombLen);
			}
		}

		return sb.toString();
	}

	private static boolean canExplode(StringBuilder sb, String bomb, int bombLen) {
		if (sb.length() < bombLen) {
			return false;
		}

		int startIdx = sb.length() - bombLen;
		for (int i = 0; i < bombLen; i++) {
			if (sb.charAt(startIdx + i) != bomb.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	private static void explode(StringBuilder sb, int bombLen) {
		sb.delete(sb.length() - bombLen, sb.length());
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}