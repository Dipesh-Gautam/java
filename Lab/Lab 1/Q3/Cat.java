public class Cat extends Dog{/*Dog has overrode one abstract method of class Animal & here class Cat has overrode another abstract method . 
                            As every abstract method is overrode, so this class no longer has to remain abstract.*/ 
    public void sound(){
        System.out.println("Cat sound : meow meow");
    }
}