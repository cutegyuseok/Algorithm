import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> arr = new ArrayList<>();
        int[] arr1 = new int[14];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = i+1;
        }
        arr.add(arr1);
        for(int i=0;i<14;i++){
            int[] arr2 = new int[14];

            for(int j=0;j<14;j++){
                int p = 0;
                for(int k=0;k<=j;k++){
                    p+=arr.get(i)[k];
                }
                arr2[j] = p;
            }
            arr.add(arr2);
        }
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int floor = sc.nextInt();
            int side = sc.nextInt() - 1;
            System.out.println(arr.get(floor)[side]);
        }
    }
}
