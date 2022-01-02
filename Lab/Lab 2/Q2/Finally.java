public class Finally {
    public static void main(String[] args){
        try {
            int a = 10 , b = 0 , c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("Finally block is executed.");
        }
    }
}
