public class reverseword {
    public static String reverse(String name){
        String result = "";
        String temp = "";
        for(int i=name.length()-1;i>=0;i--){
            if(name.charAt(i)=='.'){
                temp = temp + name.charAt(i);
                result = result + temp;
                temp = "";
            }
            else{
                temp = name.charAt(i) + temp;
            }
           
        }
        result = result + temp;
        return result;
        
    }


    public static void main(String[] args){
        String name = "i.am.diiviij";
        
        System.out.print(reverse(name));
    }
}
