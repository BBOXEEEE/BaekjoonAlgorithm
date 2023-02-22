import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java1427 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[10];
		for(var num: br.readLine().getBytes())
			++count[num-'0'];
		StringBuilder ret = new StringBuilder();
		for(int i=count.length-1; i>=0; --i) {
			while(count[i] > 0) {
				ret.append(i);
				--count[i];
			}
		}
		System.out.println(ret);
	}
}