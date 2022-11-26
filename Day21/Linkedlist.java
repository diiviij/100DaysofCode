import java.util.*;  
public class linkedlist{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Hi");  
  al.add("There");  
  al.add("Divij");  
  al.add("Jain");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
