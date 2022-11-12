public class constructor2 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Divij");
        System.out.println(s1.name);
    }
}


class Student{
    String name;
    int roll;

   /*  Student(){
        System.out.println("Constructor is working");
        this.name = name;
    } 
    This Non-parameterized Constructor
    */

    /* 
    Student(String name){
        this.name = name;
    }
    This is Parameterized constructor
    */
    
    Student(String name){
        System.out.println("Constructor is working");
        this.name = name;
    }



}

/*Types of Constructors 
    1.Non-Parameterized
    2.Parameterized
    3.copy Constructor
*/