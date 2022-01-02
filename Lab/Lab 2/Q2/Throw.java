public class Throw {
    public static void main(String[] args){
       int age = 17; 
       if (age < 18){
           throw new ArithmeticException("Can't vote.");
       }
       else 
       System.out.println("Can vote. ");
    }
}
