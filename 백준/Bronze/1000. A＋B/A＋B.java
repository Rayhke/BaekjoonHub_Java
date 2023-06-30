import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		System.out.print(a + b);
	}
}
/* ■ 설명 ■
자바에 온 것을 환영하는 기념으로 기능을 설명 해보도록 하자.

[System.out.print] 란?
c언어로 치면 [printf] 와 같은 기능이며, 만약 [System.out.println] 을 했다면
[printf("\n")] 를 한 것과 같은 의미이다.

그리고 안타까운 소식은, c언어는 [scanf]을 c++언어는 [cin]를 쓰면 간단했지만...
이것 만큼은 답정너로 나의 머슬 메모리로 외우길 바란다.

import java.io.BufferedReader;									// 여기서 * 과 지정하는 것의 차이는
import java.io.InputStreamReader;								// * 는 선언한 [import java.??.] 기능을 다 끌어오는 것이지만
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		String[] p = s.readLine().split(" ");						// 띄어 쓰기 구분으로 입력되도록 하는 것이며
		int a = Integer.parseInt(p[0]);							// 1번 째 입력
		int b = Integer.parseInt(p[1]);							// 2번 째 입력
	}
}
*/
