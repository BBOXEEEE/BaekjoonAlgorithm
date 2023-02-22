import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Java10814 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[][] person = new String[N][2];
		for(int i=0; i<N; ++i) {
			person[i][0] = in.next();
			person[i][1] = in.next();
		}
		Arrays.sort(person, new Comparator<String[]>() {
			@Override
			public int compare(String[]s1, String[]s2) {
				return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			}
		});
		StringBuilder ret = new StringBuilder();
		for(String[] S: person) {
			for(String P: S)
				ret.append(P+" ");
			ret.append('\n');
		}
		System.out.println(ret);
		in.close();
	}
}

/* ver.2
import java.util.Scanner;

public class Java10814 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		StringBuilder[] person = new StringBuilder[201];
		for(int i=0; i<person.length; ++i)
			person[i] = new StringBuilder();
		for(int i=0; i<N; ++i) {
			int age = in.nextInt();
			String name = in.next();
			person[age].append(age+" ").append(name).append('\n');
		}
		StringBuilder ret = new StringBuilder();
		for(var P: person)
			ret.append(P);
		System.out.println(ret);
		in.close();
	}
}
*/