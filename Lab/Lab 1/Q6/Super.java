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