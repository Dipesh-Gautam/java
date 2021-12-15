Due Date : 16/12/2021 
Submitted date: 15/12/2021


Q.1) Write a program to demonstrate all three types of constructor in java.
--
Three types of constructor in java are :
1)Default constructor
2)No-arg constructor
3)Parameterized constructor


#Default constructor
-- 
    class Constructor {
        int a=5 ;
        public static void main(String[] args){
            Constructor obj = new Constructor(); //Default constructor
            System.out.println("a = "+obj.a);
            }
    }
    
        
#no-arg constructor
--
   class No_Arg_Constructor {
    public No_Arg_Constructor(){ //no-arg constructor
        System.out.println("No Paramater or Argument Constructor.");
    }

    public static void main(String[] args) {
        No_Arg_Constructor obj = new No_Arg_Constructor();
    }
}



#Parameterized constructor
--
    class Parameterized_Constructor {
        public Parameterized_Constructor(int a, int b){ //parameterized constructor
            System.out.println("a+b = "+(a+b));
        }
        public static void main(String[] args){
            Parameterized_Constructor obj = new Parameterized_Constructor(1,2);
    }
    }
-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.2) Write a program to implement stack using array.
--
import java.util.*;

class Stack {
	Scanner scanInput= new Scanner(System.in);

	int top, size, stack[];

	Stack (int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
		System.out.println("Stack memory of size " + size + " is allocated!\n");
	}

	boolean isFull() {
		return (top == (size - 1));
	}

	boolean isEmpty() {
		return (top == -1);
	}

	public void push () {
		if (isFull()) {
			System.out.println("Stack is full!\n");
		}
		else {
			System.out.println("Enter a data to push: ");
			int data = scanInput.nextInt();

			stack[++top] = data;
			System.out.println(stack[top] + " is inserted into the stack!\n");
		}
	}

	public void pop () {
		if (isEmpty()) {
			System.out.println("Stack is empty!\n");
		}
		else {
			System.out.println(stack[top--] + " is popped out of the stack!\n");
		}
	}

	public void peek () {
		if (isEmpty()) {
			System.out.println("Stack is empty!\n");
		}
		else {
			System.out.println("Data at peek is = " + stack[top] + "\n");
		}
	}
}

class Stack_Implementation {
	public static void main(String[] args) {
		Scanner scanInput= new Scanner(System.in);

		int size = 0, menuId = -1, data;

		while (size <= 0) {
			System.out.println("Enter the desired size of stack (size > 0)*\n");
			size = scanInput.nextInt();

			if (size <= 0)
				System.out.println ("Enter a valid size!\n");
		}

		Stack s1 = new Stack(size);

		while (menuId != 0) {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\nChoose an option from menu (0 - 3)\n");
			menuId = scanInput.nextInt();

			switch (menuId) {
				case 0:
					break;
				case 1:
					s1.push();
					break;
				case 2:
					s1.pop();
					break;
				case 3:
					s1.peek();
					break;
				default:
					System.out.println("Enter a valid Input!\n");
			}
		}
		System.out.println ("Program ended!!!\n");
	}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.3) Write a program to implement uses of abstract class.
--
Abstract class is used in abstraction to achieve security(data hiding). An abstract keyword is used to create abstract class and method. Abstract class can't be instantiated.


abstract class Animal {//Since this class contains abstract method class Animal is also abstract.
    public abstract void eat() ;//Here method doesn't have body so abstract keyword is used.
    public abstract void sound();
}


abstract class Dog extends Animal { // This class remains abstract because every abstracrt method of class Animal isn't overrode here in class Dog.
    public void eat(){
        System.out.println("Dog eats");
    }
}


public class Cat extends Dog{/*Dog has overrode one abstract method of class Animal & here class Cat has overrode another abstract method . 
                            As every abstract method is overrode, so this class no longer has to remain abstract.*/ 
    public void sound(){
        System.out.println("Cat sound : meow meow");
    }
}


class Main extends Cat{
    public static void main (String[] args){
        Cat obj = new Cat();//Since abstract class cannot be instantiated, We can't make object of abstract class Animal & Dog.
                            //Thus, we have to make object of either class Cat or Main.
        obj.eat();
        obj.sound();
    }

}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.4) Write a program to achieve multiple inheritance in java.
--
Java doesn't support multiple inheritance. However, it can be achieved through interface.


class Class1 {
    protected void Result1() //protected access specifier is used for inheritance
    {
        System.out.println("It's class1");
    }
}


interface Class2 {
    default void Result2()// abstract method doesn't have body. So, to give body to it default access specifier is used.
    {
        System.out.println("It's Class2");
    }}


interface Class3 {
    public void Result3();//abstract method doesn't have body.
}




class Class4 extends Class1 implements Class2,Class3 {// Since Class1 is extended and interface Class2 and Class3 are implemented here in Class4 at a time, it's like multiple inheritance.

public void Result3(){// Result3 is overrode here.
    System.out.println("It's Class3");
}
public static void main(String[] args){
        
        Class4 obj = new Class4();//object created.
        obj.Result1();
        obj.Result2();
        obj.Result3();
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.5) Write a program to find sum and difference of two numbers using command line arguments.
--
class CommandLine {
    public static void main(String args[]){//arguments provided during run time are stored in args array.
        int a = Integer.parseInt(args[0]);//type casting String to integer.
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum = "+(a + b));
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        System.out.println("Difference = "+(c-d));
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.6) Write a program to demonstrate use of this, super and final keywords.

--
final class Final{  //thid ensures that it cannot be extended to other class.
    public static void main(String[] args) {
        final double PI = 3.1415;//this value cannot be changed.It's constant.
        int radius = 9;
        double area = PI*radius*radius;
        System.out.println("The area of circle is:"+area+".");
    }
   }


class Super {
    int value = 3;
   }
   
class Example extends Super {
    int value = 9;
    void display() {
        System.out.println(super.value);// prints super value(value = value from parent class) i.e 20
    }
    void display2(int value){
        this.value = value;//changes to new value 
        System.out.println(this.value);// prints new value i.e 33
    }
   
    public static void main(String[] arg) {
        Example obj = new Example();
        obj.display();//this returns value from the super class that is parent class Super.
        obj.display2(33);//new value is displayed
    }
}  


-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.7) Write a program to demonstrate the use of default method in the interface.

--
interface Class1{
    public void Cat();//In interface method can't have body.
                      //Also method can't use protected access specifier. 
    default void Dog(){//Inorder to give body to method in interface class ,we should make default method. 
        System.out.println("Dog : Vow Vow");
    }
     
}


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

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.8) Write a prgoram to demonstrate the use of static method and static variable.

---
class Static
{
	static int counter;
	static int count;
	public void increment()
	{
		counter++;
	}
	public static int getCounter()
	{
		count++;
		return counter;
	}
    public static void main(String[] args)
	{
		Static count1 = new Static();
		Static count2 = new Static();
		count1.increment();
		System.out.println(Static.getCounter());// when the method and variables are static , classname can be used directly. i.e no need to make object.
		count2.increment(); 
		System.out.println(Static.getCounter());
	}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

