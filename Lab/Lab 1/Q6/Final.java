final class Final{  //thid ensures that it cannot be extended to other class.
    public static void main(String[] args) {
        final double PI = 3.1415;//this value cannot be changed.It's constant.
        int radius = 9;
        double area = PI*radius*radius;
        System.out.println("The area of circle is:"+area+".");
    }
   }