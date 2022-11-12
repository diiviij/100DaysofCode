public class Student   
{  
private int roll;  
private String name;  
public int getRoll()    //accessor method  
{  
return roll;  
}  
public void setRoll(int roll) //mutator method  
{  
this.roll = roll;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
public void display()  
{  
System.out.println("Roll no.: "+roll);  
System.out.println("Student name: "+name);  
}  
}  

/* 
Constructor have the same name as class or structure
constructor don't have a return type.
constructor are only called once, at object creation.
memory allocation happens when constructor is called.
*/