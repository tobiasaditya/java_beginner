public class ClassandObject{
    public static void main(String[] args){
        
        class Number{
            int nomor;
            
            public boolean isPositive(){
                if (nomor<0){
                    return false;
                } 
                else{
                    return true;
                }
            }
            
        }
        
        Number tes = new Number();
        tes.nomor = 3;
        
        System.out.println(tes.isPositive());
        
    }
}