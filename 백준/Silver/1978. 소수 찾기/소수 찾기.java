import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A == 2) result++;
            if (A > 1 && A % 2 != 0) {
                boolean rs = true;
                for(int a=3;a<A/2;a++){
                    if(A%a==0) {
                        rs = false;
                        break;
                    }
                }
                if (rs)result++;
            }
        }
        System.out.println(result);
    }
}
