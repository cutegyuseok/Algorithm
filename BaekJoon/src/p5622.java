import java.util.Scanner;

public class p5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            arr[ch - 65]++;
        }
        int num = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i > 21) {
                num = 10;
            } else if (i > 18) {
                num = 9;
            } else if (i > 14) {
                num = 8;
            } else if (i% 3 == 0&& i>2) {
                num++;
            }
            result += arr[i] * num;
        }
        System.out.println(result);
    }
}
//n = 26
// A = 65
//Z = 90