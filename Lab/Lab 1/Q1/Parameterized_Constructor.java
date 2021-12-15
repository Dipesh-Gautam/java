class Parameterized_Constructor {
    public Parameterized_Constructor(int a, int b){ //parameterized constructor
        System.out.println("a+b = "+(a+b));
    }
    public static void main(String[] args){
        Parameterized_Constructor obj = new Parameterized_Constructor(1,2);
    }
}