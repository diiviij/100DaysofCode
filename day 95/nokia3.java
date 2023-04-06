import java.util.Scanner;
import java.util.*;

public class nokia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a2 = sc.nextInt(); int a3 = sc.nextInt(); int n = sc.nextInt();
        int d = a3-a2;
        int sum = a2+(n-2)*d;
        System.out.println(sum);
    }
}
