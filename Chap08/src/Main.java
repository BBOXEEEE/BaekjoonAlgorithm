import java.util.Scanner;

public class Main {
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

/* # 1978
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		for(int t=0; t<N; ++t) {
			int num = in.nextInt();
			int check = 0;
			for(int i=2; i<=num; ++i) {
				if(num%i == 0) ++check;
			}
			if(check == 1) ++count;
		}
		System.out.println(count);
		in.close();
	}
}
*/

/* # 2581
import java.util.Scanner;

public class Main {
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
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=M; i<=N; ++i) {
			if(!prime[i]) {
				sum+=i;
				if(min==Integer.MAX_VALUE) min=i;
			}
		}
		if(sum==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		in.close();
	}
}
*/

/* # 11653
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		StringBuilder result = new StringBuilder();
		int factor = 2;
		while(N!=1) {
			if(N%factor == 0) {
				N/=factor;
				result.append(factor + "\n");
			}
			else ++factor;
		}
		System.out.println(result);
		in.close();
	}
}
*/

/* # 1929
import java.util.Scanner;

public class Main {
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
*/

/* # 4948
import java.util.Scanner;

public class Main {
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
*/

/* # 9020
import java.util.Scanner;

public class Main {
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
*/