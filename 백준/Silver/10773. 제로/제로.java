import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int sum = 0;
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack_int = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                stack_int.push(arr[i]);
            }else{
                stack_int.pop();
            }
        }
        for(int a:stack_int){
            sum+=a;
        }
        System.out.println(sum);
    }
}