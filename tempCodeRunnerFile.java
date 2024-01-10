import java.util.*;
public class lab3{
    String course_name = "";
    int[] marks;
    lab3(String course_name){
        this.course_name =course_name;
        this.marks = new int[5];
    }
    public  void addmarks(int index,int mark){
        this.marks[index] = mark;
    }
    public int  avreage(){
        int sum =0;
        for(int i=0;i < this.marks.length;i++){
            sum = sum +this.marks[i];
        }
         int avg = sum/this.marks.length;
            return avg;
    }

    public int  mininum(){
        Arrays.sort(this.marks);
        return this.marks[0];
    }
    public int maximum(){
        Arrays.sort(this.marks);
        return this.marks[4];
    }
    public void display(){
        System.out.println("GRADE REPORTS FOR  " +this.course_name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("STUDENT "+(i+1)+"  MARKS  IS:  "+this.marks[i]);
        }
        System.out.println(" AVERAGE OF CLASS IS: " +avreage());
        System.out.println("MINIMUN MARKS :" +mininum());
        System.out.println("MAXIMUM MARKS :" +maximum());

    }
    public static void main(String[] args) {
        lab3 a = new lab3("MATHS");
        a.addmarks(0, 100);
        a.addmarks(1, 89);
        a.addmarks(2, 74);
        a.addmarks(3, 86);
        a.addmarks(4, 58);
        a.display();
    }

}