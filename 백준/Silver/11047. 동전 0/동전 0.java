import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.util.StringTokenizer;  
  
public class Main {  
  
    public static void solution() throws IOException {  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
       StringTokenizer st = new StringTokenizer(br.readLine());  
       long N = Long.parseLong(st.nextToken());  
       long K = Long.parseLong(st.nextToken());  
  
       int idx = 0, result = 0;  
  
       long[] A = new long[(int)N];  
       for (int i = 0; i < N; i++) {  
          A[i] = Long.parseLong(br.readLine());  
       }  
  
       for (int i = (int)(N - 1); i >= 0; i--) {  
          if (K >= A[i]) {  
             result += (int)(K / A[i]);  
             K = K % A[i];  
          }  
       }  
  
       bw.write(result + "\n");  
  
       bw.flush();  
       bw.close();  
    }  
  
    public static void main(String[] args) throws IOException {  
       solution();  
    }  
  
}