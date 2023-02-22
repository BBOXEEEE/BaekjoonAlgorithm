import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		int cmp=N;
		do {
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			++cnt;
		} while(cmp!=N);
		System.out.println(cnt);
	}
}

/* # 2739
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i=1; i<=9; ++i)
			System.out.println(N + " * " + i + " = " + N*i);
		in.close();
	}
}
*/

/* # 10950
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A+B);
		}
		in.close();
	}
}
*/

/* # 8393
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int sum=0;
		for(int i=1; i<=N; ++i)
			sum += i;
		System.out.println(sum);
		in.close();
	}
}
*/

/* # 25304
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalPrice = in.nextInt();
		int N = in.nextInt();
		for(int i=0; i<N; ++i) {
			int price = in.nextInt();
			int num = in.nextInt();
			totalPrice -= price*num;
		}
		System.out.println((totalPrice==0)? "Yes": "No");
		in.close();
	}
}
*/

/* # 15552
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t=1; t<=T; ++t) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target+1));
			sb.append(result+'\n');
		}
		System.out.println(sb);
		br.close();
	}
}
*/

/* 11021
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t=1; t<=T; ++t) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target+1));
			sb.append("Case #"+t+": "+result+'\n');
		}
		System.out.println(sb);
		br.close();
	}
}
*/

/* # 11022
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer str;
		
		for(int t=1; t<=T; ++t) {
			str = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			sb.append("Case #"+t+": ").append(A+" + "+B+" = "+(A+B)).append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}
*/

/* # 2438
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; ++i) {
			for(int j=0; j<=i; ++j)
				sb.append("*");
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
*/

/* # 2439
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int r=1; r<=N; ++r) {
			for(int i=0; i<N-r; ++i)
				sb.append(" ");
			for(int i=0; i<r; ++i)
				sb.append("*");
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
*/

/* # 10952
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			int A = str.charAt(0)-'0';
			int B = str.charAt(2)-'0';
			if(A==0 && B==0) break;
			sb.append(A+B).append('\n');
		}
		System.out.println(sb);
	}
}
*/

/* # 1110
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		int cmp=N;
		do {
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			++cnt;
		} while(cmp!=N);
		System.out.println(cnt);
	}
}
*/