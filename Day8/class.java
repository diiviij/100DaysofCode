import java.sql.Struct;

public class OOPS { 
    public static void main(String[] args) {
        Pen p1 = new Pen();             //created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Yellow";
        System.out.println(p1.color);




        BankAccount myacc = new BankAccount();
        myacc.username = "Divij";
        // myAcc.password = "123456"; THis will genrate an erroe as this is private
        myacc.setPassword("112345");
        System.out.println(myacc.username);
        




    }
    
}
class Pen{                              //created a class name Pen
                                        //prop + func
    String color;
    int tip;

    void setColor(String  newcolor){    //function
        color =  newcolor;
    }
     
    void  setTip(int newTip){           //function
        tip = newTip;
        }
    }


    /*Access Specifiers or Modifiers 
            They are of four types 
            1. Private 
            2. Default 
            3.Protected 
            4.Public 

    */
class BankAccount{
   public String username;
   private String password;

   public void setPassword(String pwd){   //function
    password = pwd;
   }

}
