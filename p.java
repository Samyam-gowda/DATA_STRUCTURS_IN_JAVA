
import java.util.*;

class staff{
    String First_name,Last_name;
    int age;
    staff(String First_na ,String Last_na , int age){
        this.First_name = First_na;
        this.Last_name = Last_na;
        this.age = age;
    }
    public void get_info(){
        System.out.println(this.First_name + " " + this.Last_name);
        System.out.println("AGE = "+ this.age);
        
        System.out.println("iam get method in parent class");
    }
}
class teaching_staff extends staff{
    String name;
    teaching_staff(String First_na ,String Last_na , int age, String name){
        
        super(First_na, Last_na, age);
    }
    public void get_info(){
        System.out.println(this.First_name + " " + this.Last_name);
        System.out.println("AGE = "+ this.age);
        System.out.println(this.age);
        System.out.println("iam get method in childclass class");
    }

}
public class p {
    public static void main(String[] args) {
    teaching_staff obj1 = new teaching_staff("samyam", "gowda ", 90, "xhx");
    obj1.get_info();
    
} 
    
}


