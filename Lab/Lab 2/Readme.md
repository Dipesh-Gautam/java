# Q.1) WAP to demonstrate the use of user defined package in java.
--
    Here I have created package mypackage & class MyPackageClass. 
    While compiling we do javac -d . MyPackageClass.java where -d keyword is use to provide destination to save class file. 
    To keep the package to same directory . is used here.
>   To run : java mypackage.MyPackageClass
>   Output : User Defined Package .

---
# Q.2) WAP to demonstrate Exception handling with all 5 keywords: try, catch, finally, throw and throws.
--
    Error may occur while executing java code due to coding error or wrong input.If there is any error java will stop and generate error message i.e java will throw an exception.There are 5 keywords in java for Exception handling. They are :

    1. try = try keyword is used for testing a block of code for errors while executing.

    2. catch = catch keyword is used to execute a block of code,if an error occurs in try block.  

>   Try and catch keywords come in pairs.

    3. finally = finally keyword is used for executing code.

>   finally block is always executed no matter what i.e even after return.

    4. throw = throw keyword is used for creating custom error. It is used to throw an excetion for a method.It is used inside the method.

    5. throws = throws keyword is used to indicate what exception type may be thrown by a method and it is used with the method signature.

>   multiple exception cannot be thrown but throws can declare multiple exception.

>  throw is followed by an object (new type) while throws is followed by a class.

---