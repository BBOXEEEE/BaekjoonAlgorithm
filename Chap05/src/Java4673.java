
public class Java4673 {
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