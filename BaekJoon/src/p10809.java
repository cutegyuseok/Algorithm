import java.util.HashMap;
import java.util.Scanner;

public class p10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> enArr = new HashMap<>();
        String[] strArr = sc.next().split("");
        for (int i=0;i<strArr.length;i++){
            if(enArr.get(strArr[i])==null){
                enArr.put(strArr[i],i);
            }
        }
        for(int i=97;i<123;i++){
            String target = String.valueOf((char)i);
            if(enArr.get(target)==null){
                System.out.print(-1+" ");
            }else {
                System.out.print(enArr.get(target)+" ");
            }
        }
    }
}
//a == 97
//z == 122
//n = 26