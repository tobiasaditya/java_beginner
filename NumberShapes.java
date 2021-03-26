import java.util.*;
import java.lang.Math; 

public class NumberShapes {
    public static void main(String args[]) {
        
        class Number{
            int number;
            
            public boolean isTriangular(){
                //Cek apakah triangular
                int x = 1;
                int y = 0;
                
                
                while (y<number){
                    y = y+x;
                    x++;
                    
                }
                if (y == number){
                    return true;
                } else{
                    return false;
                }
            
                
            }
            //Triangular = ditambah increment 1 (n*(n+1)/2)
            //Square = ditambah increment 2 (mulai dari ganjil), sama hasil kuadrat dari suatu bilangan!
            
            //Cek apakah dia square
            public boolean isSquare(){
                double square_root = Math.sqrt(number);
                
                
                if (square_root%1 == 0){
                    return true;
                }
                else{
                    return false;
                }
            
                
            }
            
            
            
        }
    
    Number myNumber = new Number();
    myNumber.number = 49;
    
    System.out.println(myNumber.isSquare());
    System.out.println(myNumber.isTriangular());
    
        
        
        
      

      
    }
}