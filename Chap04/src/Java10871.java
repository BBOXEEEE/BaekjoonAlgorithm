import java.util.Scanner;

public class Java10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<N; ++i)
			nums[i] = in.nextInt();
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<N; ++i) {
			if(nums[i]<X)
				ret.append(nums[i]+" ");
		}
		System.out.println(ret);
		in.close();
	}
}

/* # ver.2
import java.util.Scanner;

public class Java10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<N; ++i) {
			int value = in.nextInt();
			if(value<X)
				ret.append(value+" ");
		}
		System.out.println(ret);
		in.close();
	}
}
*/