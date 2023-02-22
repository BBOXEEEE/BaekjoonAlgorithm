import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java10989 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[10001];
		for(int i=0; i<N; ++i)
			++count[Integer.parseInt(br.readLine())];
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<count.length; ++i) {
			while(count[i]>0) {
				ret.append(i).append('\n');
				--count[i];
			}
		}
		System.out.println(ret);
		br.close();
	}
}