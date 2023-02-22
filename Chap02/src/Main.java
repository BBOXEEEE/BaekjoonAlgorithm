import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if(x>0)
			System.out.println((y>0)? 1: 4);
		else
			System.out.println((y>0)? 2: 3);
		in.close();
	}
}

/* # 1330
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(A>B? ">": A<B? "<": "==");
		in.close();
	}
}
*/

/* # 9488
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		System.out.println((score>=90)? "A": (score>=80)? "B":
			(score>=70)? "C": (score>=60)? "D": "F");
		in.close();
	}
}
*/

/* # 2753
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(year%4==0 && (year%100!=0||year%400==0))
			System.out.println(1);
		else
			System.out.println(0);
		in.close();
	}
}
*/

/* # 14681
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if(x>0)
			System.out.println((y>0)? 1: 4);
		else
			System.out.println((y>0)? 2: 3);
		in.close();
	}
}
*/

/* # 2884
import java.util.Scanner;

public class Main {
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
*/

/* # 2525
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int T = in.nextInt();
		
		int tmp = H*60+M+T;
		H=(tmp/60)%24;
		M=tmp%60;
		System.out.println(H + " " + M);
		in.close();
	}
}
*/

/* # 2480
import java.util.Scanner;

public class Main {
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
*/