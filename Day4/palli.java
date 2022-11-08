import java.util.Scanner;

public class palli{
    public static void main(String args[]) {
        //To Print The Char Single
        // int i=0,n=5;
        // String s1="Divij";
        // String s2= s1.toLowerCase();
        // System.out.println(s2);
        // for(i=0;i<s2.length();i++){
        //         System.out.println(s2.charAt(i)+"");
        // }


        //TO REVERSE A CHAR 
        
        
        // String s1 ="Divij";
        // String s2= s1.toLowerCase();
        // char ch;
        // String nstr=""; 
        // int n =0;
        // for(int i=0;i<s2.length();i++){
        //     ch = s2.charAt(i);
        //     System.out.println();
        //     nstr = ch+nstr;
        // }
        // System.out.println("The Reversed Number is "+nstr);
     //----------------------------------------------------------------------------------------------
        
        
        //To CHECK WHETER A NUMBER IS PALLINDROME
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= s1.toLowerCase();
         char ch;
         String nstr=""; 
         int i=0,j=0;
            for(i=0;i<s2.length();i++){
                 ch = s2.charAt(i);
                System.out.println();
                nstr = ch+nstr;
            }
            while (i<j) {
                if (s2.charAt(i) == nstr.charAt(j) ){
                    System.out.println("88");

            }







        
    }
}
