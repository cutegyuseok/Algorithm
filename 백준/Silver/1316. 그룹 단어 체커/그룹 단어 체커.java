import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String[]> strArr = new ArrayList<String[]>();
        for(int i=0;i<n;i++) {
            strArr.add(sc.next().split(""));
        }
        int result =0;
        for(int i=0;i<n;i++){
            int[] list = new int[26];
            boolean status = true;
            for(int j=0;j<strArr.get(i).length;j++){
                int target = (strArr.get(i)[j].charAt(0))-97;
                if(j>0&&!strArr.get(i)[j].equals(strArr.get(i)[j-1])&&list[target]!=0){
                    status = false;
                }else {
                    list[target]++;
                }
            }
            if (status){
                result++;
            }
        }
        System.out.println(result);
    }
}