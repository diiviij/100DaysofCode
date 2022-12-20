import java.io.*;
import java.util.Scanner;
public class stack {
 static int ch;
 int element, maxsize, top;
 int[] st;
 public stack() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter stack size");
  maxsize = sc.nextInt();
  st = new int[maxsize];
  top = -1;
 }
 public void push(int element) {
  /*if(top>=maxsize)
{ System.out.println("Overflow!!");
//return(0);
}*/
  try {
   st[++top] = element;
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println(e);
  }
 }
 public int pop() {
  if (top == -1) {
   System.out.println("UnderFlow");
   return (-1);
  }
  return (st[top--]);
 }

 public void display(int[] st, int max_size) {
  int i;
  System.out.println("Stack Elements:");
  for (i = 0; i <= max_size; i++)
   System.out.println(st[i]);
 }
}
public class myStack {
 static int ch;
 public static void main(String[] args) {
  stack obj = new stack();
  while (true) {
   System.out.println("\nEnter your choice\n1.PUSH\n2.POP\n3.Display\n4..EXIT");
   Scanner integer = new Scanner(System.in);
   ch = integer.nextInt();
   switch (ch) {
    case 1:
     System.out.println("Enter Element");
     obj.element = integer.nextInt();
     obj.push(obj.element);
     break;
    case 2:
     System.out.printf("Poped element is %d", obj.pop());
     break;
    case 3:
     obj.display(obj.st, obj.top);
     break;
    case 4:
     System.exit(0);
    default:
     System.out.println("Wrong option");
   }
  }
 }
