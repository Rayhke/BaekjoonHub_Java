import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final char[] Day = "MONTUEWEDTHUFRISATSUN".toCharArray();
        final int[] MonthByDay = { -1,31,28,31,30,31,30,31,31,30,31,30,31 };
        int[] input = inputData();
        int index;

        for (int n = 0; n < input[0]; n++) {
            input[1] += MonthByDay[n];
        }
        index = (input[1] % 7) * 3;
        for (int n = index; n < index + 3; n++) {
            System.out.print(Day[n]);
        }
    }

    static int[] inputData() throws IOException {
        int[] result = new int[2];
        int index = 0, value;

        while(index < 2) {
            value = System.in.read();
            if (47 < value && value < 58) {
                result[index] *= 10;
                result[index] += (value - 48);
            }
            else { index++; }
        }

        return result;
    }
}