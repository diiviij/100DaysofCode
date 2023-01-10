public class CreateDoublyLinkedList {    
  
    //Create a node for doubly linked list    
    class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }    
    }    
  
    //Initialize head and tail for the doubly linked list    
    Node head = null;  
    Node tail = null;    
  
    //Create addNewNode() method to add a node into a list   
    public void addNewNode(String data) {    
  
        //Create node    
        Node newNode = new Node(data);    
  
        //Check whether our doubly linked list is empty or not   
        if(head == null) {  
            //The newNode is pointed by both head or tail   
            head = newNode;  
            tail = newNode;  
            //It is first node so prev will point to null    
            head.prev = null;    
            //It is also last node so tail's next will point to null    
            tail.next = null;    
        }  
        //Execute when the doubly linked list is not empty  
        else {    
  
            //The newly created node will be the last node, so now tail's next will point to that newly created node  
            tail.next = newNode;    
            //The tail is pointing to the second last node so the newly created node's prev will point to tail    
            newNode.prev = tail;    
            //The newly created node will become new tail because it is last node in the doubly linked list   
            tail = newNode;    
            //The newly created node will be the last node so tail's next will be null    
            tail.next = null;    
        }    
    }    
  
     
    public void showData() {  
           
        Node current = head;    
        
        if(head == null) {  
            
            System.out.println("List is empty");    
            return;    
        }  
        //Print a statement  
        System.out.println("Nodes of doubly linked list: ");    
      
        while(current != null) {    
             
            System.out.print(current.data + "\n");    
            current = current.next;    
        }    
    }    
  
    public static void main(String[] args) {    
  
        CreateDoublyLinkedList obj = new CreateDoublyLinkedList();    
  
        //Add nodes into the doubly linked list   
        obj.addNewNode("New York");    
        obj.addNewNode("Los Angeles");    
        obj.addNewNode("Chicago");    
        obj.addNewNode("Houston");    
        obj.addNewNode("Houston");    
  
        obj.showData();    
    }    
}  
