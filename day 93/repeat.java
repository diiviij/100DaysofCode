import java.util.*;
public class repeat {
    public static void ans(String text2, int len) {
        char tempArray[] = text2.toCharArray();
        Arrays.sort(tempArray);
        Integer count=0;
        System.out.println(tempArray);
        for(int i=0;i<len;i++){
            if(tempArray[i]!=tempArray[i+1]){
                count++;
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String text = "On a scale of 1 to 11, it is a 10.";
        int len = text.length()-1;
        String text2 = text.toLowerCase();
        ans(text2, len);
        
    }
}
