import java.util.Scanner;

public class Main {
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

/* # 10807 (1)
import java.util.Scanner;

public class Main {
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
*/
/* # 10807 (2)
import java.util.Scanner;

public class Main {
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

/* # 10871 (1)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<N; ++i)
			nums[i] = in.nextInt();
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<N; ++i) {
			if(nums[i]<X)
				ret.append(nums[i]+" ");
		}
		System.out.println(ret);
		in.close();
	}
}
*/
/* # 10871 (2)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<N; ++i) {
			int value = in.nextInt();
			if(value<X)
				ret.append(value+" ");
		}
		System.out.println(ret);
		in.close();
	}
}
*/

/* # 10818 (1)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<N; ++i) {
			int value = in.nextInt();
			if(value>max)
				max=value;
			if(value<min)
				min=value;
		}
		System.out.println(min + " " + max);
		in.close();
	}
}
*/
/* 10818 (2)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			if(value>max)
				max=value;
			if(value<min)
				min=value;
		}
		System.out.println(min + " " + max);
		br.close();
	}
}
*/

/* # 2562
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int ret = 0;
		for(int i=1; i<=9; ++i) {
			int value = Integer.parseInt(br.readLine());
			if(value>max) {
				max=value;
				ret=i;
			}
		}
		System.out.println(max);
		System.out.println(ret);
	}
}
*/

/* # 5597
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean[31];
		for(int i=1; i<=28; ++i)
			check[Integer.parseInt(br.readLine())] = true;
		for(int i=1; i<=30; ++i) {
			if(!check[i]) System.out.println(i);
		}
	}
}
*/

/* # 3052
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean[42];
		for(int i=0; i<10; ++i)
			check[Integer.parseInt(br.readLine())%42] = true;
		int cnt = 0;
		for(var C: check)
			if(C) ++cnt;
		System.out.println(cnt);
	}
}
*/

/* # 1546
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] scores = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = Integer.MIN_VALUE;
		double sum = 0.0;
		for(int i=0; i<scores.length; ++i) {
			scores[i] = Integer.parseInt(st.nextToken());
			if(scores[i]>max) max=scores[i];
			sum+=scores[i];
		}
		System.out.println(((sum/max)*100.0) / scores.length);
	}
}
*/

/* # 8958 (1)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] results = new String[T];
		for(int t=0; t<T; ++t)
			results[t] = br.readLine();
		StringBuilder ret = new StringBuilder();
		for(int t=0; t<T; ++t) {
			int cnt = 0;
			int sum = 0;
			for(char word: results[t].toCharArray()) {
				if(word == 'O') ++cnt;
				else cnt=0;
				sum+=cnt;
			}
			ret.append(sum).append('\n');
		}
		System.out.println(ret);
	}
}
*/
/* # 8958 (2)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder ret = new StringBuilder();
		for(int t=0; t<T; ++t) {
			int cnt = 0;
			int sum = 0;
			for(byte word: br.readLine().getBytes()) {
				if(word == 'O') ++cnt;
				else cnt=0;
				sum+=cnt;
			}
			ret.append(sum).append('\n');
		}
		System.out.println(ret);
	}
}
*/

/* # 4344
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; ++t) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int[] scores = new int[N];
			double sum = 0.0;
			for(int i=0; i<N; ++i) {
				scores[i] = Integer.parseInt(st.nextToken());
				sum+=scores[i];
			}
			double avg = sum/N;
			double rate = 0.0;
			for(var score: scores)
				if(score>avg) ++rate;
			System.out.printf("%.3f%%\n", (rate/N)*100);
		}
	}
}
*/