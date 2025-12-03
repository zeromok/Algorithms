import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
  
public class Main {  
    public static void main(String[] args) throws Exception {  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
       int result = 0;  
       int N = Integer.parseInt(br.readLine());  
       for (int M = N - 54; M < N; M++) {  
          if (M + sumOfDigit(M) == N) {  
             result = M;  
             break;  
          }  
       }  
       bw.write(result + "");  
  
       br.close();  
       bw.flush();  
       bw.close();  
    }  
  
    private static int sumOfDigit(int number) {  
       int temp = number;  
       int sum = 0;  
       while (temp > 0) {  
          sum += temp % 10;  
          temp /= 10;  
       }  
       return sum;  
    }  
}