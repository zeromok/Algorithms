import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		int N = Integer.parseInt( br.readLine() );
		Queue<Integer> queue = new PriorityQueue<>((first, second) -> {
			int firstAbs = Math.abs( first );
			int secondAbs = Math.abs( second );
			if ( firstAbs == secondAbs ) {
				return first > second ? 1 : -1;
			}
			return firstAbs - secondAbs;
		});

		for ( int i = 0; i < N; i++ ) {
			int calculationNum = Integer.parseInt( br.readLine() );
			if ( calculationNum == 0 ) {
				if ( queue.isEmpty() ) {
					bw.write( "0\n" );
				} else {
					bw.write( queue.poll() + "\n" );
				}
			}else {
				queue.add( calculationNum );
			}
		}

		bw.flush();
		bw.close();
	}

} // end