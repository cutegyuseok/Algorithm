import java.util.Scanner;
/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 */

public class p2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int max_i =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                max_i=i;
            }
        }
        System.out.println(max+"\n"+(max_i+1));
    }
}
