import java.util.Scanner;
public class gartestof3 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter three nos");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        input.close();

        if (a > b) {
            if (a > c) {
                System.out.println(a+" is gratest");
            }}
        else if(b > c) {
            System.out.println(b+" is gratest");

        }
        else{
            System.out.println(c+" is gratest");
        }
        }
    }

    

