import java.util.Scanner;

public class Java1330 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(A>B? ">": A<B? "<": "==");
		in.close();
	}
}
