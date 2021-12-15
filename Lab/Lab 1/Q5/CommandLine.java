class CommandLine {
    public static void main(String[] args){//arguments provided during run time are stored in args array.
        int a = Integer.parseInt(args[0]);//type casting String to integer.
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum = "+(a + b));
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        System.out.println("Difference = "+(c-d));
    }
}