import java.util.Scanner;

public class Java9020 {
	public static void setPrime(boolean[] prime) {
		prime[0] = true;
		prime[1] = true;
		for(int i=2; i<Math.sqrt(prime.length); ++i)
			for(int j=i*i; j<prime.length; j+=i)
				prime[j] = true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		boolean[] prime = new boolean[10001];
		setPrime(prime);
		
		StringBuilder result = new StringBuilder();
		for(int t=0; t<T; ++t) {
			int n = in.nextInt();
			int first = n/2;
			int second = first;
			while(true) {
				if(!prime[first] && !prime[second]) {
					result.append(first + " " + second).append('\n');
					break;
				}
				--first;
				++second;
			}
		}
		System.out.println(result);
		in.close();
	}
}