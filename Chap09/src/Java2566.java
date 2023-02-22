import java.util.Scanner;

public class Java2566 {
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