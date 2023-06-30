import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		String[] s = p.readLine().split(" ");
		double a = Double.parseDouble(s[0]);
		float b = Float.parseFloat(s[1]);
		System.out.printf("%.10f",a / b);
	}
}