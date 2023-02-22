import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		BigInteger A = new BigInteger(in.next());
		BigInteger B = new BigInteger(in.next());
		System.out.println(A.add(B));
		in.close();
	}
}

/* # 1712
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	// 고정비용 
	)	int B = in.nextInt();	// 가변비용 
		int C = in.nextInt();	// 제품가격 
		if(B>=C) System.out.println(-1);
		else System.out.println(A/(C-B)+1);
		in.close();
	}
}
*/

/* # 2293
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int D = 1;
		int R = 2;
		if(N==1) System.out.println(D);
		else {
			while(R<=N) {
				R+=6*D;
				++D;
			}
			System.out.println(D);
		}
		in.close();
	}
}
*/

/* # 1193
import java.util.Scanner;

public class Main {
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
*/

/* # 2869
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int days = (V-B)/(A-B);
		if((V-B)%(A-B)!=0) ++days;
		System.out.println(days);
	}
}
*/

/* # 10250
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int H = in.nextInt();
			int W = in.nextInt();
			int N = in.nextInt();
			int room = 0;
			if(N%H==0) room = (H*100) + (N/H);
			else room = (N%H)*100 + (N/H+1);
			System.out.println(room);
		}
		in.close();
	}
}
*/

/* # 2775
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int[][] apart = new int[15][15];
		for(int i=0; i<15; ++i)
			apart[0][i] = i;
		for(int i=1; i<15; ++i)
			for(int j=1; j<15; ++j)
				apart[i][j] = apart[i][j-1] + apart[i-1][j];
		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(apart[k][n]);
		}
		in.close();
	}
}
*/

/* # 2839
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ret = 0;
		while(true) {
			if(N%5==0) {
				ret += N/5;
				break;
			}
			else if(N<0){
				ret = -1;
				break;
			}
			N-=3;
			++ret;
		}
		System.out.println(ret);
		in.close();
	}
}
*/

/* # 10757 (1)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String strA = new StringBuilder(in.next()).reverse().toString();
		String strB = new StringBuilder(in.next()).reverse().toString();
		int length = Math.max(strA.length(), strB.length());
		int[] A = new int[length+1];
		int[] B = new int[length+1];
		for(int i=0; i<strA.length(); ++i)
			A[i] = strA.charAt(i)-'0';
		for(int i=0; i<strB.length(); ++i)
			B[i] = strB.charAt(i)-'0';
		for(int i=0; i<length; ++i) {
			int value = A[i]+B[i];
			A[i] = value%10;
			A[i+1] += value/10;
		}
		if(A[length]!=0) System.out.print(A[length]);
		for(int i=length-1; i>=0; --i)
			System.out.print(A[i]);
		in.close();
	}
}
*/

/* # 10757 (2)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String A = new StringBuilder(in.next()).reverse().toString();
		String B = new StringBuilder(in.next()).reverse().toString();
		if(A.length()>B.length())
			B = B.concat("0".repeat(A.length()-B.length()));
		else
			A = A.concat("0".repeat(B.length()-A.length()));
		StringBuilder result = new StringBuilder();
		int carry = 0;
		for(int i=0; i<A.length(); ++i) {
			int value = (A.charAt(i)-'0') + (B.charAt(i)-'0') + carry;
			if(value>=10) carry=1;
			else carry=0;
			result.append(value%10);
		} if(carry == 1) result.append(1);
		System.out.println(result.reverse().toString());
		in.close();
	}
}
*/

/* # 10757 (3, BigInteger)
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		BigInteger A = new BigInteger(in.next());
		BigInteger B = new BigInteger(in.next());
		System.out.println(A.add(B));
		in.close();
	}
}
*/