import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		String[] s = p.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		for (int n = 0; n < a; n++) {
			for (int m = 0; m < n + 1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}