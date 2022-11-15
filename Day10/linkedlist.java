import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Apple");  
  al.add("Ball");  
  al.add("Cat");  
  al.add("Dog");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
