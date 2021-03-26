import java.util.*;

public class ArraytipeList{
    public static void main(String[] args){
        List countries = new ArrayList();
        
        //List add langsung define valuenya
        countries.add("Indonesia");
        countries.add("Singapore");
        countries.add("Australia");
        
        //Harus diconvert ke string untuk print, soalnya dia ArrayList, kalo ga jadi ga kebaca
        System.out.println(countries.toString());
        
        //List remove, define index dari elemen yang mau diremove.
        countries.remove(1);
        countries.add("Malaysia");
        
        System.out.println(countries.toString());
        
        //Untuk dapetin 1 elemen di list pake .get(**index**)
        System.out.println(countries.get(2));
        
        //Untuk dapetin jumlah elemen di list pake size()
        System.out.println(countries.size());
        
        
        
        
    }
}