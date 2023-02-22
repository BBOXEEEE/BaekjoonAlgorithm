import java.util.Scanner;

public class Java1929 {
	public static void setPrime(boolean[] prime) {
		prime[0] = true;
		prime[1] = true;
		for(int i=2; i<Math.sqrt(prime.length); ++i)
			for(int j=i*i; j<prime.length; j+=i)
				prime[j] = true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		boolean[] prime = new boolean[N+1];
		setPrime(prime);
		for(int i=M; i<=N; ++i)
			if(!prime[i]) System.out.println(i);
		in.close();
	}
}