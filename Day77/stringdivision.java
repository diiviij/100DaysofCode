public class cipher2 {
    public static void decrypt(String code, int key){
        for(int i =0;i<code.length();i++){
            int check = key+i;
            if(code.length() < check){
                System.out.print(code.charAt(i));
            }
           
        }
        System.out.print(code.substring(0, key));
    }
    public static void main(String[] args) {
        String code ="applepine";
        int key = 5;
        decrypt(code, key);
    }
    
}
