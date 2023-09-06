import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger big1 = new BigInteger(br.readLine()), big2 = new BigInteger(br.readLine());
		System.out.print(big1.add(big2)+"\n"+big1.subtract(big2)+"\n"+big1.multiply(big2));
	}
}