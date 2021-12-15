class Class2 implements Class1{
    public void Cat(){//method overriding is done here as every method of interface class should be overridden. 
        System.out.println("Cat : meow meow");
    }
    public static void main(String[] args){
        Class2 obj = new Class2(); // object obj of Class2 of Class2 type is created.
        obj.Dog();
        obj.Cat();
    }
}
