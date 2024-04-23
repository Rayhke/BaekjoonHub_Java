import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int sum = 0;
        for (String N : input) {
            sum += Integer.parseInt(N);
        }
        System.out.print(sum);
    }
}