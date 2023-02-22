import java.util.Scanner;

public class Java25304 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalPrice = in.nextInt();
		int N = in.nextInt();
		for(int i=0; i<N; ++i) {
			int price = in.nextInt();
			int num = in.nextInt();
			totalPrice -= price*num;
		}
		System.out.println((totalPrice==0)? "Yes": "No");
		in.close();
	}
}