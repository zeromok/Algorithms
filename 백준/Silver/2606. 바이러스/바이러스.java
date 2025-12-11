import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;
    
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            
            int n = Integer.parseInt(br.readLine());
			int m = Integer.parseInt(br.readLine());

			graph = new ArrayList[n + 1];
			visited = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				graph[i] = new ArrayList<>();
			}

			for (int i = 0; i < m; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				graph[a].add(b);
				graph[b].add(a);
			}

			dfs(1);

			bw.write(count - 1 + "");
			bw.flush();
        }
    }
    
    private static void dfs(int node) {
        visited[node] = true;
        count++;
        
        for (Integer next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}