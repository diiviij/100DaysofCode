package self;

class LASolution extends Thread{
    public void run()
    {
        try{
            System.out.println("Numbers between 1-100 Divisible by 7 and 11");
            for(int i=1;i<=100;i++) {

                if (i % 7 == 0 && i % 11 == 0) {
                    System.out.print(i + " ");
                }
            }
                System.out.println("\nNumbers between 1-100 Divisible by 5 or 13");
                for(int i=1;i<100;i++){
                if(i%5==0 || i%13==0){
                    System.out.print(i+" ");
                }
                Thread.sleep(100);
            }
        }catch(Exception e)
        {
            System.out.println("Exception occured::"+e);
        }
    }

}

public class LabActivityQ2 {
    public static void main(String[] args) {
        LASolution ob=new LASolution();
        ob.setName("Solution");
        System.out.println("Name of the Thread::"+ob.getName());
        ob.start();
    }

}
