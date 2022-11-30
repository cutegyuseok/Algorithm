/*
https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */
public class lessons_118666 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String answer = "";
        int[] result = new int[4];
        //RT +R -T
        //CF +C -F
        //JM +J -M
        //AN +A -N

        for(int i=0;i<choices.length;i++){
            switch (survey[i]){
                case "RT":result[0]-=score(choices[i]);break;
                case "TR":result[0]+=score(choices[i]);break;
                case "CF":result[1]-=score(choices[i]);break;
                case "FC":result[1]+=score(choices[i]);break;
                case "JM":result[2]-=score(choices[i]);break;
                case "MJ":result[2]+=score(choices[i]);break;
                case "AN":result[3]-=score(choices[i]);break;
                case "NA":result[3]+=score(choices[i]);break;
                default:break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(result[0]>=0){
            sb.append("R");
        }else {
            sb.append("T");
        }
        if (result[1]>=0){
            sb.append("C");
        }else {
            sb.append("F");
        }
        if (result[2]>=0){
            sb.append("J");
        }else {
            sb.append("M");
        }
        if (result[3]>=0){
            sb.append("A");
        }else {
            sb.append("N");
        }
        answer=sb.toString();
        System.out.println(sb.toString());

        }
    public static int score(int choice){
        switch (choice){
            case 1:return -3;
            case 2:return -2;
            case 3:return -1;
            case 4:return 0;
            case 5:return 1;
            case 6:return 2;
            case 7:return 3;
            default:break;
        }
        return 0;
    }
}
