import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1;
        int index = 1;
        int input =sc.nextInt();
        for(int i=0;i<input-1;i++){
            if(num==index){
                index++;
                num = 1;
            }else {
                num++;
            }
        }
        int k=index+1-num;
        if(index%2==0){
            System.out.println(num+"/"+k);
        }else {
            System.out.println(k+"/"+num);
        }
    }
}
