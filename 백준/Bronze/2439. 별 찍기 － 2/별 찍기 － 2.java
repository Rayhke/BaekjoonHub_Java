import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		//String[] s = p.readLine().split(" ");
		int a = Integer.parseInt(p.readLine());
		for (int n = 0; n < a; n++) {
			for (int m = n + 1; m < a; m++) {
				System.out.print(" ");
			}
			for (int m = 0; m < n + 1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}