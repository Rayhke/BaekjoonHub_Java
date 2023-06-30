import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		System.out.print(a - b);
	}
}
/* ■ 설명 ■
[a] 와 [b] 를 입력 받고, ' a - b ' 결과값을 출력하라.
*/
