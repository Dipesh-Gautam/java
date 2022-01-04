public class Throws {
    public void Divide()throws ArithmeticException{
        System.out.println("Exception will be handled");
        int a = 23 , b = 0;
        int c = a/b;
        System.out.println(c);
    }
   public static void main(String[] args){
   try {
    Throws obj = new Throws();
    obj.Divide();
   }
   catch(ArithmeticException e){
    System.out.println("math error!");

   }
   }

}
