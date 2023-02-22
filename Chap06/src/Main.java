import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static boolean solution(String word) {
		boolean[] check = new boolean[26];
		char prev = ' ';
		for(char C: word.toCharArray()) {
			if(prev!=C) {
				if(!check[C-'a']) {
					check[C-'a']=true;
					prev=C;
				}
				else return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<N; ++i) {
			String word = br.readLine();
			if(solution(word)) ++cnt;
		}
		System.out.println(cnt);
	}
}

/* # 11654
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((int)br.readLine().charAt(0));
	}
}
*/

/* # 11720
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for(byte num: br.readLine().getBytes())
			sum+=(num-'0');
		System.out.println(sum);
	}
}
*/

/* # 10809
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphaFreq = new int[26];
		Arrays.fill(alphaFreq, -1);
		int index = 0;
		for(var alpha: br.readLine().toCharArray()) {
			if(alphaFreq[alpha-'a'] == -1) alphaFreq[alpha-'a'] = index;
			++index;
		}
		for(var ret: alphaFreq)
			System.out.print(ret + " ");
	}
}
*/

/* # 2675
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder ret = new StringBuilder();
		
		for(int t=0; t<T; ++t) {
			String[] input = br.readLine().split(" ");
			int R = Integer.parseInt(input[0]);
			String str = input[1];
			for(char C: str.toCharArray()) {
				for(int i=0; i<R; ++i)
					ret.append(C);
			}
			ret.append('\n');
		}
		System.out.println(ret);
	}
}
*/

/* # 1157
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] alphaFreq = new int[26];
		for(char C: str.toCharArray())
			++alphaFreq[C-'A'];
		
		int max = 0;
		char ret = '?';
		for(int i=0; i<alphaFreq.length; ++i) {
			if(alphaFreq[i]>max) {
				max = alphaFreq[i];
				ret = (char)(i+'A');
			}
			else if(alphaFreq[i]==max)
				ret = '?';
		}
		System.out.println(ret);
	}
}
*/

/* # 1152
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
	}
}
*/

/* # 2908
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		String[] reverseStr = str.reverse().toString().split(" ");
		int result = Math.max(Integer.parseInt(reverseStr[0]), Integer.parseInt(reverseStr[1]));
		System.out.println(result);
	}
}
*/

/* # 5662
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int cnt = 0;
		for(int i=0; i<S.length(); ++i) {
			switch(S.charAt(i)) {
			case 'A': case 'B': case 'C':
				cnt+=3; break;
			case 'D': case 'E': case 'F':
				cnt+=4; break;
			case 'G': case 'H': case 'I':
				cnt+=5; break;
			case 'J': case 'K': case 'L':
				cnt+=6; break;
			case 'M': case 'N': case 'O':
				cnt+=7; break;
			case 'P': case 'Q': case 'R': case 'S':
				cnt+=8; break;
			case 'T': case 'U': case 'V':
				cnt+=9; break;
			case 'W': case 'X': case 'Y': case 'Z':
				cnt+=10; break;
			}
		}
		System.out.println(cnt);
	}
}
*/

/* # 2941
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] croaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(var C: croaAlpha)
			if(str.contains(C)) str=str.replace(C, "*");
		System.out.println(str.length());
	}
}
*/

/* # 1316
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static boolean solution(String word) {
		boolean[] check = new boolean[26];
		char prev = ' ';
		for(char C: word.toCharArray()) {
			if(prev!=C) {
				if(!check[C-'a']) {
					check[C-'a']=true;
					prev=C;
				}
				else return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<N; ++i) {
			String word = br.readLine();
			if(solution(word)) ++cnt;
		}
		System.out.println(cnt);
	}
}
*/