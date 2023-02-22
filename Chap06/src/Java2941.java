import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2941 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] croaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(var C: croaAlpha)
			if(str.contains(C)) str=str.replace(C, "*");
		System.out.println(str.length());
	}
}