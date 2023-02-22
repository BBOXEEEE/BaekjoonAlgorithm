import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java11720 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for(byte num: br.readLine().getBytes())
			sum+=(num-'0');
		System.out.println(sum);
	}
}