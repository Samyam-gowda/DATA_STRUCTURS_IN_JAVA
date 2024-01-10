public class lab3a {
    public static void main(String args[]){
        int[] array = {1,1,2,2,3,4,4,4,5,5};
        int[] array1 = new int[array.length];
        int j = 0;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                array1[j++] = array[i];
            }
        }
        array1[j] = array[array.length-1];
        System.out.print("original array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("after deleleting duplicate: ");
        for(int i = 0; i < j; i++){
            System.out.print(array1[i] + " ");
        }
    }    
}
