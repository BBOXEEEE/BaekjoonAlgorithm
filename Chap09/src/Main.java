import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[][] paper = new int[100][100];
		for(int t=0; t<T; ++t) {
			int X = in.nextInt();
			int Y = in.nextInt();
			for(int i=X; i<X+10; ++i)
				for(int j=Y; j<Y+10; ++j)
					paper[i][j] = 1;
		}
		int cnt = 0;
		for(int[] row: paper)
			for(int data: row)
				if(data == 1) ++cnt;
		System.out.println(cnt);
		in.close();
	}
}

/* # 2738
import java.util.Scanner;

public class Main {
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
*/

/* # 2566
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] map = new int[9][9];
		int max = Integer.MIN_VALUE;
		int x=0, y=0;
		for(int i=0; i<9; ++i)
			for(int j=0; j<9; ++j) {
				map[i][j] = in.nextInt();
				if(map[i][j] >= max) {
					max=map[i][j];
					x=i+1; y=j+1;
				}
			}
		System.out.println(max);
		System.out.println(x + " " + y);
		in.close();
	}
}
*/

/* # 2563
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[][] paper = new int[100][100];
		for(int t=0; t<T; ++t) {
			int X = in.nextInt();
			int Y = in.nextInt();
			for(int i=X; i<X+10; ++i)
				for(int j=Y; j<Y+10; ++j)
					paper[i][j] = 1;
		}
		int cnt = 0;
		for(int[] row: paper)
			for(int data: row)
				if(data == 1) ++cnt;
		System.out.println(cnt);
		in.close();
	}
}
*/