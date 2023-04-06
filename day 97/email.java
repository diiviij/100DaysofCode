public class email {
    public static void Check(String email) {
        int n=0;
        for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                   n =i;
                    break;
                }
        }
        if(email.charAt(0)=='@'){
            System.out.println("Invalid Email");
        }
        else if(n > 5){ 
            String pre="";
            //while(n-3<n){
            for(int i=0;i<n-3;i++)
            pre = pre + "*";
            System.out.println(email.substring(0,3)+pre+email.substring(n,email.length()));
        }
        else if(n <=5){ 
            System.out.println(email.substring(0, n)+email.substring(n,email.length()));
        }
    }
    public static void main(String[] args) {
        String email = "ibmdiv@ibm.com";

        System.out.println(email);

        Check(email);
    }
}
