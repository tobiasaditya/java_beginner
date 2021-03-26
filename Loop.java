import java.util.*;

public class Loop{
    public static void main(String[] args){
        int x = 1;
        //While loop
        while (x<=10){
            x+=1;
            if (x%2==0){
                System.out.println(x);
            }
        }
        
        //For loop traingular numbers
        for (int y = 1;y<=10; y++){
            System.out.println(y*(y+1)/2);
        }
        
        //Looping an array and arraylist
        String[] familyMembers={"Arifin","Soesianni","Samuel","Tobias"};
        
        for (String name : familyMembers){
            System.out.println(name);
        }
        
        //Untuk list, perlu di define type elementnya pake <type>
        List<String> list = new ArrayList<String>();
        
        
        list.add("Arifin");
        list.add("Soesianni");
        list.add("Samuel");
        list.add("Tobias");
        
        for (String name : list){
            System.out.println(name);
        }
        
        
    }
}