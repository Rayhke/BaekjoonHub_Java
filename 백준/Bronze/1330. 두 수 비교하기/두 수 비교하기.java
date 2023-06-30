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
/* ■ 설명 ■
[a] 의 값과 [b] 의 값을 입력 받고, 각각의 상수의 값 크기에 따라
알맞은 비교 연산자를 출력한다.
*/
