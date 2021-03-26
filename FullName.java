public class FullName{
    public static void main(String[] args){
        String firstName = "Tobias";
        String lastName = "Aditya";
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        int fullNameLength = firstNameLength+lastNameLength;
        
        //decimal pake double aja
        //String bukan primitive kayak int, float, double
        
        //Concatenate gini bisa selama variabelnya tipe primitive, jadi ga harus string kayak Python
        System.out.println("The number characters in my full name is " + fullNameLength);
    }
}