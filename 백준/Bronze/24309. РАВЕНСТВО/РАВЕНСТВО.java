import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine()),
				b = new BigInteger(br.readLine()),
				c = new BigInteger(br.readLine());
		b = b.subtract(c);
		System.out.print(b.divide(a));
	}
}
