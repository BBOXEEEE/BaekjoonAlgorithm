import java.util.Scanner;

public class Java25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] scores = new int[N];
		int k = in.nextInt();
		for(int i=0; i<N; ++i)
			scores[i] = in.nextInt();
		// sort
		for(int i=0; i<N-1; ++i)
			for(int j=i+1; j<N; ++j) {
				if(scores[i]>scores[j]) {
					int tmp = scores[j];
					scores[j] = scores[i];
					scores[i] = tmp;
				}
			}
		System.out.println(scores[N-k]);
		in.close();
	}
}