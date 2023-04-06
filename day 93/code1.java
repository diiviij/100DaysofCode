public class code1 {
    public static void decrypt(String code, int key, int len){
        String  ch="";
        int s;
        for(int i =0;i<=len;i++){
            s = key + i;
           if(len < s){
                s = s-len-1;
           }
            ch +=code.charAt(s); 
            }
        System.out.print(ch);
    }
    public static void main(String[] args) {
        String code ="birparam";
        int key = 3;
        int len = code.length()-1;
        decrypt(code, key, len);
    }
    
}
