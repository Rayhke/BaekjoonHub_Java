import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
		String[] s = p.readLine().split(" ");
		double a = Double.parseDouble(s[0]);		// 일부로 둘이 타입을 통일하지 않고 굳이 [double] 따로 [float] 따로 한 이유는
		float b = Float.parseFloat(s[1]);		// 추후 사용하게 될 때, 참고하도록 하기 위함이다.
		System.out.printf("%.10f",a / b);
	}
}
/* ■ 설명 ■
[printf] 는 c언어의 기능을 흉내내는 것이지
Java의 방식으로 푸는 것이 아니기 때문에 사실 꼼수 풀이에 가까우므로, 추후
Java만의 방식으로 소수점 출력 조절 명령문을 사용하여 조절해 보도록 하자. 
*/
