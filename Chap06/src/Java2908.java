import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2908 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(br.readLine());
		String[] reverseStr = str.reverse().toString().split(" ");
		int result = Math.max(Integer.parseInt(reverseStr[0]), Integer.parseInt(reverseStr[1]));
		System.out.println(result);
	}
}