
public class IfStatement {
    public static void main(String args[]) {
      
        
        int[] array = {9,9};
        
        
        if (array[1] > array[0]){
            System.out.println("2nd index is greater");
        }
        
        else if (array[0]>array[1]){
            System.out.println("1st index is greater");
            
        }
        
        //Struktur kalo pake eiif
        else if (array[1]==array[0]){
            System.out.println("Equal");
        }
        
        

    }
}