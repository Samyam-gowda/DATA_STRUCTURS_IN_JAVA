
import java.util.*;
interface staff{
   
    public static final String First_name = "samyam";
   public static final String Last_name = "samyam";
   public static final int age= 20;
    public void get_info();
}
class teaching_staff implements staff{
   
    public void get_info(){
        System.out.println(First_name + " " +Last_name);
        System.out.println("AGE = "+ age);
    }

}

public class i{
    public static void main(String[] args) {
    teaching_staff obj1 = new teaching_staff();
    obj1.get_info();
    }
} 
