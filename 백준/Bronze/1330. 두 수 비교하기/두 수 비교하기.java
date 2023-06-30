import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		String[] p = s.readLine().split(" ");
		int a = Integer.parseInt(p[0]);
		int b = Integer.parseInt(p[1]);
		if (a > b) { System.out.print(">"); }
		else if (a < b) { System.out.print("<"); }
		else { System.out.print("=="); }
	}
}