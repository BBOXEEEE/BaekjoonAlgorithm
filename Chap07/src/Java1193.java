import java.util.Scanner;

public class Java1193 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int mole = 1, deno = 1;
		int group = 0, cnt = 0;
		if(X==1) System.out.println(mole + "/" + deno);
		else {
			while(cnt<X) {
				++group;
				cnt=group*(group+1)/2;
			}
			int N = X-(group-1)*group/2;
			if(group%2==0) {
				mole = N;
				deno = group-N+1;
			}
			else {
				mole = group-N+1;
				deno = N;
			}
			System.out.println(mole + "/" + deno);
		}
		in.close();
	}
}