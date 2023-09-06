import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		BigInteger big1 = new BigInteger(s[0]), big2 = new BigInteger(s[1]);
		big1 = big1.add(big2);
		System.out.print(big1);
	}
}