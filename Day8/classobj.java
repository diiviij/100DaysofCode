import java.security.PublicKey;

public class classobj {
    public static void main(String args[]){


         car suzuki = new car();
         suzuki.model= 1235 ;
         suzuki.year= 2019;
         suzuki.color ="yellow";

         System.out.println(suzuki.color+" "+suzuki.model+" "+suzuki.year);
    }
}

class car{
    int model;
    int year;
    String color;
    
}