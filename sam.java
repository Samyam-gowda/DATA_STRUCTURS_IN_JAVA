import java.util.Scanner;

public class sam{
    public static void sum(int a, float b){
        System.out.println(a + " " + b);
    }
    public static void sum(double a, String s){
        System.out.println(a + " " + s);
    }
    public static void main(String[] args) {
        sum(1,2.2f);
        sum(10.2, "a");
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        System.out.println(s);
 

    }

}
