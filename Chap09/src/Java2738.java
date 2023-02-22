import java.util.Scanner;

public class Java2738 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		for(int i=0; i<N; ++i)
			for(int j=0; j<M; ++j)
				A[i][j] = in.nextInt();
		for(int i=0; i<N; ++i)
			for(int j=0; j<M; ++j)
				B[i][j] = in.nextInt();
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<N; ++i) {
			for(int j=0; j<M; ++j) {
				result.append((A[i][j]+B[i][j]) + " ");
			}
			result.append('\n');
		}
		System.out.println(result);
		in.close();
	}
}