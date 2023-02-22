import java.util.Scanner;

public class Java4948 {
	public static void setPrime(boolean[] prime) {
		prime[0] = true;
		prime[1] = true;
		for(int i=2; i<Math.sqrt(prime.length); ++i)
			for(int j=i*i; j<prime.length; j+=i)
				prime[j] = true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			if(n==0) break;
			boolean[] prime = new boolean[(2*n)+1];
			setPrime(prime);
			int count = 0;
			for(int i=n+1; i<=2*n; ++i) {
				if(!prime[i]) ++count;
			}
			System.out.println(count);
		}
		in.close();
	}
}