import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
        
        int N = Integer.parseInt( br.readLine() );
		int[] A = new int[N];
		for ( int i = 0; i < N; i++ ) {
			A[i] = Integer.parseInt( br.readLine() );
		}
        
        mergeSort(A, 0, N - 1);
        
        for(int i=0; i<N; i++) {
            bw.write(A[i] + "\n");
        }
        
        bw.flush();
		bw.close();
    }
    
    private static void mergeSort(int[] A, int startIdx, int endIdx) {
        if(startIdx == endIdx) {
            return;
        }
        
        int midIdx = (startIdx + endIdx) / 2;
        
        mergeSort(A, startIdx, midIdx);
		mergeSort(A, midIdx + 1, endIdx);
        
        merge(A, startIdx, midIdx, endIdx);
    }
    
   private static void merge(int[] A, int start, int mid, int end) {
       int[] temp = new int[end - start + 1];
		int i = 0, leftStartIdx = start, rightStartIdx = mid+1;

		while ( leftStartIdx <= mid && rightStartIdx <= end ) {
			if ( A[leftStartIdx] < A[rightStartIdx] ) {
				temp[i++] = A[leftStartIdx++];
			} else {
				temp[i++] = A[rightStartIdx++];
			}
		}

		while ( leftStartIdx <= mid ) {
			temp[i++] = A[leftStartIdx++];
		}
		while ( rightStartIdx <= end ) {
			temp[i++] = A[rightStartIdx++];
		}

		for ( int j = 0; j <= end - start; j++ ) {
			A[start + j] = temp[j];
		}
   }
} // endClass