import java.util.*;

public class Maps{
    public static void main(String[] args){
        Map map = new HashMap();
        
        //FOrmatnya (key, value), jadi key Father, valuenya Rico
        map.put("Father","Rico");
        map.put("Mother","Eiza");
        
        
        System.out.println(map.toString());
        
        //Saat nampilin bisa pake key spesifik
        System.out.println(map.get("Father"));
        
        //Untuk nunjukkin ukuran map
        System.out.println(map.size());
        
        
        //Saat remove, cukup masukin keynya aja
        map.remove("Father");
        System.out.println(map.toString());
        
        
        
        
    }
}