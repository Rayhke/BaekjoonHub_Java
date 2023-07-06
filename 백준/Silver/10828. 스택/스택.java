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
            String[] s2 = p.readLine().split(" ");
            s = s2[0];
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