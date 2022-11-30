import java.util.ArrayList;
import java.util.LinkedList;

public class Note {
    public static void main(String[] args) {
        int[] ingredient={2, 1, 1, 2, 3, 1, 2, 3, 1};
        LinkedList<Integer> foods = new LinkedList<Integer>();
        for(int i=0;i<ingredient.length;i++){
            foods.add(ingredient[i]);
        }
        int count = 0;
        boolean status = true;
        while(status) {
            int res =0;
            for (int i = 0; i < foods.size() - 3; i++) {
                if (foods.get(i) == 1 && foods.get(i + 1) == 2 && foods.get(i + 2) == 3 && foods.get(i + 3) == 1) {
                    count++;
                    foods.remove(i + 3);
                    foods.remove(i + 2);
                    foods.remove(i + 1);
                    foods.remove(i);
                    res++;
                }
            }
            if(res==0) status=false;
        }
        System.out.println(count);

        //test1
//        String str ="";
//        for(int a :ingredient )str+=a;
//        int count=0;
//        boolean status = true;
//        while (status) {
//            if (str.contains("1231")) {
//                str = str.replace("1231", "");
//                count++;
//            } else status = false;
//        }
//        System.out.println(count);
    }
}
