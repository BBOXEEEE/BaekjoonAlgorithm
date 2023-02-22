import java.util.Scanner;

public class Java10818 {
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

/* ver.2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10818 {
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