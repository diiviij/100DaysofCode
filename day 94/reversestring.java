package NetApp;
public class reversestring {
    public static void main(String[] args){
        String word = "Divij";
        String reverse = "";
        for(int i=0;i<word.length();i++){
            reverse = word.charAt(i) + reverse;
        }
        System.out.println(reverse);

    }
}

