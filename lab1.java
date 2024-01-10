/*import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if(n < 0)
        {
            System.out.println( n+ " is negative");
        } 
        else{
            System.out.println(n+ " is positive");
        }
        
    }
}

import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        int n,rev = 0;
        System.out.println("Enter the no");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n != 0) {
        rev = (rev*10) + (n%10);
        n = n / 10;
        
    }
System.out.println("The reverse of entered o is: "+rev);
}
}

import java.util.Scanner;
public class lab1{
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }  
    public static void main(String[] args) {
        System.out.println("Enter the no  :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = fact(n);
        System.out.println("Factorial of "+n+" is "+ans);
        }
}
/
import java.util.Scanner;
public class lab1 {

    public static int fibb(int first,int second,int n){
        int next;
      
        if(n == 0){
            return 0;
        }
        else{
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
                n = n - 1;
            return fibb(first,second,n);
        
            
        }    
        
    }

public static void main(String[] args) {
int first = 0,second = 1;
System.out.println(first);  
System.out.println(second);
int n = 5;
fibb(first, second, n);  
}
}
import java.util.Scanner;
public class lab1 {

    public static void table(int n){
        for(int i = 0;i <= 10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        int t;
        System.out.println("enter the req table");
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        table(t);
    }
}
import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char ch = str.charAt(2);
        System.out.println(ch);
        System.out.println("the entered string is " +str ); 
    }
} 
import java.util.Scanner;
public class lab1 {

    

    public static void leapyear(int n){
    if(n%400 == 0){
        System.out.println(n+" is leap year");
    }
    else if(n%100 == 0){
        System.out.println(n+ " is not a leap year"); 
    }
    else if(n%4== 0){
        System.out.println(n+" is leap year");
    }
    else{
        System.out.println(n+" is invalid input");
    }}

    public static void main(String[] args) {
    leapyear(2020);

    }
}
 
import java.util.Scanner;
public class lab1 {

    public static void reverse(String s){
        
        for (int i = (s.length()-1); i >= 0; i--) {
            System.out.print(s.charAt(i));
            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        reverse(s);
    }
}
import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
            System.out.println(array[i]);
            
        }
    }
}
import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        int[][] array1 = {{1,1,1},{2,2,2},{3,3,3}}; 
        int[][] array2 = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] array3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = 0;
                for(int k =0; k < 3;k++){
                    array3[i][j] = array3[i][j] + array1[i][k]*array2[k][j];
                }
System.out.print(array3[i][j]+" ");
                
            }
            System.out.println();
            
        }
        
    }
}
import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        // System.out.println(s.charAt(0));
        int open =0,close=0;
        for (int i = 0; i < (s.length()); i++) {
            // char c = s.charAt(i);
            // System.out.println(s.charAt(i));
            if (s.charAt(i) == '{') {
                open = open + 1;
            }
            else if(s.charAt(i) == '}') {
                close = close + 1;
            }
            else{
                System.out.print("");
            }
        }
    if (open == close) {
        System.out.println("equal");
        
    }
    else{
        System.out.println("not equal");
    }
    }
}

import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input  = new Scanner(System.in);
        String str = input.nextLine();
        String rev = "";
        
        int n = str.length();
    for (int i = (n-1);i>=0; i--) {
        rev = rev +str.charAt(i); 
    }
    int k=0,j =0; 
      System.out.println(rev); 
      while (j < str.length()) {
        
      if(str.charAt(j)==rev.charAt(j)){
        j = j+1; 
        k = k +1;
    }
    else{
        System.out.println("not palin");
        break;
    }     
        } 
    if(k == str.length()){
        System.out.println("is palen");
    } 
}

    }

import java.util.*;
public class lab1 {
    float saleryee;
    String Firstname;
    String Lastname;
    lab1(String fname,String sname,float salery){
        this.Firstname = fname;
        this.Lastname = sname;
        this.saleryee = salery;
    }
    public void setinfo(){
        if(this.saleryee <= 0 ){
            System.out.println("");
        }
        else{
            System.out.println("employee salery is :"+this.saleryee);
        }
    }
    public  void getinfo(double time){
        System.out.println("employee work hours : "+time );
    }
    public void hike(){
        System.out.println("Salary arfer hike:  "+(0.1*this.saleryee+this.saleryee));
    }
    public static void main(String[] args) {
        lab1 obj1 = new lab1("samyam","gowda",1500);
        lab1 obj2 = new lab1("xadada","sasa",10000);
        obj1.setinfo();
        obj2.setinfo();
        obj1.getinfo(100.00);
        obj2.getinfo(120.0);
        obj1.hike();
        obj2.hike();
    }
}*/

import java.util.*;
public class lab1 {
    double real,imaginary;

    lab1(double real_part,double imaginary_part){
        this.real = real_part;
        this.imaginary = imaginary_part;

    }
    public  void show(){
        System.out.println(this.real+ "  +  " +this.imaginary+"i");
    }
    public static lab1 add(lab1 n1,lab1 n2){
        lab1 result = new lab1(0, 0);
        result.real = n1.real + n2.real;
        result.imaginary = n1.imaginary +n2.imaginary;
        return result;
    }
    public static lab1 sub(lab1 n1,lab1 n2){
        lab1 result = new lab1(0,0);
        result.real = n1.real - n2.real;
        result.imaginary = n1.imaginary - n2.imaginary;
        return result;
    }
    public static lab1 mull(lab1 n1, lab1 n2){
        lab1 result = new lab1(0,0);
        result.real = (n1.real*n2.real - n1.imaginary*n2.imaginary);
        result.imaginary = (n1.real*n2.imaginary + n1.imaginary*n2.real);
        return result;
    }
    public static lab1 div(lab1 n1,lab1 n2){
        lab1 result = new lab1(0,0);
        result.real = ((n1.real*n2.real + n1.imaginary*n2.imaginary)/(n2.real*n2.real + n2.imaginary*n2.imaginary));
        result.imaginary = ((n1.imaginary*n2.real - n1.real*n2.imaginary)/(n2.real*n2.real + n2.imaginary*n2.imaginary));
        return result;
    }
    public static void main(String[] args) {
        lab1 obj1 = new lab1(3,13);
        lab1 obj2  = new lab1(7,17);
        System.out.print("FIrst complex no is  :");
        obj1.show();
        System.out.print("Second complex no is :");
        obj2.show();
        System.out.print("Addition of 2 complex  no is :");
        lab1 add = add(obj1,obj2);
        add.show();
        System.out.print("Substraction of 2 complex no is :");
        lab1 sub = sub(obj1,obj2);
        sub.show();
        System.out.print("multiplication of 2 complex no is :");
        lab1 mul = mull(obj1,obj2);
        mul.show();
        System.out.print("Division of 2  complex no is :");
        lab1 div = div(obj1,obj2);
        div.show();
    }

}

