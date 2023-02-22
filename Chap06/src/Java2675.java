import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2675 {
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