class Overloading
{
    private String name;
    private String Day;
    private int temp;
    Overloading()
    {
        name="Argentina";
        temp=29;
        System.out.println(name+" Yesterday Temperature: "+temp+"\u00B0");
    }
    Overloading(String name, int temp)
    {
        this.name=name;
        this.temp=temp;
        System.out.println(name+" Today Temperature: "+temp+"\u00B0");
    }
    Overloading(String name,String Day,int temp)
    {
        this.name=name;
        this.Day=Day;
        this.temp=temp;
        System.out.println(name+" "+Day+" Temperature: "+temp+"\u00B0");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        int t1=sc.nextInt();
        String n2=sc.next();
        String d=sc.next();
        int t2=sc.nextInt();
        Overloading ob1=new Overloading();
        Overloading ob2=new Overloading(n1,t1);
        Overloading ob3=new Overloading(n2,d,t2);
        
    }
}
