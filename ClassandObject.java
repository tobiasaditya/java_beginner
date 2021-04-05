public class ClassandObject{
    public static void main(String[] args){
        
        class Number{
            int nomor;
            
            public boolean isNegative(){
                if (nomor<0){
                    return true;
                } 
                else{
                    return false;
                }
            }
            
        }
        
        Number tes = new Number();
        tes.nomor = 2;
        
        System.out.println(tes.isPositive());
        
    }
}