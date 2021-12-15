interface Class2 {
    default void Result2()// abstract method doesn't have body. So, to give body to it, we should make  default method.
    {
        System.out.println("It's Class2");
    }
}