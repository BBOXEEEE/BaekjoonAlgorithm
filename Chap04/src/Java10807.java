import java.util.Scanner;

public class Java10807 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<N; ++i)
			nums[i] = in.nextInt();
		int find = in.nextInt();
		int cnt = 0;
		for(var num: nums)
			if(num == find) ++cnt;
		System.out.println(cnt);
		in.close();
	}
}

/* ver.2
import java.util.Scanner;

public class Java10807 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] numsFreq = new int[201];
		for(int i=0; i<N; ++i)
			++numsFreq[in.nextInt()+100];
		System.out.println(numsFreq[in.nextInt()+100]);
		in.close();
	}
}
*/