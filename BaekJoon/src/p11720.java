import java.util.Scanner;

public class p11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String[] str = sc.next().split("");
        int result =0;
        for(int i=0;i<n;i++){
            result+=Integer.parseInt(str[i]);
        }
        System.out.println(result);
    }
}
