import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        boolean success = false;
        loop1:
        for (int i=0;i<=(num/3);i++){
            for (int j=0;j<=(num-3*i)/5;j++){
                int n =(3*i)+(5*j);
                if(i+j!=0) {
                    if (num ==n) {
                        System.out.println(i+j);
                        success = true;
                        break loop1;
                    }
                }
            }
        }
        if (!success){
            System.out.println(-1);
        }
    }
}
