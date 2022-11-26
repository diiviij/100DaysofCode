import java.sql.Struct;

public class OOPS { 
    public static void main(String[] args) {
        Pen p1 = new Pen();             //created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.getTip());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
    
}
class Pen{                              //created a class name Pen
                                        //prop + func
    private String color;
    private int tip;
    
    //GETTERS
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    //SETTERS
    void setColor(String  newcolor){    //function
        this.color =  newcolor;
    }
     
    void  setTip(int Tip){           //function
        this.tip= Tip;
        }
    }
