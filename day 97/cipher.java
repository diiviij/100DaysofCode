public class cipher {
    public static void decrypt(String code, int key){
        int len =code.length();
        System.out.println(len);
        String String = "";
        for(int i=key;i<len;i++){
            String = String + code.charAt(i);
        }
        System.out.println(String + code.substring(0, key));
    }
    public static void main(String[] args) {
        int key=5;
        String code = "applepine";
        decrypt(code, key);
    }
}
