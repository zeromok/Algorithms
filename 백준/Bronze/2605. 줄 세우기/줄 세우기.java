import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] picks = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        
        List<Integer> line = new ArrayList<>();
        line.add(1);
        
        for (int i = 1; i < n; i++) {
            line.add(line.size() - picks[i], i + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int student : line) {
            sb.append(student).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}