import java.util.Scanner;

public class Java25501 {
	public static int recursion(String s, int l, int r){
		++count;
		if(l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static int isPalindrome(String s){
		return recursion(s, 0, s.length()-1);
	}
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		StringBuilder ret = new StringBuilder();
		for(int t=0; t<T; ++t) {
			String S = in.next();
			count = 0;
			ret.append(isPalindrome(S)).append(' ').append(count);
			ret.append('\n');
		}
		System.out.println(ret);
		in.close();
	}
}