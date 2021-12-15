class Main extends Cat{
    public static void main (String[] args){
        Cat obj = new Cat();//Since abstract class cannot be instantiated, We can't make object of abstract class Animal & Dog.
                            //Thus, we have to make object of either class Cat or Main.
        obj.eat();
        obj.sound();
    }

}
