import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	
	// DFS 함수
	private static void DFS(int num, int digit) {
		if(digit == N) {
			if(isPrime(num))	 {
				System.out.println(num);
			}
			return;
		}
		
		for (int i = 1; i <= 9; i += 2) {
			if(isPrime(num * 10 + i)) {
				DFS(num * 10 + i, digit + 1);
			}
		}
	}
	
	// 소수 판별 함수
	private static boolean isPrime(int num) {
		if (num <= 1)  return false;  
		
		for (int i = 2; i < num; i++) {  
			if (num % i == 0)  return false;  
		}  
		
		return true;
	}
	
} // end class