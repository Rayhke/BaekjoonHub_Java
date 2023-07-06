import java.io.BufferedReader;      // 빠른 입력을 받기 위해 사용
import java.io.InputStreamReader;   // 이하 동일

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        //Stack <Integer> stack = new Stack<>();
        int a, b, c = -1;
        String s;
        a = Integer.parseInt(p.readLine());
        int[] d = new int[a + 1];
        for (int n = 0; n < a; n++) {
            String[] s2 = p.readLine().split(" ");
            s = s2[0];
            if (s.equals("push")) {
                b = Integer.parseInt(s2[1]);
                d[++c] = b;
            } else if (s.equals("pop")) {
                if (c != -1) {
                    System.out.println(d[0]);
                    for(int m = 0; m < c; m++) { d[m] = d[m + 1]; } // 굳이 m < c 까지 범위를 포함 시킨 이유가 무엇이냐?
                    c--;                                            // 일부로 배열 크기를 a + 1 로 선언 했기에
                } else { System.out.println(-1); }                  // 사실 보이지 않지만 가장 끝자리 배열 값이 ' 0 ' 이다.
            } else if (s.equals("size")) {
                if (c != -1) { System.out.println(c + 1); }
                else { System.out.println(0); }
            } else if (s.equals("empty")) {
                if (c != -1) { System.out.println(0); }
                else { System.out.println(1); }
            } else if (s.equals("front")) {
                if (c != -1) { System.out.println(d[0]); }
                else { System.out.println(-1); }
            } else if (s.equals("back")) {
                if (c != -1) { System.out.println(d[c]); }
                else { System.out.println(-1); }
            }
        }
    }
}
