import java.util.Scanner;

public class p2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] crAb = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = sc.next();
        for(int i=0;i<crAb.length;i++){
           str=str.replaceAll(crAb[i],"0");
        }
        System.out.println(str.length());
    }
}
