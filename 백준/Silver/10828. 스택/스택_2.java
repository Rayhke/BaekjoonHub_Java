import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c = -1;
        String s;
        a = Integer.parseInt(p.readLine());
        int[] d = new int[a + 1];
        for (int n = 0; n < a; n++) {
            String[] s2 = p.readLine().split(" ");        // 사실 제일 어려웠던 것은 자바로 띄어쓰기 and 줄 바꿈의
            s = s2[0];                                    // 입력 방식을 구현하는 것이 가장 어려웠다...
            if (s.equals("push")) {
                b = Integer.parseInt(s2[1]);
                d[++c] = b;
            } else if (s.equals("pop")) {
                if (c != -1) { System.out.println(d[c]); d[c--] = 0; }
                else { System.out.println(-1); }
            } else if (s.equals("size")) {
                if (c != -1) { System.out.println(c + 1); }
                else { System.out.println(0); }
            } else if (s.equals("empty")) {
                if (c != -1) { System.out.println(0); }
                else { System.out.println(1); }
            } else if (s.equals("top")) {
                if (c != -1) { System.out.println(d[c]); }
                else { System.out.println(-1); }
            }
        }
    }
}
/* ■ 설명 ■
전형적인 스택(stack)을 구현한 코드이다.
import 에 stack 이 있긴 하지만, 배제하고 구현함
*/
