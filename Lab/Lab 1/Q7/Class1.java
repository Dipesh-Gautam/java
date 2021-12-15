interface Class1{
    public void Cat();//In interface , method can't have body.
                      //Also method can't use protected access specifier. 
    default void Dog(){//Inorder to give body to method in interface class ,we should make default method. 
        System.out.println("Dog : Vow Vow");
    }
     
}