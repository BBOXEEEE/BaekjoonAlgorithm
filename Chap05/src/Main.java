public class Main {
	public static int solve(int n) {
		int ret = n;
		while(n>0) {
			ret += n%10;
			n/=10;
		}
	return ret;
	}
	public static void main(String[] args) {
		final int SIZE = 10_000;
		boolean[] checkSelfNum = new boolean[SIZE];
	
		for(int i=0; i<checkSelfNum.length; ++i) {
			int retVal = solve(i+1);
			if(retVal <= SIZE)
				checkSelfNum[retVal-1] = true;
		}
		for(int i=0; i<checkSelfNum.length; ++i)
			if(!checkSelfNum[i]) System.out.println(i+1);
	}
}

/* # 15596
public class Main {
	public static long sum(int[] a) {
		long ans = 0;
		for(int num: a)
			ans+=num;
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(nums));
	}
}
*/

/* # 4673
public class Main {
	public static int solve(int n) {
		int ret = n;
		while(n>0) {
			ret += n%10;
			n/=10;
		}
	return ret;
	}
	public static void main(String[] args) {
		final int SIZE = 10_000;
		boolean[] checkSelfNum = new boolean[SIZE];
	
		for(int i=0; i<checkSelfNum.length; ++i) {
			int retVal = solve(i+1);
			if(retVal <= SIZE)
				checkSelfNum[retVal-1] = true;
		}
		for(int i=0; i<checkSelfNum.length; ++i)
			if(!checkSelfNum[i]) System.out.println(i+1);
	}
}
*/

/* # 1065 (1)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int solve(int num) {
		int cnt = 0;
		if(num<100) return num;
		else {
			cnt=99;
			for(int i=100; i<=num; ++i) {
				String[] strNum = Integer.toString(i).split("");
				if((Integer.parseInt(strNum[1])-Integer.parseInt(strNum[0])) 
						== (Integer.parseInt(strNum[2])-Integer.parseInt(strNum[1])))
					++cnt;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solve(Integer.parseInt(br.readLine())));
	}
}
*/

/* # 1065 (2)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int solve(int num) {
		int cnt = 0;
		if(num<100) return num;
		else {
			cnt=99;
			for(int i=100; i<=num; ++i) {
				int A = i/100;
				int B = (i/10)%10;
				int C = i%10;
				if((B-C) == (A-B)) ++cnt;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solve(Integer.parseInt(br.readLine())));
	}
}
*/