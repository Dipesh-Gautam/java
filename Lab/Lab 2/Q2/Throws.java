public class Throws {
    void Divide(int b) throws ArithmeticException{
        int a = 23;
        int c = a/b;
        System.out.println(c);
    }
   public static void main(String[] args){
   Throws obj = new Throws();
   obj.Divide(0);


   }

}
