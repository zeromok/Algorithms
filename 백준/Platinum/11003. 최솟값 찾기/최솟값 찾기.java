import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		StringTokenizer st = new StringTokenizer( br.readLine() );
		int N = Integer.parseInt( st.nextToken() );
		int L =Integer.parseInt( st.nextToken() );

		Deque< Node > deque = new LinkedList<>();

		st = new StringTokenizer( br.readLine() );
		for ( int i = 0; i < N; i++ ) {
			int now = Integer.parseInt( st.nextToken() );

			while ( ! deque.isEmpty() && deque.getLast().value > now ) {
				deque.removeLast();
			}
			deque.addLast( new Node( i, now ) );

			if ( deque.getFirst().index <= i - L ) {
				deque.removeFirst();
			}

			bw.write( deque.getFirst().value + " " );
		}

		bw.flush();
		bw.close();
	}

	static class Node {
		public int index;
		public int value;

		Node(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}

} // end