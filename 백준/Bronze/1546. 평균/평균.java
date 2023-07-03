import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		String[] s = p.readLine().split(" ");
		StringTokenizer q = new StringTokenizer(p.readLine());
		int a = Integer.parseInt(s[0]);
		double b = 0, c = 0, d = 0;
		for (int n = 0; n < a; n++) {
			c = Double.parseDouble(q.nextToken());
			b += c;
			if (d < c) { d = c; }
		}
		System.out.print(b / (d * a) * 100);
	}
}