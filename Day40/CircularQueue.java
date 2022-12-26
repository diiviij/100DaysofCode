import java.io.*;
class CircularQ
{
    int Q[] = new int[100];
    int n, front, rear;
    static BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));
    public CircularQ(int nn)
    {
        n=nn;
        front = rear = 0;
    }
    public void add(int v)
    {
        if((rear+1) % n != front)
        {
            rear = (rear+1)%n;
            Q[rear] = v;
        }
        else
            System.out.println("Queue is full !");
    }
    public int del()
    {
        int v;
        if(front!=rear)
        {
            front = (front+1)%n;
            v = Q[front];
            return v;
        }
        else
            return -9999;
    }
    public void disp()
    {
        int i;
        if(front != rear)
        {
            i = (front +1) %n;
            while(i!=rear)
            {
                System.out.println(Q[i]);
                i = (i+1) % n;
            }
        }
        else
            System.out.println("Queue is empty !");
    }
    public static void main(String args[]) throws IOException
    {
        System.out.print("Enter the size of the queue : ");
        int size = Integer.parseInt(br.readLine());
        CircularQ call = new CircularQ(size);
        int choice;
        boolean exit = false;
        while(!exit)
        {
            System.out.print("\n1 : Add\n2 : Delete\n3 : Display\n4 : Exit\n\nYour Choice : ");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1 :
                    System.out.print("\nEnter number to be added : ");
                    int num = Integer.parseInt(br.readLine());
                    call.add(num);
                    break;
                case 2 :
                    int popped = call.del();
                    if(popped != -9999)
                        System.out.println("\nDeleted : " +popped);
                    else
                        System.out.println("\nQueue is empty !");
                    break;
                case 3 :
                    call.disp();
                    break;
                case 4 :
                    exit = true;
                    break;
                default :
                    System.out.println("\nWrong Choice !");
                    break;
            }
        }
    }
}
