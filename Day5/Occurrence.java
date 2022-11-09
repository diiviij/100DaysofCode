/*
problem:- to count the occurence of a word in a statement

Sample input/output

Enter the statement 
Hello Good Morning
Enter the word looking for 
Hello
The word Hello Occurrences is = 1

*/
import java.util.Scanner;

public class Occurrence {
    static int OccurrenceOfWord(String str, String find) {
        String brandNewString = str.toLowerCase();
        String search = find.toLowerCase();
    

        int leng = search.length(); // 3
        int count = 0;
        char ch = search.charAt(0); // t
    
        int i = 0;
        while (i < brandNewString.length()) {
          // System.out.print(i+" ");
          String compare = "";
          if (brandNewString.charAt(i) == ch) {
            compare = compare + brandNewString.substring(i, i + leng);
            if (compare.equals(search)) {
              count++;
              i = i + leng - 1;
            }
          }
          i++;
    
        }
    
        return count;
      }
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the statement ");
        String st = sc.nextLine();
        System.out.println("Enter the word looking for ");
        String looking_for = sc.next();
    
        sc.close();
    
        System.out.println("The word " + looking_for + " Occurrences is = " + OccurrenceOfWord(st, looking_for));
      }
}
