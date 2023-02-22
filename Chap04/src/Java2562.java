import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2562 {
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