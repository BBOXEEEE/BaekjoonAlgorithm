import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] point = new int[N];
		int[] sorted = new int[N];
		for(int i=0; i<N; ++i)
			sorted[i] = point[i] = in.nextInt();
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rank = 0;
		for(int X: sorted) {
			if(!map.containsKey(X)) {
				map.put(X, rank);
				++rank;
			}
		}
		StringBuilder ret = new StringBuilder();
		for(int P: point) {
			int value = map.get(P);
			ret.append(value).append(' ');
		}
		System.out.println(ret);
		in.close();
	}
}

/* # 2750
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] numbers = new int[N];
		for(int i=0; i<N; ++i)
			numbers[i] = in.nextInt();
		// sort
		for(int i=0; i<N-1; ++i)
			for(int j=i+1; j<N; ++j) {
				if(numbers[i]>numbers[j]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		for(int num: numbers)
			System.out.println(num);
		in.close();
	}
}
*/

/* # 2587
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = 5;
		int[] numbers = new int[N];
		for(int i=0; i<N; ++i)
			numbers[i] = in.nextInt();
		int sum = 0;
		for(int num: numbers)
			sum+=num;
		for(int i=0; i<N-1; ++i) {
			for(int j=i+1; j<N; ++j) {
				if(numbers[i]>numbers[j]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}
		System.out.println(sum/N);
		System.out.println(numbers[2]);
		in.close();
	}
}
*/

/* # 25305
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] scores = new int[N];
		int k = in.nextInt();
		for(int i=0; i<N; ++i)
			scores[i] = in.nextInt();
		// sort
		for(int i=0; i<N-1; ++i)
			for(int j=i+1; j<N; ++j) {
				if(scores[i]>scores[j]) {
					int tmp = scores[j];
					scores[j] = scores[i];
					scores[i] = tmp;
				}
			}
		System.out.println(scores[N-k]);
		in.close();
	}
}
*/

/* # 2571
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] numbers = new int[N];
		for(int i=0; i<N; ++i)
			numbers[i] = in.nextInt();
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		for(int num: numbers)
			heap.add(num);
		for(int i=0; i<N; ++i)
			numbers[i] = heap.poll();
		StringBuilder ret = new StringBuilder(N);
		for(int num: numbers)
			ret.append(num).append('\n');
		System.out.println(ret);
		in.close();
	}
}
*/

/* # 10989
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[10001];
		for(int i=0; i<N; ++i)
			++count[Integer.parseInt(br.readLine())];
		StringBuilder ret = new StringBuilder();
		for(int i=0; i<count.length; ++i) {
			while(count[i]>0) {
				ret.append(i).append('\n');
				--count[i];
			}
		}
		System.out.println(ret);
		br.close();
	}
}
*/

/* # 2108
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// 정수 범위 : -4000 ~ 4000
		int[] count = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 98764321;
		int mode = 987654321;
		
		// 입력 처리 및 최대, 최소 탐색 
		for(int i=0; i<N; ++i) {
			int number = in.nextInt();
			sum+=number;
			++count[number+4000];
			if(number > max) max = number;
			if(number < min) min = number;
		}
		
		int medianCount = 0;
		int modeCount = 0;
		boolean duplication = false;
		// 중앙값 및 최빈값 탐색
		for(int i = min+4000; i<=max+4000; ++i) {
			if(count[i] > 0) {
				// 중앙값 
				if(medianCount < (N+1)/2) {
					medianCount += count[i];
					median = i-4000;
				}
				// 최빈값
				if(modeCount < count[i]) {
					modeCount = count[i];
					mode = i-4000;
					duplication = true;
				}
				else if(modeCount == count[i] && duplication) {
					mode = i-4000;
					duplication = false;
				}
			}
		}
		// 결과 
		System.out.println(Math.round((double)sum/N));	// 평균
		System.out.println(median);						// 중앙값 
		System.out.println(mode);						// 최빈값 
		System.out.println(max-min);					// 범위 
		in.close();
	}
}
*/

/* # 1427
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[10];
		for(var num: br.readLine().getBytes())
			++count[num-'0'];
		StringBuilder ret = new StringBuilder();
		for(int i=count.length-1; i>=0; --i) {
			while(count[i] > 0) {
				ret.append(i);
				--count[i];
			}
		}
		System.out.println(ret);
	}
}
*/

/* # 11650
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] pos = new int[N][2];
		for(int i=0; i<N; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			pos[i][0] = Integer.parseInt(st.nextToken());
			pos[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(pos, (o1, o2) -> {
			if(o1[0] == o2[0]) return o1[1]-o2[1];
			else return o1[0]-o2[0];
		});
		StringBuilder ret = new StringBuilder();
		
		for(int[] X: pos) {
			for(int Y: X)
				ret.append(Y + " ");
			ret.append('\n');
		}
		System.out.println(ret);
	}
}
*/

/* # 11651
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] pos = new int[N][2];
		for(int i=0; i<N; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			pos[i][0] = Integer.parseInt(st.nextToken());
			pos[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(pos, (o1, o2) -> {
			if(o1[1] == o2[1]) return o1[0]-o2[0];
			else return o1[1]-o2[1];
		});
		StringBuilder ret = new StringBuilder();
		
		for(int[] X: pos) {
			for(int Y: X)
				ret.append(Y + " ");
			ret.append('\n');
		}
		System.out.println(ret);
	}
}
*/

/* # 1181
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] words = new String[N];
		for(int i=0; i<N; ++i)
			words[i] = in.next();
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length())
					return s1.compareTo(s2);
				else return s1.length()-s2.length();
			}
		});
		System.out.println(words[0]);
		for(int i=1; i<N; ++i)
			if(!words[i].equals(words[i-1]))
				System.out.println(words[i]);
	}
}
*/

/* # 10814(1)
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
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
*/

/* # 10814(2)
import java.util.Scanner;

public class Main {
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

/* # 18870
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] point = new int[N];
		int[] sorted = new int[N];
		for(int i=0; i<N; ++i)
			sorted[i] = point[i] = in.nextInt();
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rank = 0;
		for(int X: sorted) {
			if(!map.containsKey(X)) {
				map.put(X, rank);
				++rank;
			}
		}
		StringBuilder ret = new StringBuilder();
		for(int P: point) {
			int value = map.get(P);
			ret.append(value).append(' ');
		}
		System.out.println(ret);
		in.close();
	}
}
*/