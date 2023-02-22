import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java1065 {
	public static int solve(int num) {
		int cnt = 0;
		if(num<100) return num;
		else {
			cnt=99;
			for(int i=100; i<=num; ++i) {
				String[] strNum = Integer.toString(i).split("");
				if((Integer.parseInt(strNum[1])-Integer.parseInt(strNum[0])) 
						== (Integer.parseInt(strNum[2])-Integer.parseInt(strNum[1])))
					++cnt;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solve(Integer.parseInt(br.readLine())));
	}
}

/* # ver.2
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java1065 {
	public static int solve(int num) {
		int cnt = 0;
		if(num<100) return num;
		else {
			cnt=99;
			for(int i=100; i<=num; ++i) {
				int A = i/100;
				int B = (i/10)%10;
				int C = i%10;
				if((B-C) == (A-B)) ++cnt;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solve(Integer.parseInt(br.readLine())));
	}
}
*/