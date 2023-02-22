import java.util.Scanner;

public class Java2884 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		if(M<45) {
			if(H==0)
				H=23;
			else
				H-=1;
			M+=60;
		}
		System.out.println(H + " " + (M-45));
		in.close();
	}
}