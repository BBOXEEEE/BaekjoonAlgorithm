import java.util.Scanner;

public class Java2563 {
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