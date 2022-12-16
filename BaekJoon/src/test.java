import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0;t<T;t++){
            int H= sc.nextInt();
            int W=sc.nextInt();
            int N=sc.nextInt();
            int w =0;
            int h=0;
            if(N%H!=0){
                w=N/H+1;
                h=N%H;
            }else {
                w=N/H;
                h=H;
            }
            System.out.println(h+String.format("%02d",w));
        }
    }
}
