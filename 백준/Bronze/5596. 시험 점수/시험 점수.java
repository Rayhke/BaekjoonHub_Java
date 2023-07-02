import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(p.readLine());
		StringTokenizer s2 = new StringTokenizer(p.readLine());
		int a = 0, b = 0;
		for (int n = 0; n < 4; n++) { a += Integer.parseInt(s1.nextToken()); }
		for (int n = 0; n < 4; n++) { b += Integer.parseInt(s2.nextToken()); }
		if (a > b) { System.out.print(a); }
		else { System.out.print(b); }
	}
}