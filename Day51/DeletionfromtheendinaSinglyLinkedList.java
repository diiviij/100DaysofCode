import java.lang.*;

class LinkedList {
    Node head;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }


    public void deleteLast()
    {
        if (head == null){
            System.out.println("List is empty, not possible to delete");
            return;
        }

        // if LL has only one node
        if(head.next == null)
        {
            System.out.println("Deleted: " + head.data);
            head = head.next;
        }
        Node previous = null;
        Node temp = head;
        // else traverse to the last node
        while (temp.next != null)
        {
            // store previous link node as we need to change its next val
            previous = temp;
            temp = temp.next;
        }
        // Curr assign 2nd last node's next to Null
        System.out.println("Deleted: " + temp.data);
        previous.next = null;
        // 2nd last now becomes the last node

    }

    public Node insert(int data)
    {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);
        // assigning this newNode's next as current head node
        newNode.next = head;

        // re-assigning head to this newNode
        head = newNode;

        return head;
    }

    public void display()
    {
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("\n");
    }
}

public class Main
{
    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insert(12);
        ll.insert(11);
        ll.insert(10);
        ll.insert(9);
        ll.insert(8);
        ll.insert(7);

        ll.display();

        ll.deleteLast();
        ll.deleteLast();
        ll.deleteLast();
        ll.display();

    }
}
