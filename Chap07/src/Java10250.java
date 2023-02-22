import java.util.Scanner;

public class Java10250 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int H = in.nextInt();
			int W = in.nextInt();
			int N = in.nextInt();
			int room = 0;
			if(N%H==0) room = (H*100) + (N/H);
			else room = (N%H)*100 + (N/H+1);
			System.out.println(room);
		}
		in.close();
	}
}