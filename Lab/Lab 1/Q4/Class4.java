class Class4 extends Class1 implements Class2,Class3 {// Since Class1 is extended and interface Class2 and Class3 are implemented here in Class4 at a time, it's like multiple inheritance.

public void Result3(){// Result3 is overrode here.
    System.out.println("It's Class3");
}
public static void main(String[] args){
        
        Class4 obj = new Class4();//object created
        obj.Result1();
        obj.Result2();
        obj.Result3();
    }
}
