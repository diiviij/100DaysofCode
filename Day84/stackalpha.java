import java.util.Scanner;

class HackerRank {
  static void splitString(String str)
     {
         StringBuffer alpha = new StringBuffer(),
         num = new StringBuffer(), special = new StringBuffer();
         for (int i=0; i<str.length(); i++)
         {
             if (Character.isDigit(str.charAt(i)))
                 num.append(str.charAt(i));
             else if(Character.isAlphabetic(str.charAt(i)))
                 alpha.append(str.charAt(i));
             else{
                 System.out.println("Invalid Input");
                 System.exit(0);
                }
         }
         System.out.print(alpha);
         System.out.println();
         System.out.print(num);
    
     }
 public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  String s1= sc.next();
  splitString(s1);
 }
}
