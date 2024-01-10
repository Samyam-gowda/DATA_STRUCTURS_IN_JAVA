import java.util.*;
class lab4{
    int[][] array1;
    int  row, column;
    String str;
    lab4(int row,int col,String str){
        this.row  = row;
        this.column = col;
        array1 = new int[row][col];
        this.str = str;
    }
    public void read(){    
        Scanner input  = new Scanner(System.in);
        for(int i = 0 ;i < this.row; i++){
            for(int j = 0;j < this.column; j++){
                array1[i][j] = input.nextInt();
            }}}
    public void average(){
         for(int i = 0 ;i < this.row; i++){
            System.out.println("Average of student "+(i+1)+"  is:     "+((array1[i][0]+array1[i][1]+array1[i][2])/3));
         }System.out.println(" ");
        }
    public void minimum(){
        for(int i = 0; i <this.row;i++ ){
            Arrays.sort(array1[i]);
            System.out.println("THe Minimun marks of student  "+(i+1)+"  is:   "+array1[i][0]);
        }System.out.println(" ");
    }
     public void maximum(){
        for(int i = 0; i <this.row;i++ ){
            Arrays.sort(array1[i]);
             System.out.println("THe Maximun marks of student  "+(i+1)+"  is:   "+array1[i][this.column-1]);
        }System.out.println(" ");}
    public void display(){
        System.out.println("The marks of  "+this.str+" subject is :\n");
     for(int i = 0 ;i < this.row; i++){
            for(int j = 0;j < this.column; j++){
                System.out.print(array1[i][j]+"   ");
            }
        System.out.println(" ");
    }System.out.println(" ");}  
    // main 
     public static void main(String[] args) {
    lab4 obj = new lab4(5,3,"MATHS");
    System.out.println("Enter the marks of student");
        obj.read();
       obj.display();
       obj.average();
       obj.minimum();
       obj.maximum();
     }}
//     
// import java.util.*;
// class lab4{
//     int[][] array1;
//     int size;
//     lab4(int size){
//         array1 = new int[size][size];
//         this.size  = size;
//     }
//  public void read(){    
//         Scanner input  = new Scanner(System.in);
//         for(int i = 0 ;i < this.size ;i++){
//             for(int j = 0;j < this.size; j++){
//                 array1[i][j] = input.nextInt();
//             }}}
// public void display(){
//     System.out.println("MATRIX IS");
//      for(int i = 0 ;i < this.size; i++){
//             for(int j = 0;j < this.size; j++){
//                 System.out.print(array1[i][j]+"   ");
//             }
//         System.out.println(" ");
//      }System.out.println();}
// public void uppertri(){
//     System.out.println("UPPER TRIANGULAR MATRIX");
//     for(int i = 0 ;i < this.size; i++){
//             for(int j = 0;j < this.size; j++){
//                 if(j>=i){
//                 System.out.print(array1[i][j]+" ");
//                 }
//                 else{
//                     System.out.print(" " + " ");
//                 }
//             }
//         System.out.println();
//     }System.out.println();
// }
// public void lowertri(){
//     System.out.println("LOWER TRIANGULAR MATRIX");
//     for(int i = 0 ;i < this.size; i++){
//             for(int j = 0;j < this.size; j++){
//                 if(j<=i){
//                 System.out.print(array1[i][j]+" ");
//                 }
//                 else{
//                     System.out.print(" " + " ");
//                 }
//             }
//         System.out.println();
//     }System.out.println();
// }

// public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     System.out.println("Enter the size of matrix");
//     int size = input.nextInt();
//     lab4 obj1 = new lab4(size);
//     System.out.println("ENTER ARRAY ELEMENTS");
//     obj1.read();
//     obj1.display();
//     obj1.uppertri();
//     obj1.lowertri();
    
// }}
// import java.util.*;
// class lab4{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("ENTER THE STRING");
//         String str = input.nextLine();
//         System.out.println("ENTER THE SEARCH CHARACTER");
//         char ch = input.next().charAt(0);
//         int startfrom = 0,count = 0;
//         for(int i = 0; i<str.length();i++){
//             int index = str.indexOf(ch,startfrom);
//             if(index >= 0){
//                 count  = count + 1;
//                 startfrom = index + 1;

//             }
           
//         }
//         System.out.println("NO OF OCCURRENCES OF "+ch+ "  is :- " + count);

//     }
// }