package Test7Hunts;
import java.util.Scanner;
import java.text.DecimalFormat;
class circlearea
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("1. If the radius is known");
        System.out.println("2. If the diameter is known");
        System.out.println("3. If the circumference is known");
        int ch=sc.nextInt();
        double area=0;
        switch(ch)
        {
            case 1:
                {
                    double r=sc.nextDouble();
                    area=Math.PI*r*r;
                    break;
                }
            case 2:
                {
                    double d=sc.nextDouble();
                    area=Math.PI*(d/2)*(d/2);
                    break;
                }
            case 3:
                {
                    double c=sc.nextDouble();
                    area=Math.PI*(c/(2*Math.PI))*(c/(2*Math.PI));
                    break;
                }
        }
        sc.close();
        System.out.println("The area of the circle is: "+df.format(area));
    }
}
