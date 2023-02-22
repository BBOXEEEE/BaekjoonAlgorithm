import java.util.Scanner;

public class Java2480 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] D = new int[3];
		for(int i=0; i<D.length; ++i)
			D[i] = in.nextInt();
		
		int ret=0;
		if(D[0]==D[1] && D[1]==D[2] && D[2]==D[0])
			ret = 10_000 + D[0]*1_000;
		else if(D[0]==D[1] || D[0]==D[2])
			ret = 1_000 + D[0]*100;
		else if(D[1]==D[2])
			ret = 1_000 + D[1]*100;
		else
			ret = Math.max(D[0], Math.max(D[1], D[2])) * 100;
		System.out.println(ret);
		in.close();
	}
}